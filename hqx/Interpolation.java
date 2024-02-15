package hqx;

final class Interpolation {
   private static final int Mask4 = -16777216;
   private static final int Mask2 = 65280;
   private static final int Mask13 = 16711935;

   static final int Mix3To1(int c1, int c2) {
      return c1 == c2 ? c1 : (c1 & '\uff00') * 3 + (c2 & '\uff00') >> 2 & '\uff00' | (c1 & 16711935) * 3 + (c2 & 16711935) >> 2 & 16711935 | ((c1 & -16777216) >> 2) * 3 + ((c2 & -16777216) >> 2) & -16777216;
   }

   static final int Mix2To1To1(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 2 + (c2 & '\uff00') + (c3 & '\uff00') >> 2 & '\uff00' | (c1 & 16711935) * 2 + (c2 & 16711935) + (c3 & 16711935) >> 2 & 16711935 | ((c1 & -16777216) >> 2) * 2 + ((c2 & -16777216) >> 2) + ((c3 & -16777216) >> 2) & -16777216;
   }

   static final int Mix7To1(int c1, int c2) {
      return c1 == c2 ? c1 : (c1 & '\uff00') * 7 + (c2 & '\uff00') >> 3 & '\uff00' | (c1 & 16711935) * 7 + (c2 & 16711935) >> 3 & 16711935 | ((c1 & -16777216) >> 3) * 7 + ((c2 & -16777216) >> 3) & -16777216;
   }

   static final int Mix2To7To7(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 2 + (c2 & '\uff00') * 7 + (c3 & '\uff00') * 7 >> 4 & '\uff00' | (c1 & 16711935) * 2 + (c2 & 16711935) * 7 + (c3 & 16711935) * 7 >> 4 & 16711935 | ((c1 & -16777216) >> 4) * 2 + ((c2 & -16777216) >> 4) * 7 + ((c3 & -16777216) >> 4) * 7 & -16777216;
   }

   static final int MixEven(int c1, int c2) {
      return c1 == c2 ? c1 : (c1 & '\uff00') + (c2 & '\uff00') >> 1 & '\uff00' | (c1 & 16711935) + (c2 & 16711935) >> 1 & 16711935 | ((c1 & -16777216) >> 1) + ((c2 & -16777216) >> 1) & -16777216;
   }

   static final int Mix4To2To1(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 5 + (c2 & '\uff00') * 2 + (c3 & '\uff00') >> 3 & '\uff00' | (c1 & 16711935) * 5 + (c2 & 16711935) * 2 + (c3 & 16711935) >> 3 & 16711935 | ((c1 & -16777216) >> 3) * 5 + ((c2 & -16777216) >> 3) * 2 + ((c3 & -16777216) >> 3) & -16777216;
   }

   static final int Mix6To1To1(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 6 + (c2 & '\uff00') + (c3 & '\uff00') >> 3 & '\uff00' | (c1 & 16711935) * 6 + (c2 & 16711935) + (c3 & 16711935) >> 3 & 16711935 | ((c1 & -16777216) >> 3) * 6 + ((c2 & -16777216) >> 3) + ((c3 & -16777216) >> 3) & -16777216;
   }

   static final int Mix5To3(int c1, int c2) {
      return c1 == c2 ? c1 : (c1 & '\uff00') * 5 + (c2 & '\uff00') * 3 >> 3 & '\uff00' | (c1 & 16711935) * 5 + (c2 & 16711935) * 3 >> 3 & 16711935 | ((c1 & -16777216) >> 3) * 5 + ((c2 & -16777216) >> 3) * 3 & -16777216;
   }

   static final int Mix2To3To3(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 2 + (c2 & '\uff00') * 3 + (c3 & '\uff00') * 3 >> 3 & '\uff00' | (c1 & 16711935) * 2 + (c2 & 16711935) * 3 + (c3 & 16711935) * 3 >> 3 & 16711935 | ((c1 & -16777216) >> 3) * 2 + ((c2 & -16777216) >> 3) * 3 + ((c3 & -16777216) >> 3) * 3 & -16777216;
   }

   static final int Mix14To1To1(int c1, int c2, int c3) {
      return (c1 & '\uff00') * 14 + (c2 & '\uff00') + (c3 & '\uff00') >> 4 & '\uff00' | (c1 & 16711935) * 14 + (c2 & 16711935) + (c3 & 16711935) >> 4 & 16711935 | ((c1 & -16777216) >> 4) * 14 + ((c2 & -16777216) >> 4) + ((c3 & -16777216) >> 4) & -16777216;
   }
}
