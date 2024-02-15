package com.group_finity.mascot.generic;

import com.group_finity.mascot.NativeFactory;
import com.group_finity.mascot.environment.Environment;
import com.group_finity.mascot.image.NativeImage;
import com.group_finity.mascot.image.TranslucentWindow;
import java.awt.image.BufferedImage;

public class NativeFactoryImpl extends NativeFactory {
   private Environment environment = new GenericEnvironment();

   public Environment getEnvironment() {
      return this.environment;
   }

   public NativeImage newNativeImage(BufferedImage src) {
      return new GenericNativeImage(src);
   }

   public TranslucentWindow newTransparentWindow() {
      return new GenericTranslucentWindow();
   }
}
