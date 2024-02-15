package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Turn extends BorderedAction {
   private static final Logger log = Logger.getLogger(Turn.class.getName());
   public static final String PARAMETER_LOOKRIGHT = "LookRight";
   private boolean turning = false;

   public Turn(ResourceBundle schema, List<Animation> animations, VariableMap params) {
      super(schema, animations, params);
   }

   protected void tick() throws LostGroundException, VariableException {
      this.getMascot().setLookRight(this.isLookRight());
      super.tick();
      if (this.getBorder() != null && !this.getBorder().isOn(this.getMascot().getAnchor())) {
         throw new LostGroundException();
      } else {
         this.getAnimation().next(this.getMascot(), this.getTime());
      }
   }

   public boolean hasNext() throws VariableException {
      this.turning = this.turning || this.isLookRight() != this.getMascot().isLookRight();
      boolean intime = this.getTime() < this.getAnimation().getDuration();
      return super.hasNext() && intime && this.turning;
   }

   private Boolean isLookRight() throws VariableException {
      return (Boolean)this.eval(this.getSchema().getString("LookRight"), Boolean.class, !this.getMascot().isLookRight());
   }
}
