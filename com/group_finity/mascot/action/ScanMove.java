package com.group_finity.mascot.action;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.CantBeAliveException;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import java.awt.Point;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScanMove extends BorderedAction {
   private static final Logger log = Logger.getLogger(ScanMove.class.getName());
   private static final String PARAMETER_AFFORDANCE = "Affordance";
   private static final String DEFAULT_AFFORDANCE = "";
   public static final String PARAMETER_BEHAVIOUR = "Behaviour";
   private static final String DEFAULT_BEHAVIOUR = "";
   public static final String PARAMETER_TARGETBEHAVIOUR = "TargetBehaviour";
   private static final String DEFAULT_TARGETBEHAVIOUR = "";
   private WeakReference<Mascot> target;

   public ScanMove(ResourceBundle schema, List<Animation> animations, VariableMap params) {
      super(schema, animations, params);
   }

   public boolean hasNext() throws VariableException {
      if (this.getMascot().getManager() == null) {
         return super.hasNext();
      } else {
         if (this.target == null) {
            this.target = this.getMascot().getManager().getMascotWithAffordance(this.getAffordance());
         }

         return super.hasNext() && this.target != null && this.target.get() != null && ((Mascot)this.target.get()).getAffordances().contains(this.getAffordance());
      }
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getBorder() != null && !this.getBorder().isOn(this.getMascot().getAnchor())) {
         log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});
         throw new LostGroundException();
      } else {
         int targetX = ((Mascot)this.target.get()).getAnchor().x;
         int targetY = ((Mascot)this.target.get()).getAnchor().y;
         boolean down = false;
         if (this.getMascot().getAnchor().x != targetX) {
            this.getMascot().setLookRight(this.getMascot().getAnchor().x < targetX);
         }

         down = this.getMascot().getAnchor().y < targetY;
         this.getAnimation().next(this.getMascot(), this.getTime());
         if (this.getMascot().isLookRight() && this.getMascot().getAnchor().x >= targetX || !this.getMascot().isLookRight() && this.getMascot().getAnchor().x <= targetX) {
            this.getMascot().setAnchor(new Point(targetX, this.getMascot().getAnchor().y));
         }

         if (down && this.getMascot().getAnchor().y >= targetY || !down && this.getMascot().getAnchor().y <= targetY) {
            this.getMascot().setAnchor(new Point(this.getMascot().getAnchor().x, targetY));
         }

         boolean noMoveX = false;
         boolean noMoveY = false;
         if (this.getMascot().getAnchor().x == targetX) {
            noMoveX = true;
         }

         if (this.getMascot().getAnchor().y == targetY) {
            noMoveY = true;
         }

         if (noMoveX && noMoveY) {
            try {
               this.getMascot().setBehavior(Main.getInstance().getConfiguration(this.getMascot().getImageSet()).buildBehavior(this.getBehavior()));
               ((Mascot)this.target.get()).setBehavior(Main.getInstance().getConfiguration(((Mascot)this.target.get()).getImageSet()).buildBehavior(this.getTargetBehavior()));
            } catch (NullPointerException var7) {
               log.log(Level.SEVERE, "Fatal Exception", var7);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var7.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
            } catch (BehaviorInstantiationException var8) {
               log.log(Level.SEVERE, "Fatal Exception", var8);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var8.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
            } catch (CantBeAliveException var9) {
               log.log(Level.SEVERE, "Fatal Exception", var9);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var9.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
            }
         }

      }
   }

   private String getAffordance() throws VariableException {
      return (String)this.eval(this.getSchema().getString("Affordance"), String.class, "");
   }

   private String getBehavior() throws VariableException {
      return (String)this.eval(this.getSchema().getString("Behaviour"), String.class, "");
   }

   private String getTargetBehavior() throws VariableException {
      return (String)this.eval(this.getSchema().getString("TargetBehaviour"), String.class, "");
   }
}
