package com.group_finity.mascot.action;

import com.group_finity.mascot.script.VariableMap;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Select extends ComplexAction {
   private static final Logger log = Logger.getLogger(Select.class.getName());

   public Select(ResourceBundle schema, VariableMap params, Action... actions) {
      super(schema, params, actions);
   }
}
