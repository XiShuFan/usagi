package com.group_finity.mascot.action;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FallWithIE extends Fall {
   private static final Logger log = Logger.getLogger(FallWithIE.class.getName());
   public static final String PARAMETER_IEOFFSETX = "IeOffsetX";
   private static final int DEFAULT_IEOFFSETX = 0;
   public static final String PARAMETER_IEOFFSETY = "IeOffsetY";
   private static final int DEFAULT_IEOFFSETY = 0;

   public FallWithIE(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public boolean hasNext() throws VariableException {
      return !Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Throwing", "true")) ? false : super.hasNext();
   }

   protected void tick() throws LostGroundException, VariableException {
      Area activeIE = this.getEnvironment().getActiveIE();
      if (!activeIE.isVisible()) {
         log.log(Level.INFO, "IE Not Visible ({0},{1})", new Object[]{this.getMascot(), this});
         throw new LostGroundException();
      } else {
         int offsetX = this.getIEOffsetX();
         int offsetY = this.getIEOffsetY();
         if (this.getMascot().isLookRight()) {
            if (this.getMascot().getAnchor().x - offsetX != activeIE.getLeft() || this.getMascot().getAnchor().y + offsetY != activeIE.getBottom()) {
               log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
               throw new LostGroundException();
            }
         } else if (this.getMascot().getAnchor().x + offsetX != activeIE.getRight() || this.getMascot().getAnchor().y + offsetY != activeIE.getBottom()) {
            log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
            throw new LostGroundException();
         }

         super.tick();
         if (activeIE.isVisible()) {
            if (this.getMascot().isLookRight()) {
               this.getEnvironment().moveActiveIE(new Point(this.getMascot().getAnchor().x - offsetX, this.getMascot().getAnchor().y + offsetY - activeIE.getHeight()));
            } else {
               this.getEnvironment().moveActiveIE(new Point(this.getMascot().getAnchor().x + offsetX - activeIE.getWidth(), this.getMascot().getAnchor().y + offsetY - activeIE.getHeight()));
            }
         }

      }
   }

   private int getIEOffsetX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("IeOffsetX"), Number.class, 0)).intValue();
   }

   private int getIEOffsetY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("IeOffsetY"), Number.class, 0)).intValue();
   }
}
