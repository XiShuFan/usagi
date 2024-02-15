package com.group_finity.mascot.action;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Fall extends ActionBase {
   private static final Logger log = Logger.getLogger(Fall.class.getName());
   public static final String PARAMETER_INITIALVX = "InitialVX";
   private static final int DEFAULT_INITIALVX = 0;
   private static final String PARAMETER_INITIALVY = "InitialVY";
   private static final int DEFAULT_INITIALVY = 0;
   public static final String PARAMETER_RESISTANCEX = "ResistanceX";
   private static final double DEFAULT_RESISTANCEX = 0.05D;
   public static final String PARAMETER_RESISTANCEY = "ResistanceY";
   private static final double DEFAULT_RESISTANCEY = 0.1D;
   public static final String PARAMETER_GRAVITY = "Gravity";
   private static final double DEFAULT_GRAVITY = 2.0D;
   private double velocityX;
   private double velocityY;
   private double modX;
   private double modY;

   public Fall(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public void init(Mascot mascot) throws VariableException {
      super.init(mascot);
      this.setVelocityX((double)this.getInitialVx());
      this.setVelocityY((double)this.getInitialVy());
   }

   public boolean hasNext() throws VariableException {
      Point pos = this.getMascot().getAnchor();
      boolean onBorder = false;
      if (this.getEnvironment().getFloor().isOn(pos)) {
         onBorder = true;
      }

      if (this.getEnvironment().getWall().isOn(pos)) {
         onBorder = true;
      }

      return super.hasNext() && !onBorder;
   }

   protected void tick() throws LostGroundException, VariableException {
      if (this.getVelocityX() != 0.0D) {
         this.getMascot().setLookRight(this.getVelocityX() > 0.0D);
      }

      this.setVelocityX(this.getVelocityX() - this.getVelocityX() * this.getResistanceX());
      this.setVelocityY(this.getVelocityY() - this.getVelocityY() * this.getResistanceY() + this.getGravity());
      this.setModX(this.getModX() + this.getVelocityX() % 1.0D);
      this.setModY(this.getModY() + this.getVelocityY() % 1.0D);
      int dx = (int)this.getVelocityX() + (int)this.getModX();
      int dy = (int)this.getVelocityY() + (int)this.getModY();
      this.setModX(this.getModX() % 1.0D);
      this.setModY(this.getModY() % 1.0D);
      int dev = Math.max(Math.abs(dx), Math.abs(dy));
      if (dev < 1) {
         dev = 1;
      }

      Point start = this.getMascot().getAnchor();

      label43:
      for(int i = 0; i <= dev; ++i) {
         int x = start.x + dx * i / dev;
         int y = start.y + dy * i / dev;
         this.getMascot().setAnchor(new Point(x, y));
         if (dy > 0) {
            for(int j = -80; j <= 0; ++j) {
               this.getMascot().setAnchor(new Point(x, y + j));
               if (this.getEnvironment().getFloor(true).isOn(this.getMascot().getAnchor())) {
                  break label43;
               }
            }
         }

         if (this.getEnvironment().getWall(true).isOn(this.getMascot().getAnchor())) {
            break;
         }
      }

      this.getAnimation().next(this.getMascot(), this.getTime());
   }

   private int getInitialVx() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("InitialVX"), Number.class, 0)).intValue();
   }

   private int getInitialVy() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("InitialVY"), Number.class, 0)).intValue();
   }

   private double getGravity() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("Gravity"), Number.class, 2.0D)).doubleValue();
   }

   private double getResistanceX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("ResistanceX"), Number.class, 0.05D)).doubleValue();
   }

   private double getResistanceY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("ResistanceY"), Number.class, 0.1D)).doubleValue();
   }

   private void setVelocityY(double velocityY) {
      this.velocityY = velocityY;
   }

   private double getVelocityY() {
      return this.velocityY;
   }

   private void setVelocityX(double velocityX) {
      this.velocityX = velocityX;
   }

   private double getVelocityX() {
      return this.velocityX;
   }

   private void setModX(double modX) {
      this.modX = modX;
   }

   private double getModX() {
      return this.modX;
   }

   private void setModY(double modY) {
      this.modY = modY;
   }

   private double getModY() {
      return this.modY;
   }
}
