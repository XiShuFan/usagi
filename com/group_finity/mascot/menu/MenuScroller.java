package com.group_finity.mascot.menu;

import com.group_finity.mascot.Main;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.MenuSelectionManager;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class MenuScroller {
   private JPopupMenu menu;
   private Component[] menuItems;
   private MenuScroller.MenuScrollItem upItem;
   private MenuScroller.MenuScrollItem downItem;
   private final MenuScroller.MenuScrollListener menuListener;
   private int scrollCount;
   private int interval;
   private int topFixedCount;
   private int bottomFixedCount;
   private int firstIndex;
   private int keepVisibleIndex;

   public static MenuScroller setScrollerFor(JMenu menu) {
      return new MenuScroller(menu);
   }

   public static MenuScroller setScrollerFor(JPopupMenu menu) {
      return new MenuScroller(menu);
   }

   public static MenuScroller setScrollerFor(JMenu menu, int scrollCount) {
      return new MenuScroller(menu, scrollCount);
   }

   public static MenuScroller setScrollerFor(JPopupMenu menu, int scrollCount) {
      return new MenuScroller(menu, scrollCount);
   }

   public static MenuScroller setScrollerFor(JMenu menu, int scrollCount, int interval) {
      return new MenuScroller(menu, scrollCount, interval);
   }

   public static MenuScroller setScrollerFor(JPopupMenu menu, int scrollCount, int interval) {
      return new MenuScroller(menu, scrollCount, interval);
   }

   public static MenuScroller setScrollerFor(JMenu menu, int scrollCount, int interval, int topFixedCount, int bottomFixedCount) {
      return new MenuScroller(menu, scrollCount, interval, topFixedCount, bottomFixedCount);
   }

   public static MenuScroller setScrollerFor(JPopupMenu menu, int scrollCount, int interval, int topFixedCount, int bottomFixedCount) {
      return new MenuScroller(menu, scrollCount, interval, topFixedCount, bottomFixedCount);
   }

   public MenuScroller(JMenu menu) {
      this((JMenu)menu, 15);
   }

   public MenuScroller(JPopupMenu menu) {
      this((JPopupMenu)menu, 15);
   }

   public MenuScroller(JMenu menu, int scrollCount) {
      this((JMenu)menu, scrollCount, 150);
   }

   public MenuScroller(JPopupMenu menu, int scrollCount) {
      this((JPopupMenu)menu, scrollCount, 150);
   }

   public MenuScroller(JMenu menu, int scrollCount, int interval) {
      this((JMenu)menu, scrollCount, interval, 0, 0);
   }

   public MenuScroller(JPopupMenu menu, int scrollCount, int interval) {
      this((JPopupMenu)menu, scrollCount, interval, 0, 0);
   }

   public MenuScroller(JMenu menu, int scrollCount, int interval, int topFixedCount, int bottomFixedCount) {
      this(menu.getPopupMenu(), scrollCount, interval, topFixedCount, bottomFixedCount);
   }

   public MenuScroller(JPopupMenu menu, int scrollCount, int interval, int topFixedCount, int bottomFixedCount) {
      this.menuListener = new MenuScroller.MenuScrollListener();
      this.firstIndex = 0;
      this.keepVisibleIndex = -1;
      if (scrollCount > 0 && interval > 0) {
         if (topFixedCount >= 0 && bottomFixedCount >= 0) {
            this.upItem = new MenuScroller.MenuScrollItem(MenuScroller.MenuIcon.UP, -1);
            this.downItem = new MenuScroller.MenuScrollItem(MenuScroller.MenuIcon.DOWN, 1);
            this.setScrollCount(scrollCount);
            this.setInterval(interval);
            this.setTopFixedCount(topFixedCount);
            this.setBottomFixedCount(bottomFixedCount);
            this.menu = menu;
            menu.addPopupMenuListener(this.menuListener);
         } else {
            throw new IllegalArgumentException(Main.getInstance().getLanguageBundle().getString("CountsCannotBeNegativeErrorMessage"));
         }
      } else {
         throw new IllegalArgumentException(Main.getInstance().getLanguageBundle().getString("ScrollCountIntervalBelowZeroErrorMessage"));
      }
   }

   public int getInterval() {
      return this.interval;
   }

   public void setInterval(int interval) {
      if (interval <= 0) {
         throw new IllegalArgumentException(Main.getInstance().getLanguageBundle().getString("IntervalBelowZeroErrorMessage"));
      } else {
         this.upItem.setInterval(interval);
         this.downItem.setInterval(interval);
         this.interval = interval;
      }
   }

   public int getscrollCount() {
      return this.scrollCount;
   }

   public void setScrollCount(int scrollCount) {
      if (scrollCount <= 0) {
         throw new IllegalArgumentException(Main.getInstance().getLanguageBundle().getString("ScrollCountErrorMessage"));
      } else {
         this.scrollCount = scrollCount;
         MenuSelectionManager.defaultManager().clearSelectedPath();
      }
   }

   public int getTopFixedCount() {
      return this.topFixedCount;
   }

   public void setTopFixedCount(int topFixedCount) {
      if (this.firstIndex <= topFixedCount) {
         this.firstIndex = topFixedCount;
      } else {
         this.firstIndex += topFixedCount - this.topFixedCount;
      }

      this.topFixedCount = topFixedCount;
   }

   public int getBottomFixedCount() {
      return this.bottomFixedCount;
   }

   public void setBottomFixedCount(int bottomFixedCount) {
      this.bottomFixedCount = bottomFixedCount;
   }

   public void keepVisible(JMenuItem item) {
      if (item == null) {
         this.keepVisibleIndex = -1;
      } else {
         int index = this.menu.getComponentIndex(item);
         this.keepVisibleIndex = index;
      }

   }

   public void keepVisible(int index) {
      this.keepVisibleIndex = index;
   }

   public void dispose() {
      if (this.menu != null) {
         this.menu.removePopupMenuListener(this.menuListener);
         this.menu = null;
      }

   }

   public void finalize() throws Throwable {
      this.dispose();
   }

   private void refreshMenu() {
      if (this.menuItems != null && this.menuItems.length > 0) {
         this.firstIndex = Math.max(this.topFixedCount, this.firstIndex);
         this.firstIndex = Math.min(this.menuItems.length - this.bottomFixedCount - this.scrollCount, this.firstIndex);
         this.upItem.setEnabled(this.firstIndex > this.topFixedCount);
         this.downItem.setEnabled(this.firstIndex + this.scrollCount < this.menuItems.length - this.bottomFixedCount);
         this.menu.removeAll();

         int i;
         for(i = 0; i < this.topFixedCount; ++i) {
            this.menu.add(this.menuItems[i]);
         }

         if (this.topFixedCount > 0) {
            this.menu.add(new JSeparator());
         }

         this.menu.add(this.upItem);

         for(i = this.firstIndex; i < this.scrollCount + this.firstIndex; ++i) {
            this.menu.add(this.menuItems[i]);
         }

         this.menu.add(this.downItem);
         if (this.bottomFixedCount > 0) {
            this.menu.add(new JSeparator());
         }

         for(i = this.menuItems.length - this.bottomFixedCount; i < this.menuItems.length; ++i) {
            this.menu.add(this.menuItems[i]);
         }

         JComponent parent = (JComponent)this.upItem.getParent();
         parent.revalidate();
         parent.repaint();
      }

   }

   private static enum MenuIcon implements Icon {
      UP(new int[]{9, 1, 9}),
      DOWN(new int[]{1, 9, 1});

      final int[] xPoints = new int[]{1, 5, 9};
      final int[] yPoints;

      private MenuIcon(int... yPoints) {
         this.yPoints = yPoints;
      }

      public void paintIcon(Component c, Graphics g, int x, int y) {
         Dimension size = c.getSize();
         Graphics g2 = g.create(size.width / 2 - 5, size.height / 2 - 5, 10, 10);
         g2.setColor(Color.GRAY);
         g2.drawPolygon(this.xPoints, this.yPoints, 3);
         if (c.isEnabled()) {
            g2.setColor(Color.BLACK);
            g2.fillPolygon(this.xPoints, this.yPoints, 3);
         }

         g2.dispose();
      }

      public int getIconWidth() {
         return 0;
      }

      public int getIconHeight() {
         return 10;
      }
   }

   private class MenuScrollItem extends JMenuItem implements ChangeListener {
      private MenuScroller.MenuScrollTimer timer;

      public MenuScrollItem(MenuScroller.MenuIcon icon, int increment) {
         this.setIcon(icon);
         this.setDisabledIcon(icon);
         this.timer = MenuScroller.this.new MenuScrollTimer(increment, MenuScroller.this.interval);
         this.addChangeListener(this);
      }

      public void setInterval(int interval) {
         this.timer.setDelay(interval);
      }

      public void stateChanged(ChangeEvent e) {
         if (this.isArmed() && !this.timer.isRunning()) {
            this.timer.start();
         }

         if (!this.isArmed() && this.timer.isRunning()) {
            this.timer.stop();
         }

      }
   }

   private class MenuScrollTimer extends Timer {
      public MenuScrollTimer(final int increment, int interval) {
         super(interval, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               MenuScroller.this.firstIndex = MenuScroller.this.firstIndex + increment;
               MenuScroller.this.refreshMenu();
            }
         });
      }
   }

   private class MenuScrollListener implements PopupMenuListener {
      private MenuScrollListener() {
      }

      public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
         this.setMenuItems();
         MenuScroller.this.refreshMenu();
      }

      public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
         this.restoreMenuItems();
      }

      public void popupMenuCanceled(PopupMenuEvent e) {
         this.restoreMenuItems();
      }

      private void setMenuItems() {
         MenuScroller.this.menuItems = MenuScroller.this.menu.getComponents();
         if (MenuScroller.this.keepVisibleIndex >= MenuScroller.this.topFixedCount && MenuScroller.this.keepVisibleIndex <= MenuScroller.this.menuItems.length - MenuScroller.this.bottomFixedCount && (MenuScroller.this.keepVisibleIndex > MenuScroller.this.firstIndex + MenuScroller.this.scrollCount || MenuScroller.this.keepVisibleIndex < MenuScroller.this.firstIndex)) {
            MenuScroller.this.firstIndex = Math.min(MenuScroller.this.firstIndex, MenuScroller.this.keepVisibleIndex);
            MenuScroller.this.firstIndex = Math.max(MenuScroller.this.firstIndex, MenuScroller.this.keepVisibleIndex - MenuScroller.this.scrollCount + 1);
         }

         if (MenuScroller.this.menuItems.length > MenuScroller.this.topFixedCount + MenuScroller.this.scrollCount + MenuScroller.this.bottomFixedCount) {
            MenuScroller.this.refreshMenu();
         }

      }

      private void restoreMenuItems() {
         MenuScroller.this.menu.removeAll();
         Component[] var1 = MenuScroller.this.menuItems;
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Component component = var1[var3];
            MenuScroller.this.menu.add(component);
         }

      }

      // $FF: synthetic method
      MenuScrollListener(Object x1) {
         this();
      }
   }
}
