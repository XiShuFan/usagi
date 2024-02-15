package com.group_finity.mascot;

import com.group_finity.mascot.behavior.Behavior;
import com.group_finity.mascot.config.Configuration;
import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.environment.MascotEnvironment;
import com.group_finity.mascot.exception.CantBeAliveException;
import com.group_finity.mascot.image.MascotImage;
import com.group_finity.mascot.image.TranslucentWindow;
import com.group_finity.mascot.menu.JLongMenu;
import com.group_finity.mascot.sound.Sounds;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Mascot {
   private static final long serialVersionUID = 1L;
   private static final Logger log = Logger.getLogger(Mascot.class.getName());
   // TODO: 原子类
   private static AtomicInteger lastId = new AtomicInteger();
   private final int id;
   // TODO: pet名字
   private String imageSet = "";
   // 透明窗口
   private final TranslucentWindow window = NativeFactory.getInstance().newTransparentWindow();
   private Manager manager = null;
   // TODO: pet的坐标
   private Point anchor = new Point(0, 0);
   private MascotImage image = null;
   // 朝右看
   private boolean lookRight = false;
   private Behavior behavior = null;
   private int time = 0;
   // 默认开启动画
   private boolean animating = true;
   private MascotEnvironment environment = new MascotEnvironment(this);
   // TODO: 音效
   private String sound = null;
   protected DebugWindow debugWindow = null;
   private ArrayList<String> affordances = new ArrayList(5);

   public Mascot(String imageSet) {
      this.id = lastId.incrementAndGet();
      this.imageSet = imageSet;
      log.log(Level.INFO, "Created a mascot ({0})", this);
      // TODO: 窗口永远顶层
      this.getWindow().asJWindow().setAlwaysOnTop(true);
      // TODO: 设置pet窗口的鼠标交互事件
      this.getWindow().asJWindow().addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            Mascot.this.mousePressed(e);
         }

         public void mouseReleased(MouseEvent e) {
            Mascot.this.mouseReleased(e);
         }
      });
   }

   public String toString() {
      return "mascot" + this.id;
   }

   // TODO: 鼠标点击事件
   private void mousePressed(MouseEvent event) {
      if (this.getBehavior() != null) {
         try {
            this.getBehavior().mousePressed(event);
         } catch (CantBeAliveException var3) {
            log.log(Level.SEVERE, "Fatal Error", var3);
            Main.showError(Main.getInstance().getLanguageBundle().getString("SevereShimejiErrorErrorMessage") + "\n" + var3.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
            this.dispose();
         }
      }

   }

   private void mouseReleased(final MouseEvent event) {
      if (event.isPopupTrigger()) {
         // TODO: 不要出现右键菜单
         // SwingUtilities.invokeLater(new Runnable() {
         //    public void run() {
         //       Mascot.this.showPopup(event.getX(), event.getY());
         //    }
         // });
      } else if (this.getBehavior() != null) {
         try {
            this.getBehavior().mouseReleased(event);
         } catch (CantBeAliveException var3) {
            log.log(Level.SEVERE, "Fatal Error", var3);
            Main.showError(Main.getInstance().getLanguageBundle().getString("SevereShimejiErrorErrorMessage") + "\n" + var3.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
            this.dispose();
         }
      }

   }

   // TODO: 自动调度的动作
   void tick() {
      if (this.isAnimating()) {
         if (this.getBehavior() != null) {
            try {
               // TODO: 下一个动作
               this.getBehavior().next();
            } catch (CantBeAliveException var3) {
               log.log(Level.SEVERE, "Fatal Error.", var3);
               Main.showError(Main.getInstance().getLanguageBundle().getString("CouldNotGetNextBehaviourErrorMessage") + "\n" + var3.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
               this.dispose();
            }

            this.setTime(this.getTime() + 1);
         }

         if (this.debugWindow != null) {
            this.debugWindow.setBehaviour(this.behavior.toString().substring(9, this.behavior.toString().length() - 1).replaceAll("([a-z])(IE)?([A-Z])", "$1 $2 $3").replaceAll("  ", " "));
            this.debugWindow.setShimejiX(this.anchor.x);
            this.debugWindow.setShimejiY(this.anchor.y);
            Area activeWindow = this.environment.getActiveIE();
            this.debugWindow.setWindowTitle(this.environment.getActiveIETitle());
            this.debugWindow.setWindowX(activeWindow.getLeft());
            this.debugWindow.setWindowY(activeWindow.getTop());
            this.debugWindow.setWindowWidth(activeWindow.getWidth());
            this.debugWindow.setWindowHeight(activeWindow.getHeight());
            Area workArea = this.environment.getWorkArea();
            this.debugWindow.setEnvironmentX(workArea.getLeft());
            this.debugWindow.setEnvironmentY(workArea.getTop());
            this.debugWindow.setEnvironmentWidth(workArea.getWidth());
            this.debugWindow.setEnvironmentHeight(workArea.getHeight());
         }
      }

   }

   // TODO: 应用当前的状态
   public void apply() {
      if (this.isAnimating()) {
         if (this.getImage() != null) {
            this.getWindow().asJWindow().setBounds(this.getBounds());
            this.getWindow().setImage(this.getImage().getImage());
            if (!this.getWindow().asJWindow().isVisible()) {
               this.getWindow().asJWindow().setVisible(true);
            }

            this.getWindow().updateImage();
         } else if (this.getWindow().asJWindow().isVisible()) {
            this.getWindow().asJWindow().setVisible(false);
         }

         if (this.sound != null && !Sounds.getSound(this.sound).isRunning() && !Sounds.isMuted()) {
            Sounds.getSound(this.sound).setMicrosecondPosition(0L);
            Sounds.getSound(this.sound).start();
         }
      }

   }

   public void dispose() {
      log.log(Level.INFO, "destroy mascot ({0})", this);
      if (this.debugWindow != null) {
         this.debugWindow.setVisible(false);
         this.debugWindow = null;
      }

      this.animating = false;
      this.getWindow().asJWindow().dispose();
      if (this.getManager() != null) {
         this.getManager().remove(this);
      }

   }

   public Manager getManager() {
      return this.manager;
   }

   public void setManager(Manager manager) {
      this.manager = manager;
   }

   public Point getAnchor() {
      return this.anchor;
   }

   public void setAnchor(Point anchor) {
      this.anchor = anchor;
   }

   public MascotImage getImage() {
      return this.image;
   }

   public void setImage(MascotImage image) {
      this.image = image;
   }

   public boolean isLookRight() {
      return this.lookRight;
   }

   public void setLookRight(boolean lookRight) {
      this.lookRight = lookRight;
   }

   public Rectangle getBounds() {
      if (this.getImage() != null) {
         int top = this.getAnchor().y - this.getImage().getCenter().y;
         int left = this.getAnchor().x - this.getImage().getCenter().x;
         int scaling = Integer.parseInt(Main.getInstance().getProperties().getProperty("Scaling", "1"));
         Rectangle result = new Rectangle(left, top, this.getImage().getSize().width * scaling, this.getImage().getSize().height * scaling);
         return result;
      } else {
         return this.getWindow().asJWindow().getBounds();
      }
   }

   public int getTime() {
      return this.time;
   }

   private void setTime(int time) {
      this.time = time;
   }

   public Behavior getBehavior() {
      return this.behavior;
   }

   public void setBehavior(Behavior behavior) throws CantBeAliveException {
      this.behavior = behavior;
      this.behavior.init(this);
   }

   public int getCount() {
      return this.getManager().getCount(this.imageSet);
   }

   public int getTotalCount() {
      return this.getManager().getCount();
   }

   private boolean isAnimating() {
      return this.animating;
   }

   private void setAnimating(boolean animating) {
      this.animating = animating;
   }

   private TranslucentWindow getWindow() {
      return this.window;
   }

   public MascotEnvironment getEnvironment() {
      return this.environment;
   }

   public ArrayList<String> getAffordances() {
      return this.affordances;
   }

   public void setImageSet(String set) {
      this.imageSet = set;
   }

   public String getImageSet() {
      return this.imageSet;
   }

   public String getSound() {
      return this.sound;
   }

   public void setSound(String name) {
      this.sound = name;
   }
}
