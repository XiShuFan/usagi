package com.joconner.i18n;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Utf8ResourceBundleControl extends PackageableResourceControl {
   public Utf8ResourceBundleControl() {
   }

   public Utf8ResourceBundleControl(boolean isPackageBased) {
      super(isPackageBased);
   }

   public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
      String bundleName = this.toBundleName(baseName, locale);
      ResourceBundle bundle = null;
      if (format.equals("java.class")) {
         bundle = super.newBundle(baseName, locale, format, loader, reload);
      } else {
         if (!format.equals("java.properties")) {
            throw new IllegalArgumentException("Unknown format: " + format);
         }

         String resourceName = bundleName.contains("://") ? null : this.toResourceName(bundleName, "properties");
         if (resourceName == null) {
            return (ResourceBundle)bundle;
         }

         InputStream stream = null;
         if (reload) {
            stream = this.reload(resourceName, loader);
         } else {
            stream = loader.getResourceAsStream(resourceName);
         }

         if (stream != null) {
            InputStreamReader reader = new InputStreamReader(stream, "UTF-8");

            try {
               bundle = new PropertyResourceBundle(reader);
            } finally {
               reader.close();
            }
         }
      }

      return (ResourceBundle)bundle;
   }

   InputStream reload(String resourceName, ClassLoader classLoader) throws IOException {
      InputStream stream = null;
      URL url = classLoader.getResource(resourceName);
      if (url != null) {
         URLConnection connection = url.openConnection();
         if (connection != null) {
            connection.setUseCaches(false);
            stream = connection.getInputStream();
         }
      }

      return stream;
   }
}
