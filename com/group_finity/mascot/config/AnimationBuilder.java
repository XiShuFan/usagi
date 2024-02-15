package com.group_finity.mascot.config;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.animation.Pose;
import com.group_finity.mascot.exception.AnimationInstantiationException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.image.ImagePairLoader;
import com.group_finity.mascot.script.Variable;
import com.group_finity.mascot.sound.SoundLoader;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimationBuilder {
   private static final Logger log = Logger.getLogger(AnimationBuilder.class.getName());
   private final String condition;
   private String imageSet = "";
   private final List<Pose> poses = new ArrayList();
   private final ResourceBundle schema;

   public AnimationBuilder(ResourceBundle schema, Entry animationNode, String imageSet) throws IOException {
      if (!imageSet.equals("")) {
         this.imageSet = "/" + imageSet;
      }

      this.schema = schema;
      this.condition = animationNode.getAttribute(schema.getString("Condition")) == null ? "true" : animationNode.getAttribute(schema.getString("Condition"));
      log.log(Level.INFO, "Start Reading Animations");
      Iterator var4 = animationNode.getChildren().iterator();

      while(var4.hasNext()) {
         Entry frameNode = (Entry)var4.next();
         this.getPoses().add(this.loadPose(frameNode));
      }

      log.log(Level.INFO, "Animations Finished Loading");
   }

   private Pose loadPose(Entry frameNode) throws IOException {
      // TODO: 路径
      String imageText = frameNode.getAttribute(this.schema.getString("Image")) != null ?  "/img/" +this.imageSet + frameNode.getAttribute(this.schema.getString("Image")) : null;
      String imageRightText = frameNode.getAttribute(this.schema.getString("ImageRight")) != null ?  "/img/" + this.imageSet + frameNode.getAttribute(this.schema.getString("ImageRight")) : null;
      String anchorText = frameNode.getAttribute(this.schema.getString("ImageAnchor")) != null ? frameNode.getAttribute(this.schema.getString("ImageAnchor")) : null;
      String moveText = frameNode.getAttribute(this.schema.getString("Velocity"));
      String durationText = frameNode.getAttribute(this.schema.getString("Duration"));
      String soundText = frameNode.getAttribute(this.schema.getString("Sound")) != null ? frameNode.getAttribute(this.schema.getString("Sound")) : null;
      String volumeText = frameNode.getAttribute(this.schema.getString("Volume")) != null ? frameNode.getAttribute(this.schema.getString("Volume")) : "0";
      int scaling = Integer.parseInt(Main.getInstance().getProperties().getProperty("Scaling", "1"));
      String[] moveCoordinates;
      Point move;
      if (imageText != null) {
         moveCoordinates = anchorText.split(",");
         move = new Point(Integer.parseInt(moveCoordinates[0]), Integer.parseInt(moveCoordinates[1]));

         try {
            ImagePairLoader.load(imageText, imageRightText, move, scaling);
         } catch (Exception var15) {
            String error = imageText;
            if (imageRightText != null) {
               error = imageText + ", " + imageRightText;
            }

            log.log(Level.SEVERE, "Failed to load image: " + error);
            throw new IOException(Main.getInstance().getLanguageBundle().getString("FailedLoadImageErrorMessage") + " " + error);
         }
      }

      moveCoordinates = moveText.split(",");
      move = new Point(Integer.parseInt(moveCoordinates[0]) * scaling, Integer.parseInt(moveCoordinates[1]) * scaling);
      int duration = Integer.parseInt(durationText);
      // TODO: 把音频字符串中的所有音频提取出来
      ArrayList<String> soundList = new ArrayList<>();
      if (soundText != null) {
         try {
            soundList.addAll(Arrays.asList(soundText.split(";")));
            for (int index = 0; index < soundList.size(); index++) {
               String soundItem = soundList.get(index);
               if ((new File("./sound" + soundItem)).exists()) {
                  soundItem = "./sound" + soundItem;
               } else if ((new File("./sound" + this.imageSet + soundItem)).exists()) {
                  soundItem = "./sound" + this.imageSet + soundItem;
               } else {
                  soundItem = "./img" + this.imageSet + "/sound" + soundItem;
               }
               SoundLoader.load(soundItem, Float.parseFloat(volumeText));
               soundItem = soundItem + Float.parseFloat(volumeText);
               soundList.set(index, soundItem);
            }
         } catch (Exception var14) {
            log.log(Level.SEVERE, "Failed to load sound: " + soundText);
            throw new IOException(Main.getInstance().getLanguageBundle().getString("FailedLoadSoundErrorMessage") + soundText);
         }
      }

      Pose pose = new Pose(imageText, imageRightText, move.x, move.y, duration, soundText != null ? soundText : null, soundList);
      log.log(Level.INFO, "ReadPosition({0})", pose);
      return pose;
   }

   public Animation buildAnimation() throws AnimationInstantiationException {
      try {
         return new Animation(Variable.parse(this.getCondition()), (Pose[])this.getPoses().toArray(new Pose[0]));
      } catch (VariableException var2) {
         throw new AnimationInstantiationException(Main.getInstance().getLanguageBundle().getString("FailedConditionEvaluationErrorMessage"), var2);
      }
   }

   private List<Pose> getPoses() {
      return this.poses;
   }

   private String getCondition() {
      return this.condition;
   }
}
