package com.group_finity.mascot.animation;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.image.ImagePair;
import com.group_finity.mascot.image.ImagePairs;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Pose {
   private final String image;
   private final String rightImage;
   private final int dx;
   private final int dy;
   private final int duration;
   // TODO: 这个sound字符串包含用 ; 分隔的多个音频
   private final String sound;
   // TODO: 解析的所有音频列表
   private ArrayList<String> soundList;
   // 随机数生成
   private final Random random = new Random();

   public Pose(String image) {
      this(image, "", 0, 0, 1);
   }

   public Pose(String image, int duration) {
      this(image, "", 0, 0, duration);
   }

   public Pose(String image, int dx, int dy, int duration) {
      this(image, "", dx, dy, duration);
   }

   public Pose(String image, String rightImage) {
      this(image, rightImage, 0, 0, 1);
   }

   public Pose(String image, String rightImage, int duration) {
      this(image, rightImage, 0, 0, duration);
   }

   public Pose(String image, String rightImage, int dx, int dy, int duration) {
      this(image, rightImage, dx, dy, duration, (String)null, null);
   }

   public Pose(String image, String rightImage, int dx, int dy, int duration, String sound, ArrayList<String> soundList) {
      this.image = image;
      this.rightImage = rightImage;
      this.dx = dx;
      this.dy = dy;
      this.duration = duration;
      this.sound = sound;
      // TODO: 安全列表
      this.soundList = soundList == null ? new ArrayList<>() : soundList;
   }

   public String toString() {
      return "Pose (" + (this.getImage() == null ? "" : this.getImage()) + "," + this.getDx() + "," + this.getDy() + "," + this.getDuration() + ", " + this.sound + ")";
   }

   public void next(Mascot mascot) {
      mascot.setAnchor(new Point(mascot.getAnchor().x + (mascot.isLookRight() ? -this.getDx() : this.getDx()), mascot.getAnchor().y + this.getDy()));
      mascot.setImage(ImagePairs.getImage(this.getImageName(), mascot.isLookRight()));
      mascot.setSound(getSoundName());
   }

   public int getDuration() {
      return this.duration;
   }

   public String getImageName() {
      return (this.image == null ? "" : this.image) + (this.rightImage == null ? "" : this.rightImage);
   }

   public ImagePair getImage() {
      return ImagePairs.getImagePair(this.getImageName());
   }

   public int getDx() {
      return this.dx;
   }

   public int getDy() {
      return this.dy;
   }

   public String getSoundName() {
      // TODO: 大概率不要发出声音
      if (Math.random() < 0.95) {
         return null;
      }
      // TODO: 随机选一个声音，注意如果没有声音设置就返回null
      if (this.soundList.size() == 0) {
         return null;
      }
      int index = random.nextInt(this.soundList.size());
      String selectedSound = this.soundList.get(index);
      return selectedSound;
   }
}
