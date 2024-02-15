package com.group_finity.mascot.action;

import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Offset extends InstantAction {
   private static final Logger log = Logger.getLogger(Offset.class.getName());
   public static final String PARAMETER_OFFSETX = "X";
   private static final int DEFAULT_OFFSETX = 0;
   public static final String PARAMETER_OFFSETY = "Y";
   private static final int DEFAULT_OFFSETY = 0;

   public Offset(ResourceBundle schema, VariableMap params) {
      super(schema, params);
   }

   protected void apply() throws VariableException {
      this.getMascot().setAnchor(new Point(this.getMascot().getAnchor().x + this.getOffsetX(), this.getMascot().getAnchor().y + this.getOffsetY()));
   }

   private int getOffsetX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("X"), Number.class, 0)).intValue();
   }

   private int getOffsetY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("Y"), Number.class, 0)).intValue();
   }
}
