package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stay extends BorderedAction {
   private static final Logger log = Logger.getLogger(Stay.class.getName());

   public Stay(ResourceBundle schema, List<Animation> animations, VariableMap params) {
      super(schema, animations, params);
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getBorder() != null && !this.getBorder().isOn(this.getMascot().getAnchor())) {
         log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
         throw new LostGroundException();
      } else {
         this.getAnimation().next(this.getMascot(), this.getTime());
      }
   }
}
