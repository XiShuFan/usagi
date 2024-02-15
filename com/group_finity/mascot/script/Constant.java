package com.group_finity.mascot.script;

public class Constant extends Variable {
   private final Object value;

   public Constant(Object value) {
      this.value = value;
   }

   public String toString() {
      return this.value == null ? "null" : this.value.toString();
   }

   private Object getValue() {
      return this.value;
   }

   public void init() {
   }

   public void initFrame() {
   }

   public Object get(VariableMap variables) {
      return this.getValue();
   }
}
