package com.group_finity.mascot.action;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.CantBeAliveException;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interact extends Animate {
   private static final Logger log = Logger.getLogger(Interact.class.getName());
   public static final String PARAMETER_BEHAVIOUR = "Behaviour";
   private static final String DEFAULT_BEHAVIOUR = "";

   public Interact(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public boolean hasNext() throws VariableException {
      return super.hasNext() && this.getMascot().getManager().hasOverlappingMascotsAtPoint(this.getMascot().getAnchor());
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getTime() == this.getAnimation().getDuration() - 1 && !this.getBehavior().trim().isEmpty()) {
         try {
            this.getMascot().setBehavior(Main.getInstance().getConfiguration(this.getMascot().getImageSet()).buildBehavior(this.getBehavior()));
         } catch (BehaviorInstantiationException var2) {
            log.log(Level.SEVERE, "Fatal Exception", var2);
            Main.showError(Main.getInstance().getLanguageBundle().getString("FailedCreateNewShimejiErrorMessage") + "\n" + var2.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
         } catch (CantBeAliveException var3) {
            log.log(Level.SEVERE, "Fatal Exception", var3);
            Main.showError(Main.getInstance().getLanguageBundle().getString("FailedCreateNewShimejiErrorMessage") + "\n" + var3.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
         }
      }

   }

   private String getBehavior() throws VariableException {
      return (String)this.eval(this.getSchema().getString("Behaviour"), String.class, "");
   }
}
