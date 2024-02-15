package com.group_finity.mascot.image;

import javax.swing.JWindow;

public interface TranslucentWindow {
   JWindow asJWindow();

   void setImage(NativeImage var1);

   void updateImage();
}
