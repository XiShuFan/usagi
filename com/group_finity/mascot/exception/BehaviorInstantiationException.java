package com.group_finity.mascot.exception;

public class BehaviorInstantiationException extends Exception {
   private static final long serialVersionUID = 1L;

   public BehaviorInstantiationException(String message) {
      super(message);
   }

   public BehaviorInstantiationException(String message, Throwable cause) {
      super(message, cause);
   }
}
