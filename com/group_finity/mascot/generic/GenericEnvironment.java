package com.group_finity.mascot.generic;

import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.environment.Environment;
import java.awt.Point;

class GenericEnvironment extends Environment {
   private Area activeIE = new Area();

   public void tick() {
      super.tick();
      this.activeIE.setVisible(false);
   }

   public void moveActiveIE(Point point) {
   }

   public void restoreIE() {
   }

   public Area getWorkArea() {
      return this.getScreen();
   }

   public Area getActiveIE() {
      return this.activeIE;
   }

   public String getActiveIETitle() {
      return null;
   }

   public void refreshCache() {
   }
}
