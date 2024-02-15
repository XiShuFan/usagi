package hqx;

public class Hqx_4x extends Hqx {
   public static void hq4x_32_rb(int[] sp, int[] dp, int Xres, int Yres) {
      hq4x_32_rb(sp, dp, Xres, Yres, 48, 7, 6, 0, false, false);
   }

   private static final void case0(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case2(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case16(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case64(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case8(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case3(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case6(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case20(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case144(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
   }

   private static final void case192(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
   }

   private static final void case96(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case40(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case9(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case66(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case24(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case7(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case148(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
   }

   private static final void case224(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
   }

   private static final void case41(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
   }

   private static final void case67(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case70(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case28(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case152(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
   }

   private static final void case194(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
   }

   private static final void case98(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case56(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
      dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   private static final void case25(int[] dp, int dpIdx, int dpL, int[] w) {
      dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
      dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
      dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
      dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
      dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
      dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
      dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
      dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
      dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
      dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
      dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
   }

   public static void hq4x_32_rb(int[] sp, int[] dp, int Xres, int Yres, int trY, int trU, int trV, int trA, boolean wrapX, boolean wrapY) {
      int spIdx = 0;
      int dpIdx = 0;
      trY <<= 16;
      trU <<= 8;
      int dpL = Xres * 4;
      int[] w = new int[9];

      for(int j = 0; j < Yres; ++j) {
         int prevline = j <= 0 ? (!wrapY ? 0 : Xres * (Yres - 1)) : -Xres;
         int nextline = j >= Yres - 1 ? (!wrapY ? 0 : -(Xres * (Yres - 1))) : Xres;

         for(int i = 0; i < Xres; ++i) {
            w[1] = sp[spIdx + prevline];
            w[4] = sp[spIdx];
            w[7] = sp[spIdx + nextline];
            if (i <= 0) {
               if (!wrapX) {
                  w[0] = w[1];
                  w[3] = w[4];
                  w[6] = w[7];
               } else {
                  w[0] = sp[spIdx + prevline + Xres - 1];
                  w[3] = sp[spIdx + Xres - 1];
                  w[6] = sp[spIdx + nextline + Xres - 1];
               }
            } else {
               w[0] = sp[spIdx + prevline - 1];
               w[3] = sp[spIdx - 1];
               w[6] = sp[spIdx + nextline - 1];
            }

            if (i >= Xres - 1) {
               if (!wrapX) {
                  w[2] = w[1];
                  w[5] = w[4];
                  w[8] = w[7];
               } else {
                  w[2] = sp[spIdx + prevline - Xres + 1];
                  w[5] = sp[spIdx - Xres + 1];
                  w[8] = sp[spIdx + nextline - Xres + 1];
               }
            } else {
               w[2] = sp[spIdx + prevline + 1];
               w[5] = sp[spIdx + 1];
               w[8] = sp[spIdx + nextline + 1];
            }

            int pattern = 0;
            int flag = 1;

            for(int k = 0; k < 9; ++k) {
               if (k != 4) {
                  if (w[k] != w[4] && diff(w[4], w[k], trY, trU, trV, trA)) {
                     pattern |= flag;
                  }

                  flag <<= 1;
               }
            }

            switch(pattern) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 32:
            case 33:
            case 36:
            case 37:
            case 128:
            case 129:
            case 132:
            case 133:
            case 160:
            case 161:
            case 164:
            case 165:
               case0(dp, dpIdx, dpL, w);
               break;
            case 2:
            case 34:
            case 130:
            case 162:
               case2(dp, dpIdx, dpL, w);
               break;
            case 3:
            case 35:
            case 131:
            case 163:
               case3(dp, dpIdx, dpL, w);
               break;
            case 6:
            case 38:
            case 134:
            case 166:
               case6(dp, dpIdx, dpL, w);
               break;
            case 7:
            case 39:
            case 135:
               case7(dp, dpIdx, dpL, w);
               break;
            case 8:
            case 12:
            case 136:
            case 140:
               case8(dp, dpIdx, dpL, w);
               break;
            case 9:
            case 13:
            case 137:
            case 141:
               case9(dp, dpIdx, dpL, w);
               break;
            case 10:
            case 138:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 11:
            case 139:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 14:
            case 142:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix5To3(w[1], w[3]);
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 15:
            case 143:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix5To3(w[1], w[3]);
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
                  dp[dpIdx + dpL] = w[4];
                  dp[dpIdx + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 16:
            case 17:
            case 48:
            case 49:
               case16(dp, dpIdx, dpL, w);
               break;
            case 18:
            case 50:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 19:
            case 51:
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 2] = Interpolation.Mix5To3(w[1], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[1]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 20:
            case 21:
            case 52:
            case 53:
               case20(dp, dpIdx, dpL, w);
               break;
            case 22:
            case 54:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 23:
            case 55:
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 2] = Interpolation.Mix5To3(w[1], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[1]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 24:
               case24(dp, dpIdx, dpL, w);
               break;
            case 25:
               case25(dp, dpIdx, dpL, w);
               break;
            case 26:
            case 31:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 27:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 28:
               case28(dp, dpIdx, dpL, w);
               break;
            case 29:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 30:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 40:
            case 44:
            case 168:
            case 172:
               case40(dp, dpIdx, dpL, w);
               break;
            case 41:
            case 45:
            case 169:
               case41(dp, dpIdx, dpL, w);
               break;
            case 42:
            case 170:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix2To1To1(w[1], w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix5To3(w[3], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 43:
            case 171:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix2To1To1(w[1], w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix5To3(w[3], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
                  dp[dpIdx + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 46:
            case 174:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 47:
            case 175:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 56:
               case56(dp, dpIdx, dpL, w);
               break;
            case 57:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 58:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 59:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 60:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 61:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 62:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 63:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 64:
            case 65:
            case 68:
            case 69:
               case64(dp, dpIdx, dpL, w);
               break;
            case 66:
               case66(dp, dpIdx, dpL, w);
               break;
            case 67:
               case67(dp, dpIdx, dpL, w);
               break;
            case 70:
               case70(dp, dpIdx, dpL, w);
               break;
            case 71:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 72:
            case 76:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 73:
            case 77:
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[3], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix2To1To1(w[7], w[4], w[3]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 74:
            case 107:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 75:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 78:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 79:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 80:
            case 81:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 82:
            case 214:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 83:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 84:
            case 85:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[5], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix2To1To1(w[7], w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 86:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 87:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 88:
            case 248:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 89:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 90:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 91:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL + 1] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 92:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 93:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 94:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + 2] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 95:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 96:
            case 97:
            case 100:
            case 101:
               case96(dp, dpIdx, dpL, w);
               break;
            case 98:
               case98(dp, dpIdx, dpL, w);
               break;
            case 99:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 102:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 103:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 104:
            case 108:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 105:
            case 109:
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[3], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix2To1To1(w[7], w[4], w[3]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 106:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 110:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 111:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 112:
            case 113:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[7], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 114:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               break;
            case 115:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               break;
            case 116:
            case 117:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               break;
            case 118:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 119:
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 2] = Interpolation.Mix5To3(w[1], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[1]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 120:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 121:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 122:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               }
               break;
            case 123:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 124:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 125:
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[3], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix2To1To1(w[7], w[4], w[3]);
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 126:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 127:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[4], w[8]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[8]);
               break;
            case 144:
            case 145:
            case 176:
            case 177:
               case144(dp, dpIdx, dpL, w);
               break;
            case 146:
            case 178:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix2To1To1(w[1], w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[5], w[1]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 147:
            case 179:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 148:
            case 149:
            case 180:
               case148(dp, dpIdx, dpL, w);
               break;
            case 150:
            case 182:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix2To1To1(w[1], w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[5], w[1]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 151:
            case 183:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 152:
               case152(dp, dpIdx, dpL, w);
               break;
            case 153:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 154:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 155:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 156:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 157:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 158:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 159:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 167:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 173:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix4To2To1(w[4], w[7], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               break;
            case 181:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix4To2To1(w[4], w[7], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 184:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 185:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 186:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 187:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix2To1To1(w[1], w[4], w[3]);
                  dp[dpIdx + dpL] = Interpolation.Mix5To3(w[3], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
                  dp[dpIdx + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 188:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 189:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 190:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix2To1To1(w[1], w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[5], w[1]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 191:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix7To1(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[4], w[7]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[7]);
               break;
            case 192:
            case 193:
            case 196:
            case 197:
               case192(dp, dpIdx, dpL, w);
               break;
            case 194:
               case194(dp, dpIdx, dpL, w);
               break;
            case 195:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 198:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 199:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 200:
            case 204:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 201:
            case 205:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 202:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 203:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 206:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 207:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix5To3(w[1], w[3]);
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[1]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
                  dp[dpIdx + dpL] = w[4];
                  dp[dpIdx + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 208:
            case 209:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 210:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 211:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 212:
            case 213:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[5], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix2To1To1(w[7], w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 215:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 216:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 217:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 218:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 219:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 220:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               }

               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 221:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix3To1(w[4], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[5], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix2To1To1(w[7], w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 222:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 223:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix3To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[6]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[6]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[4], w[6]);
               break;
            case 224:
            case 225:
            case 228:
               case224(dp, dpIdx, dpL, w);
               break;
            case 226:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 227:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 229:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 230:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 231:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 232:
            case 236:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 233:
            case 237:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[1]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 234:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[3]);
                  dp[dpIdx + dpL + 1] = w[4];
               } else {
                  dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
                  dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
                  dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 235:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix4To2To1(w[4], w[5], w[2]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 238:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.Mix2To1To1(w[3], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix5To3(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix3To1(w[4], w[7]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               }

               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 239:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               dp[dpIdx + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix7To1(w[4], w[5]);
               dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix5To3(w[4], w[5]);
               break;
            case 240:
            case 241:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[7], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 242:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[1]);
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
                  dp[dpIdx + dpL + 2] = w[4];
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[5]);
               } else {
                  dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
                  dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
                  dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
                  dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               break;
            case 243:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 2] = Interpolation.Mix6To1To1(w[4], w[5], w[7]);
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[5], w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix3To1(w[4], w[7]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix3To1(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.Mix5To3(w[7], w[5]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 244:
            case 245:
               dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[3]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix6To1To1(w[4], w[3], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 246:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix4To2To1(w[4], w[3], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 247:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix5To3(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.Mix7To1(w[4], w[3]);
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 249:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix4To2To1(w[4], w[1], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               break;
            case 250:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 251:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.MixEven(w[1], w[3]);
                  dp[dpIdx + 1] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + dpL] = Interpolation.MixEven(w[3], w[4]);
               } else {
                  dp[dpIdx] = w[4];
                  dp[dpIdx + 1] = w[4];
                  dp[dpIdx + dpL] = w[4];
               }

               dp[dpIdx + 2] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[2]);
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[2]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix3To1(w[4], w[2]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 2] = Interpolation.MixEven(w[7], w[4]);
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.MixEven(w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + 3] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }

               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               break;
            case 252:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix4To2To1(w[4], w[1], w[0]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 253:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 1] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 2] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + 3] = Interpolation.Mix5To3(w[4], w[1]);
               dp[dpIdx + dpL] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 2] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + 3] = Interpolation.Mix7To1(w[4], w[1]);
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 254:
               dp[dpIdx] = Interpolation.Mix5To3(w[4], w[0]);
               dp[dpIdx + 1] = Interpolation.Mix3To1(w[4], w[0]);
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 2] = Interpolation.MixEven(w[1], w[4]);
                  dp[dpIdx + 3] = Interpolation.MixEven(w[1], w[5]);
                  dp[dpIdx + dpL + 3] = Interpolation.MixEven(w[5], w[4]);
               } else {
                  dp[dpIdx + 2] = w[4];
                  dp[dpIdx + 3] = w[4];
                  dp[dpIdx + dpL + 3] = w[4];
               }

               dp[dpIdx + dpL] = Interpolation.Mix3To1(w[4], w[0]);
               dp[dpIdx + dpL + 1] = Interpolation.Mix7To1(w[4], w[0]);
               dp[dpIdx + dpL + 2] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL] = Interpolation.MixEven(w[3], w[4]);
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.MixEven(w[7], w[3]);
                  dp[dpIdx + dpL + dpL + dpL + 1] = Interpolation.MixEven(w[7], w[4]);
               } else {
                  dp[dpIdx + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
                  dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               }

               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
               break;
            case 255:
               if (!diff(w[3], w[1], trY, trU, trV, trA)) {
                  dp[dpIdx] = Interpolation.Mix2To1To1(w[4], w[1], w[3]);
               } else {
                  dp[dpIdx] = w[4];
               }

               dp[dpIdx + 1] = w[4];
               dp[dpIdx + 2] = w[4];
               if (!diff(w[1], w[5], trY, trU, trV, trA)) {
                  dp[dpIdx + 3] = Interpolation.Mix2To1To1(w[4], w[1], w[5]);
               } else {
                  dp[dpIdx + 3] = w[4];
               }

               dp[dpIdx + dpL] = w[4];
               dp[dpIdx + dpL + 1] = w[4];
               dp[dpIdx + dpL + 2] = w[4];
               dp[dpIdx + dpL + 3] = w[4];
               dp[dpIdx + dpL + dpL] = w[4];
               dp[dpIdx + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + 2] = w[4];
               dp[dpIdx + dpL + dpL + 3] = w[4];
               if (!diff(w[7], w[3], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL] = Interpolation.Mix2To1To1(w[4], w[7], w[3]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL] = w[4];
               }

               dp[dpIdx + dpL + dpL + dpL + 1] = w[4];
               dp[dpIdx + dpL + dpL + dpL + 2] = w[4];
               if (!diff(w[5], w[7], trY, trU, trV, trA)) {
                  dp[dpIdx + dpL + dpL + dpL + 3] = Interpolation.Mix2To1To1(w[4], w[7], w[5]);
               } else {
                  dp[dpIdx + dpL + dpL + dpL + 3] = w[4];
               }
            }

            ++spIdx;
            dpIdx += 4;
         }

         dpIdx += dpL * 3;
      }

   }
}
