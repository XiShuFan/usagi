package com.group_finity.mascot.action;

import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Look extends InstantAction {
   private static final Logger log = Logger.getLogger(Look.class.getName());
   public static final String PARAMETER_LOOKRIGHT = "LookRight";

   public Look(ResourceBundle schema, VariableMap params) {
      super(schema, params);
   }

   protected void apply() throws VariableException {
      this.getMascot().setLookRight(this.isLookRight());
   }

   private Boolean isLookRight() throws VariableException {
      return (Boolean)this.eval(this.getSchema().getString("LookRight"), Boolean.class, !this.getMascot().isLookRight());
   }
}
