package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Jump extends ActionBase {
   private static final Logger log = Logger.getLogger(Jump.class.getName());
   public static final String PARAMETER_TARGETX = "TargetX";
   private static final int DEFAULT_PARAMETERX = 0;
   public static final String PARAMETER_TARGETY = "TargetY";
   private static final int DEFAULT_PARAMETERY = 0;
   public static final String PARAMETER_VELOCITY = "VelocityParam";
   private static final double DEFAULT_VELOCITY = 20.0D;

   public Jump(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public boolean hasNext() throws VariableException {
      int targetX = this.getTargetX();
      int targetY = this.getTargetY();
      double distanceX = (double)(targetX - this.getMascot().getAnchor().x);
      double distanceY = (double)(targetY - this.getMascot().getAnchor().y) - Math.abs(distanceX) / 2.0D;
      double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
      return super.hasNext() && distance != 0.0D;
   }

   protected void tick() throws LostGroundException, VariableException {
      int targetX = this.getTargetX();
      int targetY = this.getTargetY();
      this.getMascot().setLookRight(this.getMascot().getAnchor().x < targetX);
      double distanceX = (double)(targetX - this.getMascot().getAnchor().x);
      double distanceY = (double)(targetY - this.getMascot().getAnchor().y) - Math.abs(distanceX) / 2.0D;
      double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
      double velocity = this.getVelocity();
      if (distance != 0.0D) {
         int velocityX = (int)(velocity * distanceX / distance);
         int velocityY = (int)(velocity * distanceY / distance);
         this.getMascot().setAnchor(new Point(this.getMascot().getAnchor().x + velocityX, this.getMascot().getAnchor().y + velocityY));
         this.getAnimation().next(this.getMascot(), this.getTime());
      }

      if (distance <= velocity) {
         this.getMascot().setAnchor(new Point(targetX, targetY));
      }

   }

   private double getVelocity() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("VelocityParam"), Number.class, 20.0D)).doubleValue();
   }

   private int getTargetX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("TargetX"), Number.class, 0)).intValue();
   }

   private int getTargetY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("TargetY"), Number.class, 0)).intValue();
   }
}
