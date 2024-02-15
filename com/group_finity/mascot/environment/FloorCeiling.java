package com.group_finity.mascot.environment;

import java.awt.Point;

public class FloorCeiling implements Border {
   private Area area;
   private boolean bottom;

   public FloorCeiling(Area area, boolean bottom) {
      this.area = area;
      this.bottom = bottom;
   }

   public Area getArea() {
      return this.area;
   }

   public boolean isBottom() {
      return this.bottom;
   }

   public int getY() {
      return this.isBottom() ? this.getArea().getBottom() : this.getArea().getTop();
   }

   public int getLeft() {
      return this.getArea().getLeft();
   }

   public int getRight() {
      return this.getArea().getRight();
   }

   public int getDY() {
      return this.isBottom() ? this.getArea().getDbottom() : this.getArea().getDtop();
   }

   public int getDLeft() {
      return this.getArea().getDleft();
   }

   public int getDRight() {
      return this.getArea().getDright();
   }

   public int getWidth() {
      return this.getArea().getWidth();
   }

   public boolean isOn(Point location) {
      return this.getArea().isVisible() && this.getY() == location.y && this.getLeft() <= location.x && location.x <= this.getRight();
   }

   public Point move(Point location) {
      if (!this.getArea().isVisible()) {
         return location;
      } else {
         int d = this.getRight() - this.getDRight() - (this.getLeft() - this.getDLeft());
         if (d == 0) {
            return location;
         } else {
            Point newLocation = new Point((location.x - (this.getLeft() - this.getDLeft())) * ((this.getRight() - this.getLeft()) / d) + this.getLeft(), location.y + this.getDY());
            return Math.abs(newLocation.x - location.x) < 80 && newLocation.y - location.y <= 20 && newLocation.y - location.y >= -80 ? newLocation : location;
         }
      }
   }
}
