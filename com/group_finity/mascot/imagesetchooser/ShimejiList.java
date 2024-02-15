package com.group_finity.mascot.imagesetchooser;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ShimejiList extends JList {
   public ShimejiList() {
      this.setCellRenderer(new ShimejiList.CustomCellRenderer());
   }

   class CustomCellRenderer implements ListCellRenderer {
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         if (value instanceof ImageSetChooserPanel) {
            ImageSetChooserPanel component = (ImageSetChooserPanel)value;
            component.setForeground(Color.white);
            component.setBackground((Color)(isSelected ? SystemColor.controlHighlight : Color.white));
            component.setCheckbox(isSelected);
            return component;
         } else {
            return new JLabel("???");
         }
      }
   }
}
