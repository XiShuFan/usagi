package com.group_finity.mascot.generic;

import com.group_finity.mascot.image.NativeImage;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

class GenericNativeImage implements NativeImage {
   private final BufferedImage managedImage;
   private final Icon icon;

   public GenericNativeImage(BufferedImage image) {
      this.managedImage = image;
      this.icon = new ImageIcon(image);
   }

   protected void finalize() throws Throwable {
      super.finalize();
   }

   public void flush() {
      this.getManagedImage().flush();
   }

   public Graphics getGraphics() {
      return this.getManagedImage().createGraphics();
   }

   public int getHeight() {
      return this.getManagedImage().getHeight();
   }

   public int getWidth() {
      return this.getManagedImage().getWidth();
   }

   public int getHeight(ImageObserver observer) {
      return this.getManagedImage().getHeight(observer);
   }

   public Object getProperty(String name, ImageObserver observer) {
      return this.getManagedImage().getProperty(name, observer);
   }

   public ImageProducer getSource() {
      return this.getManagedImage().getSource();
   }

   public int getWidth(ImageObserver observer) {
      return this.getManagedImage().getWidth(observer);
   }

   BufferedImage getManagedImage() {
      return this.managedImage;
   }

   public Icon getIcon() {
      return this.icon;
   }
}
