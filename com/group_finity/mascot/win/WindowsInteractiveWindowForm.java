package com.group_finity.mascot.win;

import com.group_finity.mascot.Main;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;

public class WindowsInteractiveWindowForm extends JDialog {
   private final String configFile = "./conf/settings.properties";
   ArrayList<String> listData = new ArrayList();
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JList jList1;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JScrollPane jScrollPane1;

   public WindowsInteractiveWindowForm(Frame parent, boolean modal) {
      super(parent, modal);
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
      this.listData.addAll(Arrays.asList(Main.getInstance().getProperties().getProperty("InteractiveWindows", "").split("/")));
      this.jList1.setListData(this.listData.toArray());
   }

   public boolean display() {
      this.setTitle(Main.getInstance().getLanguageBundle().getString("InteractiveWindows"));
      this.jButton1.setText(Main.getInstance().getLanguageBundle().getString("Add"));
      this.jButton2.setText(Main.getInstance().getLanguageBundle().getString("Done"));
      this.jButton3.setText(Main.getInstance().getLanguageBundle().getString("Remove"));
      this.setVisible(true);
      return true;
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jScrollPane1 = new JScrollPane();
      this.jList1 = new JList();
      this.jPanel2 = new JPanel();
      this.jButton1 = new JButton();
      this.jButton3 = new JButton();
      this.jButton2 = new JButton();
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      this.setDefaultCloseOperation(2);
      this.setTitle("Interactive Windows");
      this.jList1.setModel(new AbstractListModel() {
         String[] strings = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

         public int getSize() {
            return this.strings.length;
         }

         public Object getElementAt(int i) {
            return this.strings[i];
         }
      });
      this.jScrollPane1.setViewportView(this.jList1);
      this.getContentPane().add(this.jScrollPane1, "Center");
      this.jPanel2.setLayout(new GridLayout(1, 0));
      this.jButton1.setLabel("Add");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            WindowsInteractiveWindowForm.this.jButton1ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.jButton1);
      this.jButton3.setLabel("Remove");
      this.jButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            WindowsInteractiveWindowForm.this.jButton3ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.jButton3);
      this.jButton2.setText("Done");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            WindowsInteractiveWindowForm.this.jButton2ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.jButton2);
      this.getContentPane().add(this.jPanel2, "Last");
      this.pack();
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      String inputValue = JOptionPane.showInputDialog(this.rootPane, Main.getInstance().getLanguageBundle().getString("InteractiveWindowHintMessage"), Main.getInstance().getLanguageBundle().getString("AddInteractiveWindow"), 3).trim();
      if (!inputValue.isEmpty() && !inputValue.contains("/")) {
         this.listData.add(inputValue);
         this.jList1.setListData(this.listData.toArray());
      }

   }

   private void jButton3ActionPerformed(ActionEvent evt) {
      if (this.jList1.getSelectedIndex() != -1) {
         this.listData.remove(this.jList1.getSelectedIndex());
         this.jList1.setListData(this.listData.toArray());
      }

   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      try {
         FileOutputStream output = new FileOutputStream("./conf/settings.properties");

         try {
            Main.getInstance().getProperties().setProperty("InteractiveWindows", this.listData.toString().replace("[", "").replace("]", "").replace(", ", "/"));
            Main.getInstance().getProperties().store(output, "Shimeji-ee Configuration Options");
         } finally {
            output.close();
         }
      } catch (Exception var7) {
      }

      this.dispose();
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new WindowsInteractiveWindowForm(new JFrame(), true)).display();
            System.exit(0);
         }
      });
   }
}
