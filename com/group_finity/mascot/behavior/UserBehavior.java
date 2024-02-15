package com.group_finity.mascot.behavior;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.action.Action;
import com.group_finity.mascot.action.ActionBase;
import com.group_finity.mascot.config.Configuration;
import com.group_finity.mascot.environment.MascotEnvironment;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.CantBeAliveException;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class UserBehavior implements Behavior {
   private static final Logger log = Logger.getLogger(UserBehavior.class.getName());
   public static final String BEHAVIOURNAME_FALL = "Fall";
   public static final String BEHAVIOURNAME_DRAGGED = "Dragged";
   public static final String BEHAVIOURNAME_THROWN = "Thrown";
   private final String name;
   private final Configuration configuration;
   private final Action action;
   private Mascot mascot;
   private boolean hidden;

   public UserBehavior(String name, Action action, Configuration configuration, boolean hidden) {
      this.name = name;
      this.configuration = configuration;
      this.action = action;
      this.hidden = hidden;
   }

   public String toString() {
      return "Behavior(" + this.getName() + ")";
   }

   public synchronized void init(Mascot mascot) throws CantBeAliveException {
      this.setMascot(mascot);
      log.log(Level.INFO, "Default Behavior({0},{1})", new Object[]{this.getMascot(), this});

      try {
         this.getAction().init(mascot);
         if (!this.getAction().hasNext()) {
            try {
               mascot.setBehavior(this.getConfiguration().buildBehavior(this.getName(), mascot));
            } catch (BehaviorInstantiationException var3) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedInitialiseFollowingBehaviourErrorMessage"), var3);
            }
         }

      } catch (VariableException var4) {
         throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("VariableEvaluationErrorMessage"), var4);
      }
   }

   private Configuration getConfiguration() {
      return this.configuration;
   }

   private Action getAction() {
      return this.action;
   }

   private String getName() {
      return this.name;
   }

   public synchronized void mousePressed(MouseEvent event) throws CantBeAliveException {
      if (SwingUtilities.isLeftMouseButton(event)) {
         boolean draggable = true;
         if (this.action != null && this.action instanceof ActionBase) {
            try {
               draggable = ((ActionBase)this.action).isDraggable();
            } catch (VariableException var5) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedDragActionInitialiseErrorMessage"), var5);
            }
         }

         if (draggable) {
            try {
               this.getMascot().setBehavior(this.getConfiguration().buildBehavior(this.configuration.getSchema().getString("Dragged")));
            } catch (BehaviorInstantiationException var4) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedDragActionInitialiseErrorMessage"), var4);
            }
         }
      }

   }

   public synchronized void mouseReleased(MouseEvent event) throws CantBeAliveException {
      if (SwingUtilities.isLeftMouseButton(event)) {
         boolean draggable = true;
         if (this.action != null && this.action instanceof ActionBase) {
            try {
               draggable = ((ActionBase)this.action).isDraggable();
            } catch (VariableException var5) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedDropActionInitialiseErrorMessage"), var5);
            }
         }

         if (draggable) {
            try {
               this.getMascot().setBehavior(this.getConfiguration().buildBehavior(this.configuration.getSchema().getString("Thrown")));
            } catch (BehaviorInstantiationException var4) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedDropActionInitialiseErrorMessage"), var4);
            }
         }
      }

   }

   public synchronized void next() throws CantBeAliveException {
      try {
         if (this.getAction().hasNext()) {
            this.getAction().next();
         }

         if (this.getAction().hasNext()) {
            if (this.getMascot().getBounds().getX() + this.getMascot().getBounds().getWidth() <= (double)this.getEnvironment().getScreen().getLeft() || (double)this.getEnvironment().getScreen().getRight() <= this.getMascot().getBounds().getX() || (double)this.getEnvironment().getScreen().getBottom() <= this.getMascot().getBounds().getY()) {
               log.log(Level.INFO, "Out of the screen bounds({0},{1})", new Object[]{this.getMascot(), this});
               if (Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Multiscreen", "true"))) {
                  this.getMascot().setAnchor(new Point((int)(Math.random() * (double)(this.getEnvironment().getScreen().getRight() - this.getEnvironment().getScreen().getLeft())) + this.getEnvironment().getScreen().getLeft(), this.getEnvironment().getScreen().getTop() - 256));
               } else {
                  this.getMascot().setAnchor(new Point((int)(Math.random() * (double)(this.getEnvironment().getWorkArea().getRight() - this.getEnvironment().getWorkArea().getLeft())) + this.getEnvironment().getWorkArea().getLeft(), this.getEnvironment().getWorkArea().getTop() - 256));
               }

               try {
                  this.getMascot().setBehavior(this.getConfiguration().buildBehavior(this.configuration.getSchema().getString("Fall")));
               } catch (BehaviorInstantiationException var5) {
                  throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedFallingActionInitialiseErrorMessage"), var5);
               }
            }
         } else {
            log.log(Level.INFO, "Completed Behavior ({0},{1})", new Object[]{this.getMascot(), this});

            try {
               this.getMascot().setBehavior(this.getConfiguration().buildBehavior(this.getName(), this.getMascot()));
            } catch (BehaviorInstantiationException var4) {
               throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedInitialiseFollowingActionsErrorMessage"), var4);
            }
         }
      } catch (LostGroundException var6) {
         log.log(Level.INFO, "Lost Ground ({0},{1})", new Object[]{this.getMascot(), this});

         try {
            this.getMascot().setBehavior(this.getConfiguration().buildBehavior(this.configuration.getSchema().getString("Fall")));
         } catch (BehaviorInstantiationException var3) {
            throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("FailedFallingActionInitialiseErrorMessage"), var6);
         }
      } catch (VariableException var7) {
         throw new CantBeAliveException(Main.getInstance().getLanguageBundle().getString("VariableEvaluationErrorMessage"), var7);
      }

   }

   private void setMascot(Mascot mascot) {
      this.mascot = mascot;
   }

   private Mascot getMascot() {
      return this.mascot;
   }

   protected MascotEnvironment getEnvironment() {
      return this.getMascot().getEnvironment();
   }

   public boolean isHidden() {
      return this.hidden;
   }
}
