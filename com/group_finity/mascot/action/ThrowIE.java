package com.group_finity.mascot.action;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class ThrowIE extends Animate {
   private static final Logger log = Logger.getLogger(ThrowIE.class.getName());
   public static final String PARAMETER_INITIALVX = "InitialVX";
   private static final int DEFAULT_INITIALVX = 32;
   public static final String PARAMETER_INITIALVY = "InitialVY";
   private static final int DEFAULT_INITIALVY = -10;
   public static final String PARAMETER_GRAVITY = "Gravity";
   private static final double DEFAULT_GRAVITY = 0.5D;

   public ThrowIE(ResourceBundle schema, List<Animation> animations, VariableMap params) {
      super(schema, animations, params);
   }

   public boolean hasNext() throws VariableException {
      if (!Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Throwing", "true"))) {
         return false;
      } else {
         boolean ieVisible = this.getEnvironment().getActiveIE().isVisible();
         return super.hasNext() && ieVisible;
      }
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      Area activeIE = this.getEnvironment().getActiveIE();
      if (activeIE.isVisible()) {
         if (this.getMascot().isLookRight()) {
            this.getEnvironment().moveActiveIE(new Point(activeIE.getLeft() + this.getInitialVx(), activeIE.getTop() + this.getInitialVy() + (int)((double)this.getTime() * this.getGravity())));
         } else {
            this.getEnvironment().moveActiveIE(new Point(activeIE.getLeft() - this.getInitialVx(), activeIE.getTop() + this.getInitialVy() + (int)((double)this.getTime() * this.getGravity())));
         }
      }

   }

   private int getInitialVx() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("InitialVX"), Number.class, 32)).intValue();
   }

   private int getInitialVy() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("InitialVY"), Number.class, -10)).intValue();
   }

   private double getGravity() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("Gravity"), Number.class, 0.5D)).doubleValue();
   }
}
