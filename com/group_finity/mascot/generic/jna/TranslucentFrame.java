package com.group_finity.mascot.generic.jna;

import com.sun.jna.examples.WindowUtils;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JWindow;

public class TranslucentFrame extends JWindow {
   private static final long serialVersionUID = 1L;
   private float alpha = 1.0F;

   public TranslucentFrame() {
      super(WindowUtils.getAlphaCompatibleGraphicsConfiguration());
      this.init();
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
}
