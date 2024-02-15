package com.group_finity.mascot.win;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.image.NativeImage;
import com.group_finity.mascot.win.jna.BITMAP;
import com.group_finity.mascot.win.jna.BITMAPINFOHEADER;
import com.group_finity.mascot.win.jna.Gdi32;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import hqx.Hqx_2x;
import hqx.Hqx_3x;
import hqx.Hqx_4x;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

class WindowsNativeImage implements NativeImage {
   private final BufferedImage managedImage;
   private final Pointer nativeHandle;

   private static Pointer createNative(int width, int height) {
      BITMAPINFOHEADER bmi = new BITMAPINFOHEADER();
      bmi.biSize = 40;
      bmi.biWidth = width;
      bmi.biHeight = height;
      bmi.biPlanes = 1;
      bmi.biBitCount = 32;
      Pointer hBitmap = Gdi32.INSTANCE.CreateDIBSection(Pointer.NULL, bmi, 0, Pointer.NULL, Pointer.NULL, 0);
      return hBitmap;
   }

   private static void flushNative(Pointer nativeHandle, int[] rgb, int scaling) {
      BITMAP bmp = new BITMAP();
      Gdi32.INSTANCE.GetObjectW(nativeHandle, Main.getInstance().getPlatform().getBitmapSize() + Native.POINTER_SIZE, bmp);
      int width = bmp.bmWidth;
      int height = bmp.bmHeight;
      int destPitch = (bmp.bmWidth * bmp.bmBitsPixel + 31) / 32 * 4;
      int destIndex = destPitch * (height - 1);
      int srcColIndex = 0;
      int srcRowIndex = 0;

      for(int y = 0; y < height; ++y) {
         for(int x = 0; x < width; ++x) {
            bmp.bmBits.setInt((long)(destIndex + x * 4), (rgb[srcColIndex / scaling] & -16777216) == 0 ? 0 : rgb[srcColIndex / scaling]);
            ++srcColIndex;
         }

         destIndex -= destPitch;
         ++srcRowIndex;
         if (srcRowIndex != scaling) {
            srcColIndex -= width;
         } else {
            srcRowIndex = 0;
         }
      }

   }

   private static void freeNative(Pointer nativeHandle) {
      Gdi32.INSTANCE.DeleteObject(nativeHandle);
   }

   public WindowsNativeImage(BufferedImage image) {
      int scaling = Integer.parseInt(Main.getInstance().getProperties().getProperty("Scaling", "1"));
      Boolean filter = scaling > 1 && Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Filter", "false"));
      int effectiveScaling = filter ? 1 : scaling;
      this.managedImage = image;
      this.nativeHandle = createNative(this.getManagedImage().getWidth() * scaling, this.getManagedImage().getHeight() * scaling);
      int[] rbgValues = new int[this.getManagedImage().getWidth() * this.getManagedImage().getHeight() * effectiveScaling * effectiveScaling];
      this.getManagedImage().getRGB(0, 0, this.getManagedImage().getWidth(), this.getManagedImage().getHeight(), rbgValues, 0, this.getManagedImage().getWidth());
      if (filter) {
         int width = this.getManagedImage().getWidth();
         int height = this.getManagedImage().getHeight();
         int[] buffer;
         if (scaling == 4 || scaling == 8) {
            width *= 4;
            height *= 4;
            buffer = new int[width * height];
            Hqx_4x.hq4x_32_rb(rbgValues, buffer, width / 4, height / 4);
            rbgValues = buffer;
         }

         if (scaling == 3 || scaling == 6) {
            width *= 3;
            height *= 3;
            buffer = new int[width * height];
            Hqx_3x.hq3x_32_rb(rbgValues, buffer, width / 3, height / 3);
            rbgValues = buffer;
         }

         if (scaling == 2) {
            width *= 2;
            height *= 2;
            buffer = new int[width * height];
            Hqx_2x.hq2x_32_rb(rbgValues, buffer, width / 2, height / 2);
            rbgValues = buffer;
         }

         if (scaling > 4) {
            effectiveScaling = 2;
         }
      }

      flushNative(this.getNativeHandle(), rbgValues, effectiveScaling);
   }

   protected void finalize() throws Throwable {
      super.finalize();
      freeNative(this.getNativeHandle());
   }

   public void update() {
   }

   public void flush() {
      this.getManagedImage().flush();
   }

   public Pointer getHandle() {
      return this.getNativeHandle();
   }

   public Graphics getGraphics() {
      return this.getManagedImage().createGraphics();
   }

   public int getHeight() {
      return this.getManagedImage().getHeight();
   }

   public int getWidth() {
      return this.getManagedImage().getWidth();
   }

   public int getHeight(ImageObserver observer) {
      return this.getManagedImage().getHeight(observer);
   }

   public Object getProperty(String name, ImageObserver observer) {
      return this.getManagedImage().getProperty(name, observer);
   }

   public ImageProducer getSource() {
      return this.getManagedImage().getSource();
   }

   public int getWidth(ImageObserver observer) {
      return this.getManagedImage().getWidth(observer);
   }

   private BufferedImage getManagedImage() {
      return this.managedImage;
   }

   private Pointer getNativeHandle() {
      return this.nativeHandle;
   }
}
