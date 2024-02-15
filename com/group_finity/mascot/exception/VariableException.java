package com.group_finity.mascot.exception;

public class VariableException extends Exception {
   private static final long serialVersionUID = 1L;

   public VariableException(String message) {
      super(message);
   }

   public VariableException(String message, Throwable cause) {
      super(message, cause);
   }
}
