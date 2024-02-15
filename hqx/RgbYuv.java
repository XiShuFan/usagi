package hqx;

public final class RgbYuv {
   private static final int rgbMask = 16777215;
   private static int[] RGBtoYUV = new int[16777216];

   static int getYuv(int rgb) {
      return RGBtoYUV[rgb & 16777215];
   }

   public static void hqxInit() {
      for(int c = 16777215; c >= 0; --c) {
         int r = (c & 16711680) >> 16;
         int g = (c & '\uff00') >> 8;
         int b = c & 255;
         int y = (int)(0.299D * (double)r + 0.587D * (double)g + 0.114D * (double)b);
         int u = (int)(-0.169D * (double)r - 0.331D * (double)g + 0.5D * (double)b) + 128;
         int v = (int)(0.5D * (double)r - 0.419D * (double)g - 0.081D * (double)b) + 128;
         RGBtoYUV[c] = y << 16 | u << 8 | v;
      }

   }

   public static void hqxDeinit() {
      RGBtoYUV = null;
   }
}
