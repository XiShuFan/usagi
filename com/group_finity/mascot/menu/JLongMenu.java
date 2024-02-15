package com.group_finity.mascot.menu;

import com.group_finity.mascot.Main;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JLongMenu extends JMenu {
   JLongMenu moreMenu = null;
   int maxItems = 15;

   public JLongMenu(String label) {
      super(label);
      JMenuItem getHeightMenu = new JMenuItem("Temporary");
      int menuItemHeight = getHeightMenu.getPreferredSize().height;
      int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
      this.maxItems = screenHeight / menuItemHeight - 2;
   }

   public JLongMenu(String label, int maxitems) {
      super(label);
      this.maxItems = maxitems;
   }

   public void setPopupMenuVisible(boolean b) {
      if (this.isEnabled()) {
         boolean isVisible = this.isPopupMenuVisible();
         if (b != isVisible) {
            this.isPopupMenuVisible();
            if (b && this.isShowing()) {
               Point p = this.getPopupMenuOrigin();
               this.getPopupMenu().show(this, p.x, p.y);
            } else {
               this.getPopupMenu().setVisible(false);
            }
         }

      }
   }

   protected Point getPopupMenuOrigin() {
      int x = 0;
      int y = 0;
      JPopupMenu pm = this.getPopupMenu();
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension s = this.getSize();
      Dimension pmSize = pm.getSize();
      if (pmSize.width == 0) {
         pmSize = pm.getPreferredSize();
      }

      Point position = this.getLocationOnScreen();
      Container parent = this.getParent();
      if (parent instanceof JPopupMenu) {
         if (this.getComponentOrientation() == ComponentOrientation.LEFT_TO_RIGHT) {
            if (position.x + s.width + pmSize.width < screenSize.width) {
               x = s.width;
            } else {
               x = 0 - pmSize.width;
            }
         } else if (position.x < pmSize.width) {
            x = s.width;
         } else {
            x = 0 - pmSize.width;
         }

         if (position.y + pmSize.height < screenSize.height) {
            y = 0;
         } else {
            y = s.height - pmSize.height;
            if (y < 0 - position.y) {
               y = 0 - position.y;
            }
         }
      } else {
         if (this.getComponentOrientation() == ComponentOrientation.LEFT_TO_RIGHT) {
            if (position.x + pmSize.width < screenSize.width) {
               x = 0;
            } else {
               x = s.width - pmSize.width;
            }
         } else if (position.x + s.width < pmSize.width) {
            x = 0;
         } else {
            x = s.width - pmSize.width;
         }

         if (position.y + s.height + pmSize.height < screenSize.height) {
            y = s.height;
         } else {
            y = 0 - pmSize.height;
            if (y < 0 - position.y) {
               y = 0 - position.y;
            }
         }
      }

      return new Point(x, y);
   }

   public JMenuItem add(JMenuItem item) {
      if (this.moreMenu != null) {
         return this.moreMenu.add(item);
      } else if (this.getItemCount() < this.maxItems) {
         return super.add(item);
      } else {
         this.moreMenu = new JLongMenu(Main.getInstance().getLanguageBundle().getString("More"), this.maxItems);
         super.add(this.moreMenu);
         return this.moreMenu.add(item);
      }
   }
}
