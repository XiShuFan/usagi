package com.group_finity.mascot.generic;

import com.group_finity.mascot.image.NativeImage;
import com.group_finity.mascot.image.TranslucentWindow;
import com.sun.jna.examples.WindowUtils;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JWindow;

class GenericTranslucentWindow extends JWindow implements TranslucentWindow {
   private static final long serialVersionUID = 1L;
   private GenericNativeImage image;
   private JPanel panel;
   private float alpha = 1.0F;

   public GenericTranslucentWindow() {
      super(WindowUtils.getAlphaCompatibleGraphicsConfiguration());
      this.init();
      this.panel = new JPanel() {
         private static final long serialVersionUID = 1L;

         protected void paintComponent(Graphics g) {
            g.drawImage(GenericTranslucentWindow.this.getImage().getManagedImage(), 0, 0, (ImageObserver)null);
         }
      };
      this.setContentPane(this.panel);
   }

   private void init() {
      System.setProperty("sun.java2d.noddraw", "true");
      System.setProperty("sun.java2d.opengl", "true");
   }

   public void setVisible(boolean b) {
      super.setVisible(b);
      if (b) {
         WindowUtils.setWindowTransparent(this, true);
      }

   }

   protected void addImpl(Component comp, Object constraints, int index) {
      super.addImpl(comp, constraints, index);
      if (comp instanceof JComponent) {
         JComponent jcomp = (JComponent)comp;
         jcomp.setOpaque(false);
      }

   }

   public void setAlpha(float alpha) {
      WindowUtils.setWindowAlpha(this, alpha);
   }

   public float getAlpha() {
      return this.alpha;
   }

   public JWindow asJWindow() {
      return this;
   }

   public String toString() {
      return "LayeredWindow[hashCode=" + this.hashCode() + ",bounds=" + this.getBounds() + "]";
   }

   public GenericNativeImage getImage() {
      return this.image;
   }

   public void setImage(NativeImage image) {
      this.image = (GenericNativeImage)image;
   }

   public void updateImage() {
      WindowUtils.setWindowMask(this, this.getImage().getIcon());
      this.validate();
      this.repaint();
   }
}
