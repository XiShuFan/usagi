package com.group_finity.mascot.image;

import java.util.Enumeration;
import java.util.Hashtable;

public class ImagePairs {
   private static Hashtable<String, ImagePair> imagepairs = new Hashtable();

   public static void load(String filename, ImagePair imagepair) {
      if (!imagepairs.containsKey(filename)) {
         imagepairs.put(filename, imagepair);
      }

   }

   public static ImagePair getImagePair(String filename) {
      if (!imagepairs.containsKey(filename)) {
         return null;
      } else {
         ImagePair ip = (ImagePair)imagepairs.get(filename);
         return ip;
      }
   }

   public static boolean contains(String filename) {
      return imagepairs.containsKey(filename);
   }

   public static void clear() {
      imagepairs.clear();
   }

   public static void removeAll(String searchTerm) {
      if (!imagepairs.isEmpty()) {
         Enumeration key = imagepairs.keys();

         while(key.hasMoreElements()) {
            String filename = (String)key.nextElement();
            if (searchTerm.equals(filename.split("/")[1])) {
               imagepairs.remove(filename);
            }
         }

      }
   }

   public static MascotImage getImage(String filename, boolean isLookRight) {
      return !imagepairs.containsKey(filename) ? null : ((ImagePair)imagepairs.get(filename)).getImage(isLookRight);
   }
}
