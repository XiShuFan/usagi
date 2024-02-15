package com.group_finity.mascot.environment;

import java.awt.Point;

public class Location {
   private int x;
   private int y;
   private int dx;
   private int dy;

   public int getX() {
      return this.x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return this.y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int getDx() {
      return this.dx;
   }

   public void setDx(int dx) {
      this.dx = dx;
   }

   public int getDy() {
      return this.dy;
   }

   public void setDy(int dy) {
      this.dy = dy;
   }

   public void set(Point value) {
      this.setDx((this.getDx() + value.x - this.getX()) / 2);
      this.setDy((this.getDy() + value.y - this.getY()) / 2);
      this.setX(value.x);
      this.setY(value.y);
   }
}
