package com.group_finity.mascot.sound;

import com.group_finity.mascot.Main;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.sound.sampled.Clip;

public class Sounds {
   private static final Hashtable<String, Clip> SOUNDS = new Hashtable();

   public static void load(String filename, Clip clip) {
      if (!SOUNDS.containsKey(filename)) {
         SOUNDS.put(filename, clip);
      }

   }

   public static boolean contains(String filename) {
      return SOUNDS.containsKey(filename);
   }

   public static Clip getSound(String filename) {
      return !SOUNDS.containsKey(filename) ? null : (Clip)SOUNDS.get(filename);
   }

   public static ArrayList<Clip> getSoundsIgnoringVolume(String filename) {
      ArrayList<Clip> sounds = new ArrayList(5);
      Enumeration keys = SOUNDS.keys();

      while(keys.hasMoreElements()) {
         String soundName = (String)keys.nextElement();
         if (soundName.startsWith(filename)) {
            sounds.add(SOUNDS.get(soundName));
         }
      }

      return sounds;
   }

   public static boolean isMuted() {
      return !Boolean.parseBoolean(Main.getInstance().getProperties().getProperty("Sounds", "true"));
   }

   public static void setMuted(boolean mutedFlag) {
      if (mutedFlag) {
         Enumeration keys = SOUNDS.keys();

         while(keys.hasMoreElements()) {
            ((Clip)SOUNDS.get(keys.nextElement())).stop();
         }
      }

   }
}
