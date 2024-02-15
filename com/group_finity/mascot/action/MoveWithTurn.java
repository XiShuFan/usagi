package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoveWithTurn extends BorderedAction {
   private static final Logger log = Logger.getLogger(MoveWithTurn.class.getName());
   private static final String PARAMETER_TARGETX = "TargetX";
   private static final int DEFAULT_TARGETX = Integer.MAX_VALUE;
   private static final String PARAMETER_TARGETY = "TargetY";
   private static final int DEFAULT_TARGETY = Integer.MAX_VALUE;
   private boolean turning = false;

   public MoveWithTurn(ResourceBundle schema, List<Animation> animations, VariableMap params) {
      super(schema, animations, params);
      if (animations.size() < 2) {
         throw new IllegalArgumentException("animations.size<2");
      }
   }

   public boolean hasNext() throws VariableException {
      int targetX = this.getTargetX();
      int targetY = this.getTargetY();
      boolean noMoveX = false;
      boolean noMoveY = false;
      if (targetX != Integer.MIN_VALUE && this.getMascot().getAnchor().x == targetX) {
         noMoveX = true;
      }

      if (targetY != Integer.MIN_VALUE && this.getMascot().getAnchor().y == targetY) {
         noMoveY = true;
      }

      return super.hasNext() && !noMoveX && !noMoveY;
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getBorder() != null && !this.getBorder().isOn(this.getMascot().getAnchor())) {
         log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
         throw new LostGroundException();
      } else {
         int targetX = this.getTargetX();
         int targetY = this.getTargetY();
         boolean down = false;
         if (targetX != Integer.MAX_VALUE && this.getMascot().getAnchor().x != targetX) {
            this.turning = this.turning || this.getMascot().getAnchor().x < targetX != this.getMascot().isLookRight();
            this.getMascot().setLookRight(this.getMascot().getAnchor().x < targetX);
         }

         if (targetY != Integer.MAX_VALUE) {
            down = this.getMascot().getAnchor().y < targetY;
         }

         if (this.turning && this.getTime() >= this.getAnimation().getDuration()) {
            this.turning = false;
         }

         this.getAnimation().next(this.getMascot(), this.getTime());
         if (targetX != Integer.MAX_VALUE && (this.getMascot().isLookRight() && this.getMascot().getAnchor().x >= targetX || !this.getMascot().isLookRight() && this.getMascot().getAnchor().x <= targetX)) {
            this.getMascot().setAnchor(new Point(targetX, this.getMascot().getAnchor().y));
         }

         if (targetY != Integer.MAX_VALUE && (down && this.getMascot().getAnchor().y >= targetY || !down && this.getMascot().getAnchor().y <= targetY)) {
            this.getMascot().setAnchor(new Point(this.getMascot().getAnchor().x, targetY));
         }

      }
   }

   protected Animation getAnimation() throws VariableException {
      if (this.turning) {
         return (Animation)super.getAnimations().get(super.getAnimations().size() - 1);
      } else {
         List<Animation> animations = super.getAnimations();

         for(int index = 0; index < animations.size() - 1; ++index) {
            if (((Animation)animations.get(index)).isEffective(this.getVariables())) {
               return (Animation)animations.get(index);
            }
         }

         return null;
      }
   }

   private int getTargetX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("TargetX"), Number.class, Integer.MAX_VALUE)).intValue();
   }

   private int getTargetY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("TargetY"), Number.class, Integer.MAX_VALUE)).intValue();
   }
}
