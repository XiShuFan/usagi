package com.group_finity.mascot.action;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.environment.Border;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public abstract class BorderedAction extends ActionBase {
   private static final Logger log = Logger.getLogger(BorderedAction.class.getName());
   private static final String PARAMETER_BORDERTYPE = "BorderType";
   public static final String DEFAULT_BORDERTYPE = null;
   public static final String BORDERTYPE_CEILING = "Ceiling";
   public static final String BORDERTYPE_WALL = "Wall";
   public static final String BORDERTYPE_FLOOR = "Floor";
   private Border border;

   public BorderedAction(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public void init(Mascot mascot) throws VariableException {
      super.init(mascot);
      String borderType = this.getBorderType();
      if (this.getSchema().getString("Ceiling").equals(borderType)) {
         this.setBorder(this.getEnvironment().getCeiling());
      } else if (this.getSchema().getString("Wall").equals(borderType)) {
         this.setBorder(this.getEnvironment().getWall());
      } else if (this.getSchema().getString("Floor").equals(borderType)) {
         this.setBorder(this.getEnvironment().getFloor());
      }

   }

   protected void tick() throws LostGroundException, VariableException {
      if (this.getBorder() != null) {
         this.getMascot().setAnchor(this.getBorder().move(this.getMascot().getAnchor()));
      }

   }

   private String getBorderType() throws VariableException {
      return (String)this.eval(this.getSchema().getString("BorderType"), String.class, DEFAULT_BORDERTYPE);
   }

   private void setBorder(Border border) {
      this.border = border;
   }

   protected Border getBorder() {
      return this.border;
   }
}
