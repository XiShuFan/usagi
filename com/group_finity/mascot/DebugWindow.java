package com.group_finity.mascot;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DebugWindow extends JFrame {
   private JLabel lblActiveIE;
   private JLabel lblActiveIEValue;
   private JLabel lblBehaviour;
   private JLabel lblBehaviourValue;
   private JLabel lblEnvironmentHeight;
   private JLabel lblEnvironmentHeightValue;
   private JLabel lblEnvironmentWidth;
   private JLabel lblEnvironmentWidthValue;
   private JLabel lblEnvironmentX;
   private JLabel lblEnvironmentXValue;
   private JLabel lblEnvironmentY;
   private JLabel lblEnvironmentYValue;
   private JLabel lblShimejiX;
   private JLabel lblShimejiXValue;
   private JLabel lblShimejiY;
   private JLabel lblShimejiYValue;
   private JLabel lblWindowHeight;
   private JLabel lblWindowHeightValue;
   private JLabel lblWindowWidth;
   private JLabel lblWindowWidthValue;
   private JLabel lblWindowX;
   private JLabel lblWindowXValue;
   private JLabel lblWindowY;
   private JLabel lblWindowYValue;

   public DebugWindow() {
      this.initComponents();
   }

   private void initComponents() {
      this.lblShimejiX = new JLabel();
      this.lblShimejiXValue = new JLabel();
      this.lblShimejiYValue = new JLabel();
      this.lblShimejiY = new JLabel();
      this.lblWindowX = new JLabel();
      this.lblWindowY = new JLabel();
      this.lblWindowWidth = new JLabel();
      this.lblWindowHeight = new JLabel();
      this.lblWindowXValue = new JLabel();
      this.lblWindowYValue = new JLabel();
      this.lblWindowWidthValue = new JLabel();
      this.lblWindowHeightValue = new JLabel();
      this.lblBehaviour = new JLabel();
      this.lblBehaviourValue = new JLabel();
      this.lblEnvironmentY = new JLabel();
      this.lblEnvironmentX = new JLabel();
      this.lblEnvironmentXValue = new JLabel();
      this.lblEnvironmentYValue = new JLabel();
      this.lblEnvironmentWidth = new JLabel();
      this.lblEnvironmentHeight = new JLabel();
      this.lblEnvironmentHeightValue = new JLabel();
      this.lblEnvironmentWidthValue = new JLabel();
      this.lblActiveIE = new JLabel();
      this.lblActiveIEValue = new JLabel();
      this.setDefaultCloseOperation(2);
      this.lblShimejiX.setText("Shimeji X");
      this.lblShimejiXValue.setHorizontalAlignment(2);
      this.lblShimejiXValue.setText("N/A");
      this.lblShimejiYValue.setHorizontalAlignment(2);
      this.lblShimejiYValue.setText("N/A");
      this.lblShimejiY.setText("Shimeji Y");
      this.lblWindowX.setText("Window X");
      this.lblWindowY.setText("Window Y");
      this.lblWindowWidth.setText("Window W");
      this.lblWindowHeight.setText("Window H");
      this.lblWindowXValue.setHorizontalAlignment(2);
      this.lblWindowXValue.setText("N/A");
      this.lblWindowYValue.setHorizontalAlignment(2);
      this.lblWindowYValue.setText("N/A");
      this.lblWindowWidthValue.setHorizontalAlignment(2);
      this.lblWindowWidthValue.setText("N/A");
      this.lblWindowHeightValue.setHorizontalAlignment(2);
      this.lblWindowHeightValue.setText("N/A");
      this.lblBehaviour.setText("Behaviour");
      this.lblBehaviourValue.setHorizontalAlignment(2);
      this.lblBehaviourValue.setText("N/A");
      this.lblEnvironmentY.setText("Environment Y");
      this.lblEnvironmentX.setText("Environment X");
      this.lblEnvironmentXValue.setHorizontalAlignment(2);
      this.lblEnvironmentXValue.setText("N/A");
      this.lblEnvironmentYValue.setHorizontalAlignment(2);
      this.lblEnvironmentYValue.setText("N/A");
      this.lblEnvironmentWidth.setText("Environment W");
      this.lblEnvironmentHeight.setText("Environment H");
      this.lblEnvironmentHeightValue.setHorizontalAlignment(2);
      this.lblEnvironmentHeightValue.setText("N/A");
      this.lblEnvironmentWidthValue.setHorizontalAlignment(2);
      this.lblEnvironmentWidthValue.setText("N/A");
      this.lblActiveIE.setText("Active IE");
      this.lblActiveIEValue.setHorizontalAlignment(2);
      this.lblActiveIEValue.setText("N/A");
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblShimejiX).addComponent(this.lblShimejiY).addComponent(this.lblBehaviour).addComponent(this.lblWindowX).addComponent(this.lblWindowY).addComponent(this.lblWindowWidth).addComponent(this.lblWindowHeight).addComponent(this.lblEnvironmentX).addComponent(this.lblEnvironmentY).addComponent(this.lblEnvironmentWidth).addComponent(this.lblEnvironmentHeight).addComponent(this.lblActiveIE)).addGap(42, 42, 42).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblBehaviourValue, -1, 165, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblShimejiYValue).addComponent(this.lblShimejiXValue).addComponent(this.lblWindowXValue).addComponent(this.lblWindowYValue).addComponent(this.lblWindowHeightValue).addComponent(this.lblEnvironmentHeightValue).addComponent(this.lblEnvironmentWidthValue).addComponent(this.lblWindowWidthValue).addComponent(this.lblEnvironmentXValue).addComponent(this.lblEnvironmentYValue).addComponent(this.lblActiveIEValue)).addGap(0, 0, 32767))).addContainerGap()));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblBehaviour).addComponent(this.lblBehaviourValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblShimejiX).addComponent(this.lblShimejiXValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblShimejiYValue).addComponent(this.lblShimejiY)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblActiveIE).addComponent(this.lblActiveIEValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblWindowX).addComponent(this.lblWindowXValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblWindowY).addComponent(this.lblWindowYValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblWindowWidth).addComponent(this.lblWindowWidthValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblWindowHeight).addComponent(this.lblWindowHeightValue, Alignment.TRAILING)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblEnvironmentXValue).addComponent(this.lblEnvironmentX)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblEnvironmentY).addComponent(this.lblEnvironmentYValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblEnvironmentWidth).addComponent(this.lblEnvironmentWidthValue)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lblEnvironmentHeight).addComponent(this.lblEnvironmentHeightValue)).addContainerGap(-1, 32767)));
      this.pack();
   }

   void setBehaviour(String text) {
      this.lblBehaviourValue.setText(text);
   }

   void setShimejiX(int x) {
      this.lblShimejiXValue.setText(String.format("%d", x));
   }

   void setShimejiY(int y) {
      this.lblShimejiYValue.setText(String.format("%d", y));
   }

   void setWindowTitle(String title) {
      this.lblActiveIEValue.setText(title);
   }

   void setWindowX(int x) {
      this.lblWindowXValue.setText(String.format("%d", x));
   }

   void setWindowY(int y) {
      this.lblWindowYValue.setText(String.format("%d", y));
   }

   void setWindowWidth(int width) {
      this.lblWindowWidthValue.setText(String.format("%d", width));
   }

   void setWindowHeight(int height) {
      this.lblWindowHeightValue.setText(String.format("%d", height));
   }

   void setEnvironmentX(int x) {
      this.lblEnvironmentXValue.setText(String.format("%d", x));
   }

   void setEnvironmentY(int y) {
      this.lblEnvironmentYValue.setText(String.format("%d", y));
   }

   void setEnvironmentWidth(int width) {
      this.lblEnvironmentWidthValue.setText(String.format("%d", width));
   }

   void setEnvironmentHeight(int height) {
      this.lblEnvironmentHeightValue.setText(String.format("%d", height));
   }

   public void setVisible(boolean b) {
      if (b) {
         this.lblBehaviour.setText(Main.getInstance().getLanguageBundle().getString("Behaviour"));
         this.lblShimejiX.setText(Main.getInstance().getLanguageBundle().getString("ShimejiX"));
         this.lblShimejiY.setText(Main.getInstance().getLanguageBundle().getString("ShimejiY"));
         this.lblActiveIE.setText(Main.getInstance().getLanguageBundle().getString("ActiveIE"));
         this.lblWindowX.setText(Main.getInstance().getLanguageBundle().getString("WindowX"));
         this.lblWindowY.setText(Main.getInstance().getLanguageBundle().getString("WindowY"));
         this.lblWindowWidth.setText(Main.getInstance().getLanguageBundle().getString("WindowWidth"));
         this.lblWindowHeight.setText(Main.getInstance().getLanguageBundle().getString("WindowHeight"));
         this.lblEnvironmentX.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentX"));
         this.lblEnvironmentY.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentY"));
         this.lblEnvironmentWidth.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentWidth"));
         this.lblEnvironmentHeight.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentHeight"));
      }

      super.setVisible(b);
   }
}
