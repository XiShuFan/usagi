package com.group_finity.mascot.environment;

import java.awt.Point;

public class Wall implements Border {
   private Area area;
   private boolean right;

   public Wall(Area area, boolean right) {
      this.area = area;
      this.right = right;
   }

   public Area getArea() {
      return this.area;
   }

   public boolean isRight() {
      return this.right;
   }

   public int getX() {
      return this.isRight() ? this.getArea().getRight() : this.getArea().getLeft();
   }

   public int getTop() {
      return this.getArea().getTop();
   }

   public int getBottom() {
      return this.getArea().getBottom();
   }

   public int getDX() {
      return this.isRight() ? this.getArea().getDright() : this.getArea().getDleft();
   }

   public int getDTop() {
      return this.getArea().getDtop();
   }

   public int getDBottom() {
      return this.getArea().getDbottom();
   }

   public int getHeight() {
      return this.getArea().getHeight();
   }

   public boolean isOn(Point location) {
      return this.getArea().isVisible() && this.getX() == location.x && this.getTop() <= location.y && location.y <= this.getBottom();
   }

   public Point move(Point location) {
      if (!this.getArea().isVisible()) {
         return location;
      } else {
         int d = this.getBottom() - this.getDBottom() - (this.getTop() - this.getDTop());
         if (d == 0) {
            return location;
         } else {
            Point newLocation = new Point(location.x + this.getDX(), (location.y - (this.getTop() - this.getDTop())) * (this.getBottom() - this.getTop()) / d + this.getTop());
            return Math.abs(newLocation.x - location.x) < 80 && Math.abs(newLocation.y - location.y) < 80 ? newLocation : location;
         }
      }
   }
}
