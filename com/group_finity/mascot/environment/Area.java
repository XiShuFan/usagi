package com.group_finity.mascot.environment;

import java.awt.Rectangle;

public class Area {
   private boolean visible = true;
   private int left;
   private int top;
   private int right;
   private int bottom;
   private int dleft;
   private int dtop;
   private int dright;
   private int dbottom;
   private final Wall leftBorder = new Wall(this, false);
   private final FloorCeiling topBorder = new FloorCeiling(this, false);
   private final Wall rightBorder = new Wall(this, true);
   private final FloorCeiling bottomBorder = new FloorCeiling(this, true);

   public boolean isVisible() {
      return this.visible;
   }

   public void setVisible(boolean visible) {
      this.visible = visible;
   }

   public int getLeft() {
      return this.left;
   }

   public void setLeft(int left) {
      this.left = left;
   }

   public int getTop() {
      return this.top;
   }

   public void setTop(int top) {
      this.top = top;
   }

   public int getRight() {
      return this.right;
   }

   public void setRight(int right) {
      this.right = right;
   }

   public int getBottom() {
      return this.bottom;
   }

   public void setBottom(int bottom) {
      this.bottom = bottom;
   }

   public int getDleft() {
      return this.dleft;
   }

   public void setDleft(int dleft) {
      this.dleft = dleft;
   }

   public int getDtop() {
      return this.dtop;
   }

   public void setDtop(int dtop) {
      this.dtop = dtop;
   }

   public int getDright() {
      return this.dright;
   }

   public void setDright(int dright) {
      this.dright = dright;
   }

   public int getDbottom() {
      return this.dbottom;
   }

   public void setDbottom(int dbottom) {
      this.dbottom = dbottom;
   }

   public Wall getLeftBorder() {
      return this.leftBorder;
   }

   public FloorCeiling getTopBorder() {
      return this.topBorder;
   }

   public Wall getRightBorder() {
      return this.rightBorder;
   }

   public FloorCeiling getBottomBorder() {
      return this.bottomBorder;
   }

   public int getWidth() {
      return this.getRight() - this.getLeft();
   }

   public int getHeight() {
      return this.getBottom() - this.getTop();
   }

   public void set(Rectangle value) {
      this.setDleft(value.x - this.getLeft());
      this.setDtop(value.y - this.getTop());
      this.setDright(value.x + value.width - this.getRight());
      this.setDbottom(value.y + value.height - this.getBottom());
      this.setLeft(value.x);
      this.setTop(value.y);
      this.setRight(value.x + value.width);
      this.setBottom(value.y + value.height);
   }

   public boolean contains(int x, int y) {
      return this.getLeft() <= x && x <= this.getRight() && this.getTop() <= y && y <= this.getBottom();
   }

   public Rectangle toRectangle() {
      return new Rectangle(this.left, this.top, this.right - this.left, this.bottom - this.top);
   }

   public String toString() {
      return "Area [left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + "]";
   }
}
