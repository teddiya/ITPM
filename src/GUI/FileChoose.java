/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class FileChoose extends javax.swing.JFrame {
//    static String data;
    /**
     * Creates new form FileChoose
     */
    public FileChoose() {
        initComponents();

        setResizable(false);

    }
    
    public FileChoose(File para) {
        try {
            initComponents();
            
            Scanner myReader = new Scanner(para);
            String data = "Not Working";
            while (myReader.hasNextLine()) {
                
                data = data+"\n"+myReader.nextLine();//get the code line by line
                
            }
            myReader.close();
//            System.out.println(data);
            jTextArea1.setText(data);//set code to text area
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileChoose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GoHome = new javax.swing.JButton();
        Summery = new javax.swing.JButton();
        Size = new javax.swing.JButton();
        Variables = new javax.swing.JButton();
        Methods = new javax.swing.JButton();
        ControlStructure = new javax.swing.JButton();
        Couppling = new javax.swing.JButton();
        Inheritence = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoHome.setBackground(new java.awt.Color(51, 255, 255));
        GoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/home-run (2).png"))); // NOI18N
        GoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(GoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 70, 70));

        Summery.setBackground(new java.awt.Color(255, 102, 102));
        Summery.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Summery.setText("Complexity due to total summary");
        Summery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummeryActionPerformed(evt);
            }
        });
        getContentPane().add(Summery, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 310, 40));

        Size.setBackground(new java.awt.Color(255, 102, 102));
        Size.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Size.setText("Complexity due to size");
        Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeActionPerformed(evt);
            }
        });
        getContentPane().add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 310, 40));

        Variables.setBackground(new java.awt.Color(255, 102, 102));
        Variables.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Variables.setText("Complexity due to variables");
        Variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesActionPerformed(evt);
            }
        });
        getContentPane().add(Variables, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 310, 40));

        Methods.setBackground(new java.awt.Color(255, 102, 102));
        Methods.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Methods.setText("Complexity due to methods");
        Methods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MethodsActionPerformed(evt);
            }
        });
        getContentPane().add(Methods, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 310, 40));

        ControlStructure.setBackground(new java.awt.Color(255, 102, 102));
        ControlStructure.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ControlStructure.setText("Complexity due to control structure");
        ControlStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlStructureActionPerformed(evt);
            }
        });
        getContentPane().add(ControlStructure, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 310, 40));

        Couppling.setBackground(new java.awt.Color(255, 102, 102));
        Couppling.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Couppling.setText("Complexity due to cuppling");
        Couppling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoupplingActionPerformed(evt);
            }
        });
        getContentPane().add(Couppling, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 310, 40));

        Inheritence.setBackground(new java.awt.Color(255, 102, 102));
        Inheritence.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Inheritence.setText("Complexity due to inheritanse");
        Inheritence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InheritenceActionPerformed(evt);
            }
        });
        getContentPane().add(Inheritence, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 310, 40));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("label1");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 110, 40));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("label1");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 110, 40));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("label1");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 110, 40));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("label1");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, 40));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("label1");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 110, 40));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(255, 255, 255));
        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setText("label1");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, 40));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(255, 255, 255));
        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("label1");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 110, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 540, 560));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fileC.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoHomeActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);//return to home() jframe
    }//GEN-LAST:event_GoHomeActionPerformed

    private void SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SizeActionPerformed

    private void VariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VariablesActionPerformed

    private void MethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MethodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MethodsActionPerformed

    private void ControlStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlStructureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ControlStructureActionPerformed

    private void CoupplingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoupplingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoupplingActionPerformed

    private void InheritenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InheritenceActionPerformed

            new InheritanceTable().setVisible(true);//View table inhritanceTable jframe
            
    }//GEN-LAST:event_InheritenceActionPerformed

    private void SummeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummeryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SummeryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChoose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ControlStructure;
    private javax.swing.JButton Couppling;
    private javax.swing.JButton GoHome;
    private javax.swing.JButton Inheritence;
    private javax.swing.JButton Methods;
    private javax.swing.JButton Size;
    private javax.swing.JButton Summery;
    private javax.swing.JButton Variables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    // End of variables declaration//GEN-END:variables
}
