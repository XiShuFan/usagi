package com.group_finity.mascot.config;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.action.Action;
import com.group_finity.mascot.exception.ActionInstantiationException;
import com.group_finity.mascot.exception.ConfigurationException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionRef implements IActionBuilder {
   private static final Logger log = Logger.getLogger(ActionRef.class.getName());
   private final Configuration configuration;
   private final String name;
   private final Map<String, String> params = new LinkedHashMap();

   public ActionRef(Configuration configuration, Entry refNode) {
      this.configuration = configuration;
      this.name = refNode.getAttribute(configuration.getSchema().getString("Name"));
      this.getParams().putAll(refNode.getAttributes());
      log.log(Level.INFO, "Read Action Reference({0})", this);
   }

   public String toString() {
      return "Action(" + this.getName() + ")";
   }

   private String getName() {
      return this.name;
   }

   private Map<String, String> getParams() {
      return this.params;
   }

   private Configuration getConfiguration() {
      return this.configuration;
   }

   public void validate() throws ConfigurationException {
      if (!this.getConfiguration().getActionBuilders().containsKey(this.getName())) {
         log.log(Level.SEVERE, "There is no corresponding behavior(" + this + ")");
         throw new ConfigurationException(Main.getInstance().getLanguageBundle().getString("NoBehaviourFoundErrorMessage") + "(" + this + ")");
      }
   }

   public Action buildAction(Map<String, String> params) throws ActionInstantiationException {
      Map<String, String> newParams = new LinkedHashMap(params);
      newParams.putAll(this.getParams());
      return this.getConfiguration().buildAction(this.getName(), newParams);
   }
}
