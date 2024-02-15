package com.group_finity.mascot.animation;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.Variable;
import com.group_finity.mascot.script.VariableMap;

public class Animation {
   private Variable condition;
   private final Pose[] poses;

   public Animation(Variable condition, Pose... poses) {
      if (poses.length == 0) {
         throw new IllegalArgumentException("poses.length==0");
      } else {
         this.condition = condition;
         this.poses = poses;
      }
   }

   public boolean isEffective(VariableMap variables) throws VariableException {
      return (Boolean)this.getCondition().get(variables);
   }

   public void init() {
      this.getCondition().init();
   }

   public void initFrame() {
      this.getCondition().initFrame();
   }

   public void next(Mascot mascot, int time) {
      this.getPoseAt(time).next(mascot);
   }

   public Pose getPoseAt(int time) {
      time %= this.getDuration();
      Pose[] var2 = this.getPoses();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Pose pose = var2[var4];
         time -= pose.getDuration();
         if (time < 0) {
            return pose;
         }
      }

      return null;
   }

   public int getDuration() {
      int duration = 0;
      Pose[] var2 = this.getPoses();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Pose pose = var2[var4];
         duration += pose.getDuration();
      }

      return duration;
   }

   private Variable getCondition() {
      return this.condition;
   }

   private Pose[] getPoses() {
      return this.poses;
   }
}
