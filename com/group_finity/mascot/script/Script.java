package com.group_finity.mascot.script;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.exception.VariableException;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

public class Script extends Variable {
   private static final ScriptEngine engine = (new NashornScriptEngineFactory()).getScriptEngine(new ScriptFilter());
   private final String source;
   private final boolean clearAtInitFrame;
   private final CompiledScript compiled;
   private Object value;

   public Script(String source, boolean clearAtInitFrame) throws VariableException {
      this.source = source;
      this.clearAtInitFrame = clearAtInitFrame;

      try {
         this.compiled = ((Compilable)engine).compile(this.source);
      } catch (ScriptException var4) {
         throw new VariableException(Main.getInstance().getLanguageBundle().getString("ScriptCompilationErrorMessage") + ": " + this.source, var4);
      }
   }

   public String toString() {
      return this.isClearAtInitFrame() ? "#{" + this.getSource() + "}" : "${" + this.getSource() + "}";
   }

   public void init() {
      this.setValue((Object)null);
   }

   public void initFrame() {
      if (this.isClearAtInitFrame()) {
         this.setValue((Object)null);
      }

   }

   public synchronized Object get(VariableMap variables) throws VariableException {
      if (this.getValue() != null) {
         return this.getValue();
      } else {
         try {
            // TODO: 判断当前pet是否满足行为执行的条件
            this.setValue(this.getCompiled().eval(variables));
         } catch (ScriptException var3) {
            throw new VariableException(Main.getInstance().getLanguageBundle().getString("ScriptEvaluationErrorMessage") + ": " + this.source, var3);
         }

         return this.getValue();
      }
   }

   private void setValue(Object value) {
      this.value = value;
   }

   private Object getValue() {
      return this.value;
   }

   private boolean isClearAtInitFrame() {
      return this.clearAtInitFrame;
   }

   private CompiledScript getCompiled() {
      return this.compiled;
   }

   private String getSource() {
      return this.source;
   }
}
