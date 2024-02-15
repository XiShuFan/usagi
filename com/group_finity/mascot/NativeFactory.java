package com.group_finity.mascot;

import com.group_finity.mascot.environment.Environment;
import com.group_finity.mascot.image.NativeImage;
import com.group_finity.mascot.image.TranslucentWindow;
import java.awt.image.BufferedImage;

public abstract class NativeFactory {
   private static final NativeFactory instance;

   public static NativeFactory getInstance() {
      return instance;
   }

   public abstract Environment getEnvironment();

   public abstract NativeImage newNativeImage(BufferedImage var1);

   public abstract TranslucentWindow newTransparentWindow();

   static {
      String subpkg = "generic";
      if (com.sun.jna.Platform.isWindows()) {
         subpkg = "win";
      } else if (com.sun.jna.Platform.isMac()) {
         subpkg = "mac";
      }

      String basepkg = NativeFactory.class.getName();
      basepkg = basepkg.substring(0, basepkg.lastIndexOf(46));

      try {
         Class<? extends NativeFactory> impl = (Class<? extends NativeFactory>) Class.forName(basepkg + "." + subpkg + ".NativeFactoryImpl");
         instance = (NativeFactory)impl.newInstance();
      } catch (ClassNotFoundException var3) {
         throw new RuntimeException(var3);
      } catch (InstantiationException var4) {
         throw new RuntimeException(var4);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException(var5);
      }
   }
}
