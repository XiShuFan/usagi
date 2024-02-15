package com.group_finity.mascot.win;

import com.group_finity.mascot.image.NativeImage;
import com.group_finity.mascot.image.TranslucentWindow;
import com.group_finity.mascot.win.jna.BLENDFUNCTION;
import com.group_finity.mascot.win.jna.Gdi32;
import com.group_finity.mascot.win.jna.POINT;
import com.group_finity.mascot.win.jna.RECT;
import com.group_finity.mascot.win.jna.SIZE;
import com.group_finity.mascot.win.jna.User32;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.awt.Graphics;
import javax.swing.JWindow;

class WindowsTranslucentWindow extends JWindow implements TranslucentWindow {
   private static final long serialVersionUID = 1L;
   private WindowsNativeImage image;
   private int alpha = 255;

   public JWindow asJWindow() {
      return this;
   }

   private void paint(Pointer imageHandle, int alpha) {
      Pointer hWnd = Native.getComponentPointer(this);
      if (User32.INSTANCE.IsWindow(hWnd) != 0) {
         int exStyle = User32.INSTANCE.GetWindowLongW(hWnd, -20);
         if ((exStyle & 524288) == 0) {
            User32.INSTANCE.SetWindowLongW(hWnd, -20, exStyle | 524288);
         }

         Pointer clientDC = User32.INSTANCE.GetDC(hWnd);
         Pointer memDC = Gdi32.INSTANCE.CreateCompatibleDC(clientDC);
         Pointer oldBmp = Gdi32.INSTANCE.SelectObject(memDC, imageHandle);
         User32.INSTANCE.ReleaseDC(hWnd, clientDC);
         RECT windowRect = new RECT();
         User32.INSTANCE.GetWindowRect(hWnd, windowRect);
         BLENDFUNCTION bf = new BLENDFUNCTION();
         bf.BlendOp = 0;
         bf.BlendFlags = 0;
         bf.SourceConstantAlpha = (byte)alpha;
         bf.AlphaFormat = 1;
         POINT lt = new POINT();
         lt.x = windowRect.left;
         lt.y = windowRect.top;
         SIZE size = new SIZE();
         size.cx = windowRect.Width();
         size.cy = windowRect.Height();
         POINT zero = new POINT();
         User32.INSTANCE.UpdateLayeredWindow(hWnd, Pointer.NULL, lt, size, memDC, zero, 0, bf, 2);
         Gdi32.INSTANCE.SelectObject(memDC, oldBmp);
         Gdi32.INSTANCE.DeleteDC(memDC);
      }

   }

   public String toString() {
      return "LayeredWindow[hashCode=" + this.hashCode() + ",bounds=" + this.getBounds() + "]";
   }

   public void paint(Graphics g) {
      if (this.getImage() != null) {
         this.paint(this.getImage().getHandle(), this.getAlpha());
      }

   }

   private WindowsNativeImage getImage() {
      return this.image;
   }

   public void setImage(NativeImage image) {
      this.image = (WindowsNativeImage)image;
   }

   public int getAlpha() {
      return this.alpha;
   }

   public void setAlpha(int alpha) {
      this.alpha = alpha;
   }

   public void updateImage() {
      this.repaint();
   }
}
