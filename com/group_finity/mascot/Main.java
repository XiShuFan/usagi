package com.group_finity.mascot;

import com.group_finity.mascot.config.Configuration;
import com.group_finity.mascot.config.Entry;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.CantBeAliveException;
import com.group_finity.mascot.exception.ConfigurationException;
import com.group_finity.mascot.image.ImagePairs;
import com.group_finity.mascot.imagesetchooser.ImageSetChooser;
import com.group_finity.mascot.sound.Sounds;
import com.group_finity.mascot.win.WindowsInteractiveWindowForm;
import com.joconner.i18n.Utf8ResourceBundleControl;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;

import java.awt.*;
import java.awt.CheckboxMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {
   private static Main instance;
   // TODO: 日志类实例
   private static final Logger log = Logger.getLogger(Main.class.getName());
   // TODO: manager很重要，仔细看
   private final Manager manager = new Manager();
   // TODO: 加载properties配置文件
   private Properties properties = new Properties();
   // TODO: 操作系统架构
   private Platform platform;
   // TODO: 加载国际化和本地化资源比如语言
   private ResourceBundle languageBundle;
   // TODO: JFrame 是一个顶级窗口，用于创建应用程序的主窗口
   private static JFrame frame;
   private ArrayList<String> imageSets = new ArrayList();
   private Hashtable<String, Configuration> configurations = new Hashtable();
   // TODO: 菜单
   private PopupMenu menu;

   // TODO: 初始化设置
   static {
      try {
         LogManager.getLogManager().readConfiguration(new FileInputStream("conf/logging.properties"));
      } catch (SecurityException var1) {
         var1.printStackTrace();
      } catch (IOException var2) {
         var2.printStackTrace();
      } catch (OutOfMemoryError var3) {
         log.log(Level.SEVERE, "Out of Memory Exception.  There are probably have too many Shimeji mascots in the image folder for your computer to handle.  Select fewer image sets or move some to the img/unused folder and try again.", var3);
         showError("Out of Memory.  There are probably have too many \nShimeji mascots for your computer to handle.\nSelect fewer image sets or move some to the \nimg/unused folder and try again.");
         System.exit(0);
      }

      instance = new Main();
      frame = new JFrame();
   }

   public static Main getInstance() {
      return instance;
   }

   public static void showError(String message) {
      JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
   }

   public static void main(String[] args) {
      try {
         getInstance().run();
      } catch (OutOfMemoryError var2) {
         log.log(Level.SEVERE, "Out of Memory Exception.  There are probably have too many Shimeji mascots in the image folder for your computer to handle.  Select fewer image sets or move some to the img/unused folder and try again.", var2);
         showError("Out of Memory.  There are probably have too many \nShimeji mascots for your computer to handle.\nSelect fewer image sets or move some to the \nimg/unused folder and try again.");
         System.exit(0);
      }

   }

   public void run() {
      // TODO: 操作系统架构
      if (!System.getProperty("sun.arch.data.model").equals("64")) {
         this.platform = Platform.x86;
      } else {
         this.platform = Platform.x86_64;
      }

      this.properties = new Properties();

      try {
         FileInputStream input = new FileInputStream("conf/settings.properties");
         this.properties.load(input);
      } catch (FileNotFoundException var21) {
         var21.printStackTrace();
      } catch (IOException var22) {
         var22.printStackTrace();
      }

      try {
         Control utf8Control = new Utf8ResourceBundleControl(false);
         // TODO: Locale类用于表示特定的地理、文化和语言环境
         this.languageBundle = ResourceBundle.getBundle("conf/language", Locale.forLanguageTag(this.properties.getProperty("Language", "en-GB")), utf8Control);
      } catch (Exception var20) {
         showError("The default language file could not be loaded. Ensure that you have the latest shimeji language.properties in your conf directory.");
         this.exit();
      }

      // TODO: 桌宠默认一只，不可调整
      if (!Boolean.parseBoolean(this.properties.getProperty("AlwaysShowShimejiChooser", "false"))) {
         String[] var24 = this.properties.getProperty("ActiveShimeji", "").split("/");
         int var27 = var24.length;

         for(int i = 0; i < var27; ++i) {
            String set = var24[i];
            if (!set.trim().isEmpty()) {
               this.imageSets.add(set.trim());
            }
         }
      }

      // 这里是走不到的
      if (this.imageSets.isEmpty()) {
         this.imageSets = (new ImageSetChooser(frame, true)).display();
         if (this.imageSets == null) {
            this.exit();
         }
      }

      // TODO: 读取每一个宠物的配置文件
      for(int index = 0; index < this.imageSets.size(); ++index) {
         if (!this.loadConfiguration((String)this.imageSets.get(index))) {
            this.configurations.remove(this.imageSets.get(index));
            this.imageSets.remove(this.imageSets.get(index));
            --index;
         }
      }

      if (this.imageSets.isEmpty()) {
         this.exit();
      }

      // TODO: 桌面右下角小图标功能设置
      this.createTrayIcon();
      Iterator var26 = this.imageSets.iterator();

      while(var26.hasNext()) {
         String imageSet = (String)var26.next();
         this.createMascot(imageSet);
      }

      this.getManager().start();
   }

   private boolean loadConfiguration(String imageSet) {
      try {
         String workingDir = System.getProperty("user.dir");
         // TODO: 加载动作配置文件
         // 最低优先级：conf文件夹
         String filePath = workingDir + "/conf/";
         String actionsFile = filePath + "actions.xml";

         // 最高优先级：img文件夹
         filePath = workingDir + "/img/" + imageSet + "/conf/";
         if ((new File(filePath + "actions.xml")).exists()) {
            actionsFile = filePath + "actions.xml";
         }

         log.log(Level.INFO, imageSet + " Read Action File ({0})", actionsFile);
         Document actions = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(new File(actionsFile)));
         Configuration configuration = new Configuration();
         configuration.load(new Entry(actions.getDocumentElement()), imageSet);

         // TODO: 加载行为配置文件
         // 最低优先级：conf文件夹
         filePath = workingDir + "/conf/";
         String behaviorsFile = filePath + "behaviors.xml";

         // 最高优先级：img文件夹
         filePath = workingDir + "/img/" + imageSet + "/conf/";
         if ((new File(filePath + "behaviors.xml")).exists()) {
            behaviorsFile = filePath + "behaviors.xml";
         }

         log.log(Level.INFO, imageSet + " Read Behavior File ({0})", behaviorsFile);
         Document behaviors = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(new File(behaviorsFile)));
         configuration.load(new Entry(behaviors.getDocumentElement()), imageSet);
         configuration.validate();
         this.configurations.put(imageSet, configuration);
         return true;
      } catch (IOException var14) {
         log.log(Level.SEVERE, "Failed to load configuration files", var14);
         showError(this.languageBundle.getString("FailedLoadConfigErrorMessage") + "\n" + var14.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
      } catch (SAXException var15) {
         log.log(Level.SEVERE, "Failed to load configuration files", var15);
         showError(this.languageBundle.getString("FailedLoadConfigErrorMessage") + "\n" + var15.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
      } catch (ParserConfigurationException var16) {
         log.log(Level.SEVERE, "Failed to load configuration files", var16);
         showError(this.languageBundle.getString("FailedLoadConfigErrorMessage") + "\n" + var16.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
      } catch (ConfigurationException var17) {
         log.log(Level.SEVERE, "Failed to load configuration files", var17);
         showError(this.languageBundle.getString("FailedLoadConfigErrorMessage") + "\n" + var17.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
      } catch (Exception var18) {
         log.log(Level.SEVERE, "Failed to load configuration files", var18);
         showError(this.languageBundle.getString("FailedLoadConfigErrorMessage") + "\n" + var18.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
      }

      return false;
   }

   // TODO: 跟随鼠标
   private MenuItem FollowCursor() {
      MenuItem item = new MenuItem(Main.this.languageBundle.getString("FollowCursor"));
      item.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            Main.this.getManager().setBehaviorAll("ChaseMouse");
         }
      });
      return item;
   }

   // TODO: 关闭开启声音
   private CheckboxMenuItem SoundEffects() {
      final CheckboxMenuItem soundsMenu = new CheckboxMenuItem(Main.this.languageBundle.getString("SoundEffects"), Boolean.parseBoolean(Main.this.properties.getProperty("Sounds", "true")));
      soundsMenu.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            if (Boolean.parseBoolean(Main.this.properties.getProperty("Sounds", "true"))) {
               soundsMenu.setState(false);
               Main.this.properties.setProperty("Sounds", "false");
               Sounds.setMuted(true);
            } else {
               soundsMenu.setState(true);
               Main.this.properties.setProperty("Sounds", "true");
               Sounds.setMuted(false);
            }

            try {
               FileOutputStream output = new FileOutputStream("conf/settings.properties");

               try {
                  Main.this.properties.store(output, "Shimeji-ee Configuration Options");
               } finally {
                  output.close();
               }
            } catch (Exception var7) {
            }
         }
      });
      return soundsMenu;
   }

   // TODO: 关闭程序
   private MenuItem DismissAll() {
      MenuItem item = new MenuItem(Main.this.languageBundle.getString("DismissAll"));
      item.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Main.this.exit();
         }
      });
      return item;
   }

   private void createTrayIcon() {
      log.log(Level.INFO, "create a tray icon");

      try {
         // TODO: TrayIcon类的主要作用是在操作系统的托盘区域中创建一个图标，通常用于通知和交互
         TrayIcon icon = new TrayIcon(ImageIO.read(new FileInputStream("img/icon.png")), this.languageBundle.getString("ShimejiEE"));

         // 可交互按钮
         MenuItem btnFollowCursor = FollowCursor();
         CheckboxMenuItem soundsMenu = SoundEffects();
         MenuItem btnDismissAll = DismissAll();

         // TODO: 字体还是不太好看
         Font font = new Font("SansSerif", Font.PLAIN, 12);
         btnFollowCursor.setFont(font);
         soundsMenu.setFont(font);
         btnDismissAll.setFont(font);

         this.menu = new PopupMenu();
         this.menu.add(btnFollowCursor);
         this.menu.add(soundsMenu);
         this.menu.add(btnDismissAll);
         // 设置弹出菜单
         icon.setPopupMenu(this.menu);
         // 加入托盘
         SystemTray.getSystemTray().add(icon);
      } catch (IOException | AWTException var2) {
         log.log(Level.SEVERE, "Failed to create tray icon", var2);
         showError(this.languageBundle.getString("FailedDisplaySystemTrayErrorMessage") + "\n" + this.languageBundle.getString("SeeLogForDetails"));
         this.exit();
      }

   }

   public void createMascot(String imageSet) {
      log.log(Level.INFO, "create a mascot");
      // TODO: 创建mascot
      Mascot mascot = new Mascot(imageSet);
      mascot.setAnchor(new Point(-4000, -4000));
      mascot.setLookRight(Math.random() < 0.5D);

      try {
         // TODO: 给pet添加behavior
         mascot.setBehavior(this.getConfiguration(imageSet).buildBehavior((String)null, mascot));
         this.getManager().add(mascot);
      } catch (BehaviorInstantiationException var4) {
         log.log(Level.SEVERE, "Failed to initialize the first action", var4);
         showError(this.languageBundle.getString("FailedInitialiseFirstActionErrorMessage") + "\n" + var4.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
         mascot.dispose();
      } catch (CantBeAliveException var5) {
         log.log(Level.SEVERE, "Fatal Error", var5);
         showError(this.languageBundle.getString("FailedInitialiseFirstActionErrorMessage") + "\n" + var5.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
         mascot.dispose();
      } catch (Exception var6) {
         log.log(Level.SEVERE, imageSet + " fatal error, can not be started.", var6);
         showError(this.languageBundle.getString("CouldNotCreateShimejiErrorMessage") + imageSet + ".\n" + var6.getMessage() + "\n" + this.languageBundle.getString("SeeLogForDetails"));
         mascot.dispose();
      }

   }

   public Configuration getConfiguration(String imageSet) {
      return (Configuration)this.configurations.get(imageSet);
   }

   private Manager getManager() {
      return this.manager;
   }

   public Platform getPlatform() {
      return this.platform;
   }

   public Properties getProperties() {
      return this.properties;
   }

   public ResourceBundle getLanguageBundle() {
      return this.languageBundle;
   }

   public void exit() {
      this.getManager().disposeAll();
      this.getManager().stop();
      System.exit(0);
   }
}
