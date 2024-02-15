package com.joconner.i18n;

import java.util.Locale;
import java.util.ResourceBundle.Control;

public class PackageableResourceControl extends Control {
   boolean isPackageBased;

   public PackageableResourceControl() {
      this(true);
   }

   public PackageableResourceControl(boolean isPackageBased) {
      this.isPackageBased = isPackageBased;
   }

   public String toBundleName(String baseName, Locale locale) {
      String bundleName = null;
      if (this.isPackageBased) {
         int nBasePackage = baseName.lastIndexOf(".");
         String basePackageName = nBasePackage > 0 ? baseName.substring(0, nBasePackage) : "";
         String resName = nBasePackage > 0 ? baseName.substring(nBasePackage + 1) : baseName;
         String langSubPackage = locale.equals(Locale.ROOT) ? "" : locale.toLanguageTag().toLowerCase();
         StringBuilder strBuilder = new StringBuilder();
         if (nBasePackage > 0) {
            strBuilder.append(basePackageName).append(".");
         }

         if (langSubPackage.length() > 0) {
            strBuilder.append(langSubPackage).append(".");
         }

         strBuilder.append(resName);
         bundleName = strBuilder.toString();
      } else {
         bundleName = super.toBundleName(baseName, locale);
      }

      return bundleName;
   }
}
