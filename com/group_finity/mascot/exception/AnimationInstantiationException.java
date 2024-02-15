package com.group_finity.mascot.exception;

public class AnimationInstantiationException extends Exception {
   private static final long serialVersionUID = 1L;

   public AnimationInstantiationException(String message) {
      super(message);
   }

   public AnimationInstantiationException(String message, Throwable cause) {
      super(message, cause);
   }
}
