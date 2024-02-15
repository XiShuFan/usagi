package com.group_finity.mascot.win;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.environment.Environment;
import com.group_finity.mascot.win.jna.Dwmapi;
import com.group_finity.mascot.win.jna.Gdi32;
import com.group_finity.mascot.win.jna.RECT;
import com.group_finity.mascot.win.jna.User32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.LongByReference;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.LinkedHashMap;

class WindowsEnvironment extends Environment {
   private static HashMap<Pointer, Boolean> ieCache = new LinkedHashMap();
   public static Area workArea = new Area();
   public static Area activeIE = new Area();
   private static String[] windowTitles = null;

   private static boolean isIE(Pointer ie) {
      Boolean cachedValue = (Boolean)ieCache.get(ie);
      if (cachedValue != null) {
         return cachedValue;
      } else {
         char[] title = new char[1024];
         int titleLength = User32.INSTANCE.GetWindowTextW(ie, title, 1024);
         String ieTitle = new String(title, 0, titleLength);
         if (!ieTitle.isEmpty() && !ieTitle.equals("Program Manager")) {
            if (windowTitles == null) {
               windowTitles = Main.getInstance().getProperties().getProperty("InteractiveWindows", "").split("/");
            }

            String[] var5 = windowTitles;
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               String windowTitle = var5[var7];
               if (!windowTitle.trim().isEmpty() && ieTitle.contains(windowTitle)) {
                  ieCache.put(ie, true);
                  return true;
               }
            }

            ieCache.put(ie, false);
            return false;
         } else {
            ieCache.put(ie, false);
            return false;
         }
      }
   }

   private static WindowsEnvironment.IEResult isViableIE(Pointer ie) {
      if (User32.INSTANCE.IsWindowVisible(ie) != 0) {
         int flags = User32.INSTANCE.GetWindowLongW(ie, -16);
         if ((flags & 16777216) != 0) {
            return WindowsEnvironment.IEResult.INVALID;
         }

         LongByReference flagsRef = new LongByReference();
         NativeLong result = Dwmapi.INSTANCE.DwmGetWindowAttribute(ie, 14, flagsRef, 8);
         if (result.longValue() != 0L || flagsRef.getValue() != 0L) {
            return WindowsEnvironment.IEResult.INVALID;
         }

         if (isIE(ie) && User32.INSTANCE.IsIconic(ie) == 0) {
            Rectangle ieRect = getIERect(ie);
            if (ieRect.intersects(getScreenRect())) {
               return WindowsEnvironment.IEResult.IE;
            }

            return WindowsEnvironment.IEResult.IE_OUT_OF_BOUNDS;
         }
      }

      return WindowsEnvironment.IEResult.NOT_IE;
   }

   private static Pointer findActiveIE() {
      Pointer ie = User32.INSTANCE.GetWindow(User32.INSTANCE.GetForegroundWindow(), 0);
      Boolean continueFlag = true;

      while(continueFlag && User32.INSTANCE.IsWindow(ie) != 0) {
         switch(isViableIE(ie)) {
         case IE:
            return ie;
         case IE_OUT_OF_BOUNDS:
         case NOT_IE:
            ie = User32.INSTANCE.GetWindow(ie, 2);
            break;
         case INVALID:
            continueFlag = false;
         }
      }

      return null;
   }

   private static Rectangle getIERect(Pointer ie) {
      RECT out = new RECT();
      User32.INSTANCE.GetWindowRect(ie, out);
      RECT in = new RECT();
      if (getWindowRgnBox(ie, in) == 0) {
         in.left = 0;
         in.top = 0;
         in.right = out.right - out.left;
         in.bottom = out.bottom - out.top;
      }

      return new Rectangle(out.left + in.left, out.top + in.top, in.Width(), in.Height());
   }

   private static int getWindowRgnBox(Pointer window, RECT rect) {
      Pointer hRgn = Gdi32.INSTANCE.CreateRectRgn(0, 0, 0, 0);

      byte var3;
      try {
         if (User32.INSTANCE.GetWindowRgn(window, hRgn) == 0) {
            var3 = 0;
            return var3;
         }

         Gdi32.INSTANCE.GetRgnBox(hRgn, rect);
         var3 = 1;
      } finally {
         Gdi32.INSTANCE.DeleteObject(hRgn);
      }

      return var3;
   }

   private static boolean moveIE(Pointer ie, Rectangle rect) {
      if (ie == null) {
         return false;
      } else {
         RECT out = new RECT();
         User32.INSTANCE.GetWindowRect(ie, out);
         RECT in = new RECT();
         if (getWindowRgnBox(ie, in) == 0) {
            in.left = 0;
            in.top = 0;
            in.right = out.right - out.left;
            in.bottom = out.bottom - out.top;
         }

         User32.INSTANCE.MoveWindow(ie, rect.x - in.left, rect.y - in.top, rect.width + out.Width() - in.Width(), rect.height + out.Height() - in.Height(), 1);
         return true;
      }
   }

   private static void restoreAllIEs() {
      User32.INSTANCE.EnumWindows(new User32.WNDENUMPROC() {
         int offset = 25;

         public boolean callback(Pointer ie, Pointer data) {
            WindowsEnvironment.IEResult result = WindowsEnvironment.isViableIE(ie);
            if (result == WindowsEnvironment.IEResult.IE_OUT_OF_BOUNDS) {
               RECT workArea = new RECT();
               User32.INSTANCE.SystemParametersInfoW(48, 0, workArea, 0);
               RECT rect = new RECT();
               User32.INSTANCE.GetWindowRect(ie, rect);
               rect.OffsetRect(workArea.left + this.offset - rect.left, workArea.top + this.offset - rect.top);
               User32.INSTANCE.MoveWindow(ie, rect.left, rect.top, rect.Width(), rect.Height(), 1);
               User32.INSTANCE.BringWindowToTop(ie);
               this.offset += 25;
            }

            return true;
         }
      }, (Pointer)null);
   }

   public void tick() {
      super.tick();
      workArea.set(getWorkAreaRect());
      Rectangle ieRect = getIERect(findActiveIE());
      activeIE.setVisible(ieRect != null && ieRect.intersects(this.getScreen().toRectangle()));
      activeIE.set(ieRect == null ? new Rectangle(-1, -1, 0, 0) : ieRect);
   }

   public void moveActiveIE(Point point) {
      moveIE(findActiveIE(), new Rectangle(point.x, point.y, activeIE.getWidth(), activeIE.getHeight()));
   }

   public void restoreIE() {
      restoreAllIEs();
   }

   public Area getWorkArea() {
      return workArea;
   }

   public Area getActiveIE() {
      return activeIE;
   }

   public String getActiveIETitle() {
      Pointer ie = findActiveIE();
      char[] title = new char[1024];
      int titleLength = User32.INSTANCE.GetWindowTextW(ie, title, 1024);
      return new String(title, 0, titleLength);
   }

   private static Rectangle getWorkAreaRect() {
      RECT rect = new RECT();
      User32.INSTANCE.SystemParametersInfoW(48, 0, rect, 0);
      return new Rectangle(rect.left, rect.top, rect.right - rect.left, rect.bottom - rect.top);
   }

   public void refreshCache() {
      ieCache.clear();
      windowTitles = null;
   }

   private static enum IEResult {
      INVALID,
      NOT_IE,
      IE_OUT_OF_BOUNDS,
      IE;
   }
}
