package com.group_finity.mascot.action;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public abstract class InstantAction extends ActionBase {
   private static final Logger log = Logger.getLogger(InstantAction.class.getName());

   public InstantAction(ResourceBundle schema, VariableMap params) {
      super(schema, new ArrayList(), params);
   }

   public final void init(Mascot mascot) throws VariableException {
      super.init(mascot);
      if (super.hasNext()) {
         this.apply();
      }

   }

   protected abstract void apply() throws VariableException;

   public final boolean hasNext() throws VariableException {
      if (super.hasNext()) {
      }

      return false;
   }

   protected final void tick() {
   }
}
