package com.group_finity.mascot.script;

import jdk.nashorn.api.scripting.ClassFilter;

public class ScriptFilter implements ClassFilter {
   public boolean exposeToScripts(String string) {
      return string.startsWith("com.group_finity.mascot");
   }
}
