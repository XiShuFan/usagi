package com.group_finity.mascot.win.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

public interface User32 extends StdCallLibrary {
   User32 INSTANCE = (User32)Native.loadLibrary("User32", User32.class);
   int SM_CXSCREEN = 0;
   int SM_CYSCREEN = 1;
   int SPI_GETWORKAREA = 48;
   int GW_HWNDFIRST = 0;
   int GW_HWNDNEXT = 2;
   int GWL_STYLE = -16;
   int GWL_EXSTYLE = -20;
   int WS_MAXIMIZE = 16777216;
   int WS_EX_LAYERED = 524288;
   int ERROR = 0;
   int ULW_ALPHA = 2;

   int GetSystemMetrics(int var1);

   int SystemParametersInfoW(int var1, int var2, RECT var3, int var4);

   Pointer GetForegroundWindow();

   Pointer GetWindow(Pointer var1, int var2);

   int IsWindow(Pointer var1);

   int IsWindowVisible(Pointer var1);

   int GetWindowLongW(Pointer var1, int var2);

   int SetWindowLongW(Pointer var1, int var2, int var3);

   int IsIconic(Pointer var1);

   int GetWindowTextW(Pointer var1, char[] var2, int var3);

   int GetClassNameW(Pointer var1, char[] var2, int var3);

   int GetWindowRect(Pointer var1, RECT var2);

   int GetWindowRgn(Pointer var1, Pointer var2);

   int MoveWindow(Pointer var1, int var2, int var3, int var4, int var5, int var6);

   int BringWindowToTop(Pointer var1);

   Pointer GetDC(Pointer var1);

   int ReleaseDC(Pointer var1, Pointer var2);

   int UpdateLayeredWindow(Pointer var1, Pointer var2, POINT var3, SIZE var4, Pointer var5, POINT var6, int var7, BLENDFUNCTION var8, int var9);

   boolean EnumWindows(User32.WNDENUMPROC var1, Pointer var2);

   public interface WNDENUMPROC extends StdCallCallback {
      boolean callback(Pointer var1, Pointer var2);
   }
}
