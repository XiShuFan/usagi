package com.group_finity.mascot.action;

import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;
import com.group_finity.mascot.sound.Sounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;

public class Mute extends InstantAction {
   private static final Logger log = Logger.getLogger(Offset.class.getName());
   public static final String PARAMETER_SOUND = "Sound";
   private static final String DEFAULT_SOUND = null;

   public Mute(ResourceBundle schema, VariableMap params) {
      super(schema, params);
   }

   protected void apply() throws VariableException {
      String soundName = this.getSound();
      if (soundName != null) {
         ArrayList<Clip> clips = Sounds.getSoundsIgnoringVolume("./sound" + soundName);
         Iterator var3;
         Clip clip;
         if (clips.size() > 0) {
            var3 = clips.iterator();

            while(var3.hasNext()) {
               clip = (Clip)var3.next();
               if (clip != null && clip.isRunning()) {
                  clip.stop();
               }
            }
         } else {
            clips = Sounds.getSoundsIgnoringVolume("./sound/" + this.getMascot().getImageSet() + soundName);
            if (clips.size() > 0) {
               var3 = clips.iterator();

               while(var3.hasNext()) {
                  clip = (Clip)var3.next();
                  if (clip != null && clip.isRunning()) {
                     clip.stop();
                  }
               }
            } else {
               clips = Sounds.getSoundsIgnoringVolume("./img/" + this.getMascot().getImageSet() + "/sound" + soundName);
               var3 = clips.iterator();

               while(var3.hasNext()) {
                  clip = (Clip)var3.next();
                  if (clip != null && clip.isRunning()) {
                     clip.stop();
                  }
               }
            }
         }
      } else if (!Sounds.isMuted()) {
         Sounds.setMuted(true);
         Sounds.setMuted(false);
      }

   }

   private String getSound() throws VariableException {
      return (String)this.eval(this.getSchema().getString("Sound"), String.class, DEFAULT_SOUND);
   }
}
