package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regist extends ActionBase {
   private static final Logger log = Logger.getLogger(Regist.class.getName());

   public Regist(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public boolean hasNext() throws VariableException {
      boolean notMoved = Math.abs(this.getEnvironment().getCursor().getX() - this.getMascot().getAnchor().x) < 5;
      return super.hasNext() && notMoved;
   }

   protected void tick() throws LostGroundException, VariableException {
      Animation animation = this.getAnimation();
      animation.next(this.getMascot(), this.getTime());
      if (this.getTime() + 1 >= this.getAnimation().getDuration()) {
         this.getMascot().setLookRight(Math.random() < 0.5D);
         log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
         throw new LostGroundException();
      }
   }
}
