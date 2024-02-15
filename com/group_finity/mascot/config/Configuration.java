package com.group_finity.mascot.config;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.action.Action;
import com.group_finity.mascot.behavior.Behavior;
import com.group_finity.mascot.exception.ActionInstantiationException;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.ConfigurationException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import com.joconner.i18n.Utf8ResourceBundleControl;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.ResourceBundle.Control;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configuration {
   private static final Logger log = Logger.getLogger(Configuration.class.getName());
   private final Map<String, ActionBuilder> actionBuilders = new LinkedHashMap();
   private final Map<String, BehaviorBuilder> behaviorBuilders = new LinkedHashMap();
   private ResourceBundle schema;

   public void load(Entry configurationNode, String imageSet) throws IOException, ConfigurationException {
      log.log(Level.INFO, "Start Reading Configuration File...");
      Control utf8Control = new Utf8ResourceBundleControl(false);
      Locale locale;
      if (!configurationNode.hasChild("動作リスト") && !configurationNode.hasChild("行動リスト")) {
         locale = Locale.forLanguageTag("en-US");
      } else {
         locale = Locale.forLanguageTag("ja-JP");
      }

      this.schema = ResourceBundle.getBundle("conf/schema", locale, utf8Control);
      Iterator var5 = configurationNode.selectChildren(this.schema.getString("ActionList")).iterator();

      Entry list;
      while(var5.hasNext()) {
         list = (Entry)var5.next();
         log.log(Level.INFO, "Action List...");
         Iterator var7 = list.selectChildren(this.schema.getString("Action")).iterator();

         while(var7.hasNext()) {
            Entry node = (Entry)var7.next();
            ActionBuilder action = new ActionBuilder(this, node, imageSet);
            if (this.getActionBuilders().containsKey(action.getName())) {
               throw new ConfigurationException(Main.getInstance().getLanguageBundle().getString("DuplicateActionErrorMessage") + ": " + action.getName());
            }

            this.getActionBuilders().put(action.getName(), action);
         }
      }

      var5 = configurationNode.selectChildren(this.schema.getString("BehaviourList")).iterator();

      while(var5.hasNext()) {
         list = (Entry)var5.next();
         log.log(Level.INFO, "Behavior List...");
         this.loadBehaviors(list, new ArrayList());
      }

      log.log(Level.INFO, "Behavior List");
   }

   private void loadBehaviors(Entry list, List<String> conditions) {
      Iterator var3 = list.getChildren().iterator();

      while(var3.hasNext()) {
         Entry node = (Entry)var3.next();
         if (node.getName().equals(this.schema.getString("Condition"))) {
            List<String> newConditions = new ArrayList(conditions);
            newConditions.add(node.getAttribute(this.schema.getString("Condition")));
            this.loadBehaviors(node, newConditions);
         } else if (node.getName().equals(this.schema.getString("Behaviour"))) {
            BehaviorBuilder behavior = new BehaviorBuilder(this, node, conditions);
            this.getBehaviorBuilders().put(behavior.getName(), behavior);
         }
      }

   }

   public Action buildAction(String name, Map<String, String> params) throws ActionInstantiationException {
      ActionBuilder factory = (ActionBuilder)this.actionBuilders.get(name);
      if (factory == null) {
         throw new ActionInstantiationException(Main.getInstance().getLanguageBundle().getString("NoCorrespondingActionFoundErrorMessage") + ": " + name);
      } else {
         return factory.buildAction(params);
      }
   }

   public void validate() throws ConfigurationException {
      Iterator var1 = this.getActionBuilders().values().iterator();

      while(var1.hasNext()) {
         ActionBuilder builder = (ActionBuilder)var1.next();
         builder.validate();
      }

      var1 = this.getBehaviorBuilders().values().iterator();

      while(var1.hasNext()) {
         BehaviorBuilder builder = (BehaviorBuilder)var1.next();
         builder.validate();
      }

   }

   public Behavior buildBehavior(String previousName, Mascot mascot) throws BehaviorInstantiationException {
      VariableMap context = new VariableMap();
      context.put((String)"mascot", mascot);
      List<BehaviorBuilder> candidates = new ArrayList();
      long totalFrequency = 0L;
      Iterator var7 = this.getBehaviorBuilders().values().iterator();

      while(var7.hasNext()) {
         BehaviorBuilder behaviorFactory = (BehaviorBuilder)var7.next();

         try {
            if (behaviorFactory.isEffective(context)) {
               candidates.add(behaviorFactory);
               totalFrequency += (long)behaviorFactory.getFrequency();
            }
         } catch (VariableException var12) {
            log.log(Level.WARNING, "An error occurred calculating the frequency of the action", var12);
         }
      }

      if (previousName != null) {
         BehaviorBuilder previousBehaviorFactory = (BehaviorBuilder)this.getBehaviorBuilders().get(previousName);
         if (!previousBehaviorFactory.isNextAdditive()) {
            totalFrequency = 0L;
            candidates.clear();
         }

         Iterator var15 = previousBehaviorFactory.getNextBehaviorBuilders().iterator();

         while(var15.hasNext()) {
            BehaviorBuilder behaviorFactory = (BehaviorBuilder)var15.next();

            try {
               if (behaviorFactory.isEffective(context)) {
                  candidates.add(behaviorFactory);
                  totalFrequency += (long)behaviorFactory.getFrequency();
               }
            } catch (VariableException var11) {
               log.log(Level.WARNING, "An error occurred calculating the frequency of the behavior", var11);
            }
         }
      }

      if (totalFrequency == 0L) {
         if (Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Multiscreen", "true"))) {
            mascot.setAnchor(new Point((int)(Math.random() * (double)(mascot.getEnvironment().getScreen().getRight() - mascot.getEnvironment().getScreen().getLeft())) + mascot.getEnvironment().getScreen().getLeft(), mascot.getEnvironment().getScreen().getTop() - 256));
         } else {
            mascot.setAnchor(new Point((int)(Math.random() * (double)(mascot.getEnvironment().getWorkArea().getRight() - mascot.getEnvironment().getWorkArea().getLeft())) + mascot.getEnvironment().getWorkArea().getLeft(), mascot.getEnvironment().getWorkArea().getTop() - 256));
         }

         return this.buildBehavior(this.schema.getString("Fall"));
      } else {
         // TODO: 随机选取一个动作
         double random = Math.random() * (double)totalFrequency;
         Iterator var16 = candidates.iterator();

         BehaviorBuilder behaviorFactory;
         do {
            if (!var16.hasNext()) {
               return null;
            }

            behaviorFactory = (BehaviorBuilder)var16.next();
            random -= (double)behaviorFactory.getFrequency();
         } while(!(random < 0.0D));

         return behaviorFactory.buildBehavior();
      }
   }

   public Behavior buildBehavior(String name) throws BehaviorInstantiationException {
      return ((BehaviorBuilder)this.getBehaviorBuilders().get(name)).buildBehavior();
   }

   Map<String, ActionBuilder> getActionBuilders() {
      return this.actionBuilders;
   }

   private Map<String, BehaviorBuilder> getBehaviorBuilders() {
      return this.behaviorBuilders;
   }

   public Set<String> getBehaviorNames() {
      return this.behaviorBuilders.keySet();
   }

   public ResourceBundle getSchema() {
      return this.schema;
   }
}
