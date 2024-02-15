package com.group_finity.mascot.sound;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.FloatControl.Type;

public class SoundLoader {
   public static void load(String name, float volume) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
      if (!Sounds.contains(name + volume)) {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(name));
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);
         ((FloatControl)clip.getControl(Type.MASTER_GAIN)).setValue(volume);
         clip.addLineListener(new LineListener() {
            public void update(LineEvent event) {
               if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                  ((Clip)event.getLine()).stop();
               }

            }
         });
         Sounds.load(name + volume, clip);
      }
   }
}
