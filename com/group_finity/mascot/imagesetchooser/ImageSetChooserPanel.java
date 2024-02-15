package com.group_finity.mascot.imagesetchooser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ImageSetChooserPanel extends JPanel {
   private JLabel actionsFile;
   private JLabel behaviorsFile;
   private JCheckBox checkbox;
   private JLabel image;
   private JLabel name;

   public ImageSetChooserPanel() {
      this.initComponents();
   }

   public ImageSetChooserPanel(String name, String actions, String behaviors, String imageLocation) {
      this.initComponents();
      this.name.setText(name);
      this.actionsFile.setText(actions);
      this.behaviorsFile.setText(behaviors);

      try {
         BufferedImage img = ImageIO.read(new File(imageLocation));
         this.image.setIcon(new ImageIcon(img.getScaledInstance(60, 60, 1)));
      } catch (Exception var6) {
      }

   }

   public void setCheckbox(boolean value) {
      this.checkbox.setSelected(value);
   }

   public String getImageSetName() {
      return this.name.getText();
   }

   private void initComponents() {
      this.checkbox = new JCheckBox();
      this.name = new JLabel();
      this.actionsFile = new JLabel();
      this.behaviorsFile = new JLabel();
      this.image = new JLabel();
      this.setBorder(BorderFactory.createEtchedBorder());
      this.setMinimumSize(new Dimension(248, 80));
      this.setPreferredSize(new Dimension(248, 80));
      this.setLayout(new AbsoluteLayout());
      this.checkbox.setOpaque(false);
      this.add(this.checkbox, new AbsoluteConstraints(10, 30, -1, -1));
      this.name.setText("Builder");
      this.add(this.name, new AbsoluteConstraints(110, 10, -1, -1));
      this.actionsFile.setText("img/Builder/conf/actionsxml");
      this.add(this.actionsFile, new AbsoluteConstraints(110, 30, -1, -1));
      this.behaviorsFile.setText("img/Builder/conf/behaviors.xml");
      this.add(this.behaviorsFile, new AbsoluteConstraints(110, 50, -1, -1));
      this.image.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      this.add(this.image, new AbsoluteConstraints(40, 10, 60, 60));
   }
}
