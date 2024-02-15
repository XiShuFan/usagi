package com.group_finity.mascot.action;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Broadcast extends Animate {
   private static final Logger log = Logger.getLogger(Broadcast.class.getName());
   public static final String PARAMETER_AFFORDANCE = "Affordance";
   private static final String DEFAULT_AFFORDANCE = "";

   public Broadcast(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      this.getMascot().getAffordances().add(this.getAffordance());
   }

   private String getAffordance() throws VariableException {
      return (String)this.eval(this.getSchema().getString("Affordance"), String.class, "");
   }
}
