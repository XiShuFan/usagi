package hqx;

abstract class Hqx {
   private static final int Ymask = 16711680;
   private static final int Umask = 65280;
   private static final int Vmask = 255;

   protected static boolean diff(int c1, int c2, int trY, int trU, int trV, int trA) {
      int YUV1 = RgbYuv.getYuv(c1);
      int YUV2 = RgbYuv.getYuv(c2);
      return Math.abs((YUV1 & 16711680) - (YUV2 & 16711680)) > trY || Math.abs((YUV1 & '\uff00') - (YUV2 & '\uff00')) > trU || Math.abs((YUV1 & 255) - (YUV2 & 255)) > trV || Math.abs((c1 >> 24) - (c2 >> 24)) > trA;
   }
}
