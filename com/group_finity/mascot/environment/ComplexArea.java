package com.group_finity.mascot.environment;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ComplexArea {
   private Map<String, Area> areas = new HashMap();

   public void set(Map<String, Rectangle> rectangles) {
      this.retain(rectangles.keySet());
      Iterator var2 = rectangles.entrySet().iterator();

      while(var2.hasNext()) {
         Entry<String, Rectangle> e = (Entry)var2.next();
         this.set((String)e.getKey(), (Rectangle)e.getValue());
      }

   }

   public void set(String name, Rectangle value) {
      Iterator var3 = this.areas.values().iterator();

      Area area;
      do {
         if (!var3.hasNext()) {
            area = (Area)this.areas.get(name);
            if (area == null) {
               area = new Area();
               this.areas.put(name, area);
            }

            area.set(value);
            return;
         }

         area = (Area)var3.next();
      } while(area.getLeft() != value.x || area.getTop() != value.y || area.getWidth() != value.width || area.getHeight() != value.height);

   }

   public void retain(Collection<String> deviceNames) {
      Iterator i = this.areas.keySet().iterator();

      while(i.hasNext()) {
         String key = (String)i.next();
         if (!deviceNames.contains(key)) {
            i.remove();
         }
      }

   }

   public FloorCeiling getBottomBorder(Point location) {
      FloorCeiling ret = null;
      Iterator var3 = this.areas.values().iterator();

      Area area;
      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getBottomBorder().isOn(location)) {
            ret = area.getBottomBorder();
         }
      }

      var3 = this.areas.values().iterator();

      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getTopBorder().isOn(location)) {
            ret = null;
         }
      }

      return ret;
   }

   public FloorCeiling getTopBorder(Point location) {
      FloorCeiling ret = null;
      Iterator var3 = this.areas.values().iterator();

      Area area;
      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getTopBorder().isOn(location)) {
            ret = area.getTopBorder();
         }
      }

      var3 = this.areas.values().iterator();

      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getBottomBorder().isOn(location)) {
            ret = null;
         }
      }

      return ret;
   }

   public Wall getLeftBorder(Point location) {
      Wall ret = null;
      Iterator var3 = this.areas.values().iterator();

      Area area;
      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getLeftBorder().isOn(location)) {
            ret = area.getRightBorder();
         }
      }

      var3 = this.areas.values().iterator();

      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getRightBorder().isOn(location)) {
            ret = null;
         }
      }

      return ret;
   }

   public Wall getRightBorder(Point location) {
      Wall ret = null;
      Iterator var3 = this.areas.values().iterator();

      Area area;
      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getRightBorder().isOn(location)) {
            ret = area.getRightBorder();
         }
      }

      var3 = this.areas.values().iterator();

      while(var3.hasNext()) {
         area = (Area)var3.next();
         if (area.getLeftBorder().isOn(location)) {
            ret = null;
         }
      }

      return ret;
   }

   public Collection<Area> getAreas() {
      return this.areas.values();
   }
}
