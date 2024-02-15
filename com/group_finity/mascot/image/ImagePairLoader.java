package com.group_finity.mascot.image;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagePairLoader {
   public static void load(String name, String rightName, Point center, int scaling) throws IOException {
      if (!ImagePairs.contains(name + (rightName == null ? "" : rightName))) {
         BufferedImage leftImage = premultiply(ImageIO.read(ImagePairLoader.class.getResource(name)));
         BufferedImage rightImage;
         if (rightName == null) {
            rightImage = flip(leftImage);
         } else {
            rightImage = premultiply(ImageIO.read(ImagePairLoader.class.getResource(rightName)));
         }

         ImagePair ip = new ImagePair(new MascotImage(leftImage, new Point(center.x * scaling, center.y * scaling)), new MascotImage(rightImage, new Point((rightImage.getWidth() - center.x) * scaling, center.y * scaling)));
         ImagePairs.load(name + (rightName == null ? "" : rightName), ip);
      }
   }

   private static BufferedImage flip(BufferedImage src) {
      BufferedImage copy = new BufferedImage(src.getWidth(), src.getHeight(), src.getType() == 0 ? 2 : src.getType());

      for(int y = 0; y < src.getHeight(); ++y) {
         for(int x = 0; x < src.getWidth(); ++x) {
            copy.setRGB(copy.getWidth() - x - 1, y, src.getRGB(x, y));
         }
      }

      return copy;
   }

   private static BufferedImage premultiply(BufferedImage source) {
      BufferedImage returnImage = new BufferedImage(source.getWidth(), source.getHeight(), source.getType() == 0 ? 3 : source.getType());

      for(int y = 0; y < returnImage.getHeight(); ++y) {
         for(int x = 0; x < returnImage.getWidth(); ++x) {
            Color colour = new Color(source.getRGB(x, y), true);
            float[] components = colour.getComponents((float[])null);
            components[0] = components[3] * components[0];
            components[1] = components[3] * components[1];
            components[2] = components[3] * components[2];
            colour = new Color(components[0], components[1], components[2], components[3]);
            returnImage.setRGB(x, y, colour.getRGB());
         }
      }

      return returnImage;
   }
}
