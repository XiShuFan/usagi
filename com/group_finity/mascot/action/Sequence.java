package com.group_finity.mascot.action;

import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Sequence extends ComplexAction {
   private static final Logger log = Logger.getLogger(Sequence.class.getName());
   public static final String PARAMETER_LOOP = "Loop";
   private static final boolean DEFAULT_LOOP = false;

   public Sequence(ResourceBundle schema, VariableMap params, Action... actions) {
      super(schema, params, actions);
   }

   public boolean hasNext() throws VariableException {
      this.seek();
      return super.hasNext();
   }

   protected void setCurrentAction(int currentAction) throws VariableException {
      super.setCurrentAction(this.isLoop() ? currentAction % this.getActions().length : currentAction);
   }

   private Boolean isLoop() throws VariableException {
      return (Boolean)this.eval(this.getSchema().getString("Loop"), Boolean.class, false);
   }
}
