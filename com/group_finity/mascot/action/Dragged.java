package com.group_finity.mascot.action;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.environment.Location;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Dragged extends ActionBase {
   private static final Logger log = Logger.getLogger(Dragged.class.getName());
   private static final String VARIABLE_FOOTX = "FootX";
   public static final String PARAMETER_OFFSETX = "OffsetX";
   private static final int DEFAULT_OFFSETX = 0;
   public static final String PARAMETER_OFFSETY = "OffsetY";
   private static final int DEFAULT_OFFSETY = 120;
   private double footX;
   private double footDx;
   private int timeToRegist;
   private int scaling;

   public Dragged(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public void init(Mascot mascot) throws VariableException {
      super.init(mascot);
      this.scaling = Integer.parseInt(Main.getInstance().getProperties().getProperty("Scaling", "1"));
      this.setFootX((double)this.getEnvironment().getCursor().getX());
      this.setTimeToRegist(250);
   }

   public boolean hasNext() throws VariableException {
      boolean intime = this.getTime() < this.getTimeToRegist();
      boolean lukewarm = Math.random() >= 0.1D;
      return super.hasNext() && (intime || lukewarm);
   }

   protected void tick() throws LostGroundException, VariableException {
      this.getMascot().setLookRight(false);
      this.getEnvironment().refreshWorkArea();
      Location cursor = this.getEnvironment().getCursor();
      if (Math.abs(cursor.getX() - this.getMascot().getAnchor().x) >= 5) {
         this.setTime(0);
      }

      int newX = cursor.getX();
      this.setFootDx((this.getFootDx() + ((double)newX - this.getFootX()) * 0.1D) * 0.8D);
      this.setFootX(this.getFootX() + this.getFootDx());
      this.putVariable(this.getSchema().getString("FootX"), this.getFootX());
      this.getAnimation().next(this.getMascot(), this.getTime());
      this.getMascot().setAnchor(new Point(cursor.getX() + this.getOffsetX() * this.scaling, cursor.getY() + this.getOffsetY() * this.scaling));
   }

   public void setTimeToRegist(int timeToRegist) {
      this.timeToRegist = timeToRegist;
   }

   private int getTimeToRegist() {
      return this.timeToRegist;
   }

   private void setFootX(double footX) {
      this.footX = footX;
   }

   private double getFootX() {
      return this.footX;
   }

   private void setFootDx(double footDx) {
      this.footDx = footDx;
   }

   private double getFootDx() {
      return this.footDx;
   }

   private int getOffsetX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("OffsetX"), Number.class, 0)).intValue();
   }

   private int getOffsetY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("OffsetY"), Number.class, 120)).intValue();
   }
}
