package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Animate extends BorderedAction {
   private static final Logger log = Logger.getLogger(Animate.class.getName());

   public Animate(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getBorder() != null && !this.getBorder().isOn(this.getMascot().getAnchor())) {
         throw new LostGroundException();
      } else {
         this.getAnimation().next(this.getMascot(), this.getTime());
      }
   }

   public boolean hasNext() throws VariableException {
      boolean intime = this.getTime() < this.getAnimation().getDuration();
      return super.hasNext() && intime;
   }
}
