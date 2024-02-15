package com.group_finity.mascot.config;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.action.Action;
import com.group_finity.mascot.action.Animate;
import com.group_finity.mascot.action.Move;
import com.group_finity.mascot.action.Select;
import com.group_finity.mascot.action.Sequence;
import com.group_finity.mascot.action.Stay;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.ActionInstantiationException;
import com.group_finity.mascot.exception.AnimationInstantiationException;
import com.group_finity.mascot.exception.ConfigurationException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.Variable;
import com.group_finity.mascot.script.VariableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionBuilder implements IActionBuilder {
   private static final Logger log = Logger.getLogger(ActionBuilder.class.getName());
   private final String type;
   private final String name;
   private final String className;
   private final Map<String, String> params = new LinkedHashMap();
   private final List<AnimationBuilder> animationBuilders = new ArrayList();
   private final List<IActionBuilder> actionRefs = new ArrayList();
   private final ResourceBundle schema;

   public ActionBuilder(Configuration configuration, Entry actionNode, String imageSet) throws IOException {
      this.schema = configuration.getSchema();
      this.name = actionNode.getAttribute(this.schema.getString("Name"));
      this.type = actionNode.getAttribute(this.schema.getString("Type"));
      this.className = actionNode.getAttribute(this.schema.getString("Class"));
      log.log(Level.INFO, "Read Start Operation({0})", this);
      this.getParams().putAll(actionNode.getAttributes());
      Iterator var4 = actionNode.selectChildren(this.schema.getString("Animation")).iterator();

      Entry node;
      while(var4.hasNext()) {
         node = (Entry)var4.next();
         this.getAnimationBuilders().add(new AnimationBuilder(this.schema, node, imageSet));
      }

      var4 = actionNode.getChildren().iterator();

      while(var4.hasNext()) {
         node = (Entry)var4.next();
         if (node.getName().equals(this.schema.getString("ActionReference"))) {
            this.getActionRefs().add(new ActionRef(configuration, node));
         } else if (node.getName().equals(this.schema.getString("Action"))) {
            this.getActionRefs().add(new ActionBuilder(configuration, node, imageSet));
         }
      }

      log.log(Level.INFO, "Actions Finished Loading");
   }

   public String toString() {
      return "Action(" + this.getName() + "," + this.getType() + "," + this.getClassName() + ")";
   }

   public Action buildAction(Map<String, String> params) throws ActionInstantiationException {
      try {
         VariableMap variables = this.createVariables(params);
         List<Animation> animations = this.createAnimations();
         List<Action> actions = this.createActions();
         if (this.type.equals(this.schema.getString("Embedded"))) {
            try {
               Class cls = Class.forName(this.getClassName());

               try {
                  try {
                     return (Action)cls.getConstructor(ResourceBundle.class, List.class, VariableMap.class).newInstance(this.schema, animations, variables);
                  } catch (Exception var7) {
                     return (Action)cls.getConstructor(ResourceBundle.class, VariableMap.class).newInstance(this.schema, variables);
                  }
               } catch (Exception var8) {
                  return (Action)cls.newInstance();
               }
            } catch (InstantiationException var9) {
               throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("FailedClassActionInitialiseErrorMessage") + "(" + this + ")", var9);
            } catch (IllegalAccessException var10) {
               throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("CannotAccessClassActionErrorMessage") + "(" + this + ")", var10);
            } catch (ClassNotFoundException var11) {
               throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("ClassNotFoundErrorMessage") + "(" + this + ")", var11);
            }
         } else if (this.type.equals(this.schema.getString("Move"))) {
            return new Move(this.schema, animations, variables);
         } else if (this.type.equals(this.schema.getString("Stay"))) {
            return new Stay(this.schema, animations, variables);
         } else if (this.type.equals(this.schema.getString("Animate"))) {
            return new Animate(this.schema, animations, variables);
         } else if (this.type.equals(this.schema.getString("Sequence"))) {
            return new Sequence(this.schema, variables, (Action[])actions.toArray(new Action[0]));
         } else if (this.type.equals(this.schema.getString("Select"))) {
            return new Select(this.schema, variables, (Action[])actions.toArray(new Action[0]));
         } else {
            throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("UnknownActionTypeErrorMessage") + "(" + this + ")");
         }
      } catch (AnimationInstantiationException var12) {
         throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("FailedCreateAnimationErrorMessage") + "(" + this + ")", var12);
      } catch (VariableException var13) {
         throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("FailedParameterEvaluationErrorMessage") + "(" + this + ")", var13);
      }
   }

   public void validate() throws ConfigurationException {
      Iterator var1 = this.getActionRefs().iterator();

      while(var1.hasNext()) {
         IActionBuilder ref = (IActionBuilder)var1.next();
         ref.validate();
      }

   }

   private List<Action> createActions() throws ActionInstantiationException {
      List<Action> actions = new ArrayList();
      Iterator var2 = this.getActionRefs().iterator();

      while(var2.hasNext()) {
         IActionBuilder ref = (IActionBuilder)var2.next();
         actions.add(ref.buildAction(new HashMap()));
      }

      return actions;
   }

   private List<Animation> createAnimations() throws AnimationInstantiationException {
      List<Animation> animations = new ArrayList();
      Iterator var2 = this.getAnimationBuilders().iterator();

      while(var2.hasNext()) {
         AnimationBuilder animationFactory = (AnimationBuilder)var2.next();
         animations.add(animationFactory.buildAnimation());
      }

      return animations;
   }

   private VariableMap createVariables(Map<String, String> params) throws VariableException {
      VariableMap variables = new VariableMap();
      Iterator var3 = this.getParams().entrySet().iterator();

      java.util.Map.Entry param;
      while(var3.hasNext()) {
         param = (java.util.Map.Entry)var3.next();
         variables.put((String)((String)param.getKey()), Variable.parse((String)param.getValue()));
      }

      var3 = params.entrySet().iterator();

      while(var3.hasNext()) {
         param = (java.util.Map.Entry)var3.next();
         variables.put((String)((String)param.getKey()), Variable.parse((String)param.getValue()));
      }

      return variables;
   }

   public String getName() {
      return this.name;
   }

   public String getType() {
      return this.type;
   }

   private String getClassName() {
      return this.className;
   }

   private Map<String, String> getParams() {
      return this.params;
   }

   private List<AnimationBuilder> getAnimationBuilders() {
      return this.animationBuilders;
   }

   private List<IActionBuilder> getActionRefs() {
      return this.actionRefs;
   }
}
