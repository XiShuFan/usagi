package com.group_finity.mascot.environment;

import java.awt.Point;

public class NotOnBorder implements Border {
   public static final NotOnBorder INSTANCE = new NotOnBorder();

   private NotOnBorder() {
   }

   public boolean isOn(Point location) {
      return false;
   }

   public Point move(Point location) {
      return location;
   }
}
