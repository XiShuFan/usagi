package com.group_finity.mascot.imagesetchooser;

import com.group_finity.mascot.Main;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ImageSetChooser extends JDialog {
   private final String configFile = "./conf/settings.properties";
   private final String topDir = "./img";
   private ArrayList<String> imageSets = new ArrayList();
   private boolean closeProgram = true;
   private boolean selectAllSets = false;
   private JButton cancelButton;
   private JLabel clearAllLabel;
   private JLabel jLabel1;
   private JList jList1;
   private JList jList2;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel4;
   private JScrollPane jScrollPane1;
   private JLabel selectAllLabel;
   private JLabel slashLabel;
   private JButton useAllButton;
   private JButton useSelectedButton;

   public ImageSetChooser(Frame parent, boolean modal) {
      super(parent, modal);
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
      ArrayList<String> activeImageSets = this.readConfigFile();
      ArrayList<ImageSetChooserPanel> data1 = new ArrayList();
      ArrayList<ImageSetChooserPanel> data2 = new ArrayList();
      ArrayList<Integer> si1 = new ArrayList();
      ArrayList<Integer> si2 = new ArrayList();
      FilenameFilter fileFilter = new FilenameFilter() {
         public boolean accept(File dir, String name) {
            return !name.equalsIgnoreCase("unused") && !name.startsWith(".") ? (new File(dir + "/" + name)).isDirectory() : false;
         }
      };
      File dir = new File("./img");
      String[] children = dir.list(fileFilter);
      boolean onList1 = true;
      int row = 0;
      String[] var13 = children;
      int var14 = children.length;

      for(int var15 = 0; var15 < var14; ++var15) {
         String imageSet = var13[var15];
         String imageFile = "./img/" + imageSet + "/shime1.png";
         String filePath = "./conf/";
         String actionsFile = filePath + "actions.xml";
         if ((new File(filePath + "動作.xml")).exists()) {
            actionsFile = filePath + "動作.xml";
         }

         filePath = "./conf/" + imageSet + "/";
         if ((new File(filePath + "actions.xml")).exists()) {
            actionsFile = filePath + "actions.xml";
         }

         if ((new File(filePath + "動作.xml")).exists()) {
            actionsFile = filePath + "動作.xml";
         }

         if ((new File(filePath + "Õïòõ¢£.xml")).exists()) {
            actionsFile = filePath + "Õïòõ¢£.xml";
         }

         if ((new File(filePath + "¦-º@.xml")).exists()) {
            actionsFile = filePath + "¦-º@.xml";
         }

         if ((new File(filePath + "ô«ìý.xml")).exists()) {
            actionsFile = filePath + "ô«ìý.xml";
         }

         if ((new File(filePath + "one.xml")).exists()) {
            actionsFile = filePath + "one.xml";
         }

         if ((new File(filePath + "1.xml")).exists()) {
            actionsFile = filePath + "1.xml";
         }

         filePath = "./img/" + imageSet + "/conf/";
         if ((new File(filePath + "actions.xml")).exists()) {
            actionsFile = filePath + "actions.xml";
         }

         if ((new File(filePath + "動作.xml")).exists()) {
            actionsFile = filePath + "動作.xml";
         }

         if ((new File(filePath + "Õïòõ¢£.xml")).exists()) {
            actionsFile = filePath + "Õïòõ¢£.xml";
         }

         if ((new File(filePath + "¦-º@.xml")).exists()) {
            actionsFile = filePath + "¦-º@.xml";
         }

         if ((new File(filePath + "ô«ìý.xml")).exists()) {
            actionsFile = filePath + "ô«ìý.xml";
         }

         if ((new File(filePath + "one.xml")).exists()) {
            actionsFile = filePath + "one.xml";
         }

         if ((new File(filePath + "1.xml")).exists()) {
            actionsFile = filePath + "1.xml";
         }

         filePath = "./conf/";
         String behaviorsFile = filePath + "behaviors.xml";
         if ((new File(filePath + "行動.xml")).exists()) {
            behaviorsFile = filePath + "行動.xml";
         }

         filePath = "./conf/" + imageSet + "/";
         if ((new File(filePath + "behaviors.xml")).exists()) {
            behaviorsFile = filePath + "behaviors.xml";
         }

         if ((new File(filePath + "behavior.xml")).exists()) {
            behaviorsFile = filePath + "behavior.xml";
         }

         if ((new File(filePath + "行動.xml")).exists()) {
            behaviorsFile = filePath + "行動.xml";
         }

         if ((new File(filePath + "ÞíîÕïò.xml")).exists()) {
            behaviorsFile = filePath + "ÞíîÕïò.xml";
         }

         if ((new File(filePath + "ªµ¦-.xml")).exists()) {
            behaviorsFile = filePath + "ªµ¦-.xml";
         }

         if ((new File(filePath + "ìsô«.xml")).exists()) {
            behaviorsFile = filePath + "ìsô«.xml";
         }

         if ((new File(filePath + "two.xml")).exists()) {
            behaviorsFile = filePath + "two.xml";
         }

         if ((new File(filePath + "2.xml")).exists()) {
            behaviorsFile = filePath + "2.xml";
         }

         filePath = "./img/" + imageSet + "/conf/";
         if ((new File(filePath + "behaviors.xml")).exists()) {
            behaviorsFile = filePath + "behaviors.xml";
         }

         if ((new File(filePath + "behavior.xml")).exists()) {
            behaviorsFile = filePath + "behavior.xml";
         }

         if ((new File(filePath + "行動.xml")).exists()) {
            behaviorsFile = filePath + "行動.xml";
         }

         if ((new File(filePath + "ÞíîÕïò.xml")).exists()) {
            behaviorsFile = filePath + "ÞíîÕïò.xml";
         }

         if ((new File(filePath + "ªµ¦-.xml")).exists()) {
            behaviorsFile = filePath + "ªµ¦-.xml";
         }

         if ((new File(filePath + "ìsô«.xml")).exists()) {
            behaviorsFile = filePath + "ìsô«.xml";
         }

         if ((new File(filePath + "two.xml")).exists()) {
            behaviorsFile = filePath + "two.xml";
         }

         if ((new File(filePath + "2.xml")).exists()) {
            behaviorsFile = filePath + "2.xml";
         }

         if (onList1) {
            onList1 = false;
            data1.add(new ImageSetChooserPanel(imageSet, actionsFile, behaviorsFile, imageFile));
            if (activeImageSets.contains(imageSet) || this.selectAllSets) {
               si1.add(row);
            }
         } else {
            onList1 = true;
            data2.add(new ImageSetChooserPanel(imageSet, actionsFile, behaviorsFile, imageFile));
            if (activeImageSets.contains(imageSet) || this.selectAllSets) {
               si2.add(row);
            }

            ++row;
         }

         this.imageSets.add(imageSet);
      }

      this.setUpList1();
      this.jList1.setListData(data1.toArray());
      this.jList1.setSelectedIndices(this.convertIntegers(si1));
      this.setUpList2();
      this.jList2.setListData(data2.toArray());
      this.jList2.setSelectedIndices(this.convertIntegers(si2));
   }

   public ArrayList<String> display() {
      this.setTitle(Main.getInstance().getLanguageBundle().getString("ShimejiImageSetChooser"));
      this.jLabel1.setText(Main.getInstance().getLanguageBundle().getString("SelectImageSetsToUse"));
      this.useSelectedButton.setText(Main.getInstance().getLanguageBundle().getString("UseSelected"));
      this.useAllButton.setText(Main.getInstance().getLanguageBundle().getString("UseAll"));
      this.cancelButton.setText(Main.getInstance().getLanguageBundle().getString("Cancel"));
      this.clearAllLabel.setText(Main.getInstance().getLanguageBundle().getString("ClearAll"));
      this.selectAllLabel.setText(Main.getInstance().getLanguageBundle().getString("SelectAll"));
      this.setVisible(true);
      return this.closeProgram ? null : this.imageSets;
   }

   private ArrayList<String> readConfigFile() {
      ArrayList<String> activeImageSets = new ArrayList();
      activeImageSets.addAll(Arrays.asList(Main.getInstance().getProperties().getProperty("ActiveShimeji", "").split("/")));
      this.selectAllSets = ((String)activeImageSets.get(0)).trim().isEmpty();
      return activeImageSets;
   }

   private void updateConfigFile() {
      try {
         FileOutputStream output = new FileOutputStream("./conf/settings.properties");

         try {
            Main.getInstance().getProperties().setProperty("ActiveShimeji", this.imageSets.toString().replace("[", "").replace("]", "").replace(", ", "/"));
            Main.getInstance().getProperties().store(output, "Shimeji-ee Configuration Options");
         } finally {
            output.close();
         }
      } catch (Exception var6) {
      }

   }

   private void initComponents() {
      this.jScrollPane1 = new JScrollPane();
      this.jPanel2 = new JPanel();
      this.jList1 = new ShimejiList();
      this.jList2 = new ShimejiList();
      this.jLabel1 = new JLabel();
      this.jPanel1 = new JPanel();
      this.useSelectedButton = new JButton();
      this.useAllButton = new JButton();
      this.cancelButton = new JButton();
      this.jPanel4 = new JPanel();
      this.clearAllLabel = new JLabel();
      this.slashLabel = new JLabel();
      this.selectAllLabel = new JLabel();
      this.setDefaultCloseOperation(2);
      this.setTitle("Shimeji-ee Image Set Chooser");
      this.setMinimumSize(new Dimension(670, 495));
      this.jScrollPane1.setPreferredSize(new Dimension(518, 100));
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jList1, -1, 298, 32767).addGap(0, 0, 0).addComponent(this.jList2, -1, 300, 32767)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jList2, -1, 376, 32767).addComponent(this.jList1, -1, 376, 32767));
      this.jScrollPane1.setViewportView(this.jPanel2);
      this.jLabel1.setText("Select Image Sets to Use:");
      this.jPanel1.setLayout(new FlowLayout(1, 10, 5));
      this.useSelectedButton.setText("Use Selected");
      this.useSelectedButton.setMaximumSize(new Dimension(130, 26));
      this.useSelectedButton.setPreferredSize(new Dimension(130, 26));
      this.useSelectedButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ImageSetChooser.this.useSelectedButtonActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.useSelectedButton);
      this.useAllButton.setText("Use All");
      this.useAllButton.setMaximumSize(new Dimension(95, 23));
      this.useAllButton.setMinimumSize(new Dimension(95, 23));
      this.useAllButton.setPreferredSize(new Dimension(130, 26));
      this.useAllButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ImageSetChooser.this.useAllButtonActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.useAllButton);
      this.cancelButton.setText("Cancel");
      this.cancelButton.setMaximumSize(new Dimension(95, 23));
      this.cancelButton.setMinimumSize(new Dimension(95, 23));
      this.cancelButton.setPreferredSize(new Dimension(130, 26));
      this.cancelButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ImageSetChooser.this.cancelButtonActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.cancelButton);
      this.jPanel4.setLayout(new BoxLayout(this.jPanel4, 2));
      this.clearAllLabel.setForeground(new Color(0, 0, 204));
      this.clearAllLabel.setText("Clear All");
      this.clearAllLabel.setCursor(new Cursor(12));
      this.clearAllLabel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            ImageSetChooser.this.clearAllLabelMouseClicked(evt);
         }
      });
      this.jPanel4.add(this.clearAllLabel);
      this.slashLabel.setText(" / ");
      this.jPanel4.add(this.slashLabel);
      this.selectAllLabel.setForeground(new Color(0, 0, 204));
      this.selectAllLabel.setText("Select All");
      this.selectAllLabel.setCursor(new Cursor(12));
      this.selectAllLabel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            ImageSetChooser.this.selectAllLabelMouseClicked(evt);
         }
      });
      this.jPanel4.add(this.selectAllLabel);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, Alignment.TRAILING, -1, 600, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED, 384, 32767).addComponent(this.jPanel4, -2, -1, -2)).addComponent(this.jPanel1, -1, 600, 32767)).addContainerGap()));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel1).addComponent(this.jPanel4, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -1, 378, 32767).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel1, -2, -1, -2).addGap(11, 11, 11)));
      this.pack();
   }

   private void clearAllLabelMouseClicked(MouseEvent evt) {
      this.jList1.clearSelection();
      this.jList2.clearSelection();
   }

   private void selectAllLabelMouseClicked(MouseEvent evt) {
      this.jList1.setSelectionInterval(0, this.jList1.getModel().getSize() - 1);
      this.jList2.setSelectionInterval(0, this.jList2.getModel().getSize() - 1);
   }

   private void useSelectedButtonActionPerformed(ActionEvent evt) {
      this.imageSets.clear();
      Object[] var2 = this.jList1.getSelectedValues();
      int var3 = var2.length;

      int var4;
      Object obj;
      for(var4 = 0; var4 < var3; ++var4) {
         obj = var2[var4];
         if (obj instanceof ImageSetChooserPanel) {
            this.imageSets.add(((ImageSetChooserPanel)obj).getImageSetName());
         }
      }

      var2 = this.jList2.getSelectedValues();
      var3 = var2.length;

      for(var4 = 0; var4 < var3; ++var4) {
         obj = var2[var4];
         if (obj instanceof ImageSetChooserPanel) {
            this.imageSets.add(((ImageSetChooserPanel)obj).getImageSetName());
         }
      }

      this.updateConfigFile();
      this.closeProgram = false;
      this.dispose();
   }

   private void useAllButtonActionPerformed(ActionEvent evt) {
      this.closeProgram = false;
      this.dispose();
   }

   private void cancelButtonActionPerformed(ActionEvent evt) {
      this.dispose();
   }

   private int[] convertIntegers(List<Integer> integers) {
      int[] ret = new int[integers.size()];

      for(int i = 0; i < ret.length; ++i) {
         ret[i] = (Integer)integers.get(i);
      }

      return ret;
   }

   private void setUpList1() {
      this.jList1.setSelectionModel(new DefaultListSelectionModel() {
         public void setSelectionInterval(int index0, int index1) {
            if (this.isSelectedIndex(index0)) {
               super.removeSelectionInterval(index0, index1);
            } else {
               super.addSelectionInterval(index0, index1);
            }

         }
      });
   }

   private void setUpList2() {
      this.jList2.setSelectionModel(new DefaultListSelectionModel() {
         public void setSelectionInterval(int index0, int index1) {
            if (this.isSelectedIndex(index0)) {
               super.removeSelectionInterval(index0, index1);
            } else {
               super.addSelectionInterval(index0, index1);
            }

         }
      });
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new ImageSetChooser(new JFrame(), true)).display();
            System.exit(0);
         }
      });
   }
}
