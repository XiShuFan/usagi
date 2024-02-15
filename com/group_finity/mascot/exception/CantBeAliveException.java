package com.group_finity.mascot.exception;

public class CantBeAliveException extends Exception {
   private static final long serialVersionUID = 1L;

   public CantBeAliveException(String message) {
      super(message);
   }

   public CantBeAliveException(String message, Throwable cause) {
      super(message, cause);
   }
}
