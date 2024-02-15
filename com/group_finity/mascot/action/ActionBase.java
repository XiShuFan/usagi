package com.group_finity.mascot.action;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.environment.MascotEnvironment;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.Variable;
import com.group_finity.mascot.script.VariableMap;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public abstract class ActionBase implements Action {
   private static final Logger log = Logger.getLogger(ActionBase.class.getName());
   public static final String PARAMETER_DURATION = "Duration";
   private static final boolean DEFAULT_CONDITION = true;
   public static final String PARAMETER_CONDITION = "Condition";
   private static final int DEFAULT_DURATION = Integer.MAX_VALUE;
   public static final String PARAMETER_DRAGGABLE = "Draggable";
   private static final boolean DEFAULT_DRAGGABLE = true;
   private Mascot mascot;
   private int startTime;
   private List<Animation> animations;
   private VariableMap variables;
   private ResourceBundle schema;

   public ActionBase(ResourceBundle schema, List<Animation> animations, VariableMap context) {
      this.schema = schema;
      this.animations = animations;
      this.variables = context;
   }

   public String toString() {
      try {
         return "Action (" + this.getClass().getSimpleName() + "," + this.getName() + ")";
      } catch (VariableException var2) {
         return "Action (" + this.getClass().getSimpleName() + "," + null + ")";
      }
   }

   public void init(Mascot mascot) throws VariableException {
      this.setMascot(mascot);
      this.setTime(0);
      this.getVariables().put((String)"mascot", mascot);
      this.getVariables().put((String)"action", this);
      this.getVariables().init();
      Iterator var2 = this.animations.iterator();

      while(var2.hasNext()) {
         Animation animation = (Animation)var2.next();
         animation.init();
      }

   }

   public void next() throws LostGroundException, VariableException {
      this.initFrame();
      this.getMascot().getAffordances().clear();
      this.tick();
   }

   private void initFrame() {
      this.getVariables().initFrame();
      Iterator var1 = this.getAnimations().iterator();

      while(var1.hasNext()) {
         Animation animation = (Animation)var1.next();
         animation.initFrame();
      }

   }

   protected List<Animation> getAnimations() {
      return this.animations;
   }

   protected abstract void tick() throws LostGroundException, VariableException;

   public boolean hasNext() throws VariableException {
      boolean effective = this.isEffective();
      boolean intime = this.getTime() < this.getDuration();
      return effective && intime;
   }

   public Boolean isDraggable() throws VariableException {
      return (Boolean)this.eval(this.schema.getString("Draggable"), Boolean.class, true);
   }

   private Boolean isEffective() throws VariableException {
      return (Boolean)this.eval(this.schema.getString("Condition"), Boolean.class, true);
   }

   private int getDuration() throws VariableException {
      return ((Number)this.eval(this.schema.getString("Duration"), Number.class, Integer.MAX_VALUE)).intValue();
   }

   private void setMascot(Mascot mascot) {
      this.mascot = mascot;
   }

   protected Mascot getMascot() {
      return this.mascot;
   }

   protected int getTime() {
      return this.getMascot().getTime() - this.startTime;
   }

   protected void setTime(int time) {
      this.startTime = this.getMascot().getTime() - time;
   }

   private String getName() throws VariableException {
      return (String)this.eval(this.schema.getString("Name"), String.class, (String)null);
   }

   protected Animation getAnimation() throws VariableException {
      Iterator var1 = this.getAnimations().iterator();

      Animation animation;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         animation = (Animation)var1.next();
      } while(!animation.isEffective(this.getVariables()));

      return animation;
   }

   protected VariableMap getVariables() {
      return this.variables;
   }

   protected void putVariable(String key, Object value) {
      synchronized(this.getVariables()) {
         this.getVariables().put(key, value);
      }
   }

   protected <T> T eval(String name, Class<T> type, T defaultValue) throws VariableException {
      synchronized(this.getVariables()) {
         Variable variable = (Variable)this.getVariables().getRawMap().get(name);
         return variable != null ? type.cast(variable.get(this.getVariables())) : defaultValue;
      }
   }

   protected MascotEnvironment getEnvironment() {
      return this.getMascot().getEnvironment();
   }

   protected ResourceBundle getSchema() {
      return this.schema;
   }
}
