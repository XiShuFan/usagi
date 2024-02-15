package com.group_finity.mascot.exception;

public class ActionInstantiationException extends Exception {
   private static final long serialVersionUID = 1L;

   public ActionInstantiationException(String message) {
      super(message);
   }

   public ActionInstantiationException(String message, Throwable cause) {
      super(message, cause);
   }
}
