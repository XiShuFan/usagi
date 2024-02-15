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
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Breed extends Animate {
   private static final Logger log = Logger.getLogger(Breed.class.getName());
   public static final String PARAMETER_BORNX = "BornX";
   private static final int DEFAULT_BORNX = 0;
   public static final String PARAMETER_BORNY = "BornY";
   private static final int DEFAULT_BORNY = 0;
   public static final String PARAMETER_BORNBEHAVIOUR = "BornBehaviour";
   private static final String DEFAULT_BORNBEHAVIOUR = "";
   public static final String PARAMETER_BORNMASCOT = "BornMascot";
   private static final String DEFAULT_BORNMASCOT = "";
   private int scaling;

   public Breed(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      super(schema, animations, context);
   }

   public void init(Mascot mascot) throws VariableException {
      super.init(mascot);
      this.scaling = Integer.parseInt(Main.getInstance().getProperties().getProperty("Scaling", "1"));
   }

   protected void tick() throws LostGroundException, VariableException {
      super.tick();
      if (this.getTime() == this.getAnimation().getDuration() - 1 && Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Breeding", "true"))) {
         this.breed();
      }

   }

   private void breed() throws VariableException {
      String childType = Main.getInstance().getConfiguration(this.getBornMascot()) != null ? this.getBornMascot() : this.getMascot().getImageSet();
      Mascot mascot = new Mascot(childType);
      log.log(Level.INFO, "Breed Mascot ({0},{1},{2})", new Object[]{this.getMascot(), this, mascot});
      if (this.getMascot().isLookRight()) {
         mascot.setAnchor(new Point(this.getMascot().getAnchor().x - this.getBornX() * this.scaling, this.getMascot().getAnchor().y + this.getBornY() * this.scaling));
      } else {
         mascot.setAnchor(new Point(this.getMascot().getAnchor().x + this.getBornX() * this.scaling, this.getMascot().getAnchor().y + this.getBornY() * this.scaling));
      }

      mascot.setLookRight(this.getMascot().isLookRight());

      try {
         mascot.setBehavior(Main.getInstance().getConfiguration(childType).buildBehavior(this.getBornBehaviour()));
         this.getMascot().getManager().add(mascot);
      } catch (BehaviorInstantiationException var4) {
         log.log(Level.SEVERE, "Fatal Exception", var4);
         Main.showError(Main.getInstance().getLanguageBundle().getString("FailedCreateNewShimejiErrorMessage") + "\n" + var4.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
         mascot.dispose();
      } catch (CantBeAliveException var5) {
         log.log(Level.SEVERE, "Fatal Exception", var5);
         Main.showError(Main.getInstance().getLanguageBundle().getString("FailedCreateNewShimejiErrorMessage") + "\n" + var5.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
         mascot.dispose();
      }

   }

   private int getBornX() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("BornX"), Number.class, 0)).intValue();
   }

   private int getBornY() throws VariableException {
      return ((Number)this.eval(this.getSchema().getString("BornY"), Number.class, 0)).intValue();
   }

   private String getBornBehaviour() throws VariableException {
      return (String)this.eval(this.getSchema().getString("BornBehaviour"), String.class, "");
   }

   private String getBornMascot() throws VariableException {
      return (String)this.eval(this.getSchema().getString("BornMascot"), String.class, "");
   }
}
