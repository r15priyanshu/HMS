/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms;

import javax.swing.JOptionPane;

/**
 *
 * @author Anand
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmanageRoom = new javax.swing.JButton();
        jcustomerCheckIn = new javax.swing.JButton();
        jcustomerCheckout = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmanageRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmanageRoom.setForeground(new java.awt.Color(102, 0, 0));
        jmanageRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manageRoom.png"))); // NOI18N
        jmanageRoom.setText("Manage Rooms");
        jmanageRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmanageRoomActionPerformed(evt);
            }
        });
        getContentPane().add(jmanageRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 28, -1, -1));

        jcustomerCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcustomerCheckIn.setForeground(new java.awt.Color(102, 0, 0));
        jcustomerCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerRegistrationAndCheckIN.png"))); // NOI18N
        jcustomerCheckIn.setText("Customer Check In");
        jcustomerCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcustomerCheckInActionPerformed(evt);
            }
        });
        getContentPane().add(jcustomerCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 28, -1, -1));

        jcustomerCheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcustomerCheckout.setForeground(new java.awt.Color(102, 0, 0));
        jcustomerCheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerCheckOut.png"))); // NOI18N
        jcustomerCheckout.setText("Customer Check Out");
        jcustomerCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcustomerCheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(jcustomerCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 28, -1, -1));

        jlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlogout.setForeground(new java.awt.Color(102, 0, 0));
        jlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jlogout.setText("Logout");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 28, -1, -1));

        jexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jexit.setForeground(new java.awt.Color(102, 0, 0));
        jexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        getContentPane().add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 28, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // TODO add your handling code here:
        int option=JOptionPane.showConfirmDialog(null,"Do you want to logout ?","Select proper option",JOptionPane.YES_NO_OPTION);
        if(option==0)
        {
          setVisible(false);
          new Login().setVisible(true);
        }
            
    }//GEN-LAST:event_jlogoutActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
        int option=JOptionPane.showConfirmDialog(null,"Do you want to close the Application ?","Select proper option",JOptionPane.YES_NO_OPTION);
        if(option==0)
            System.exit(0);
    }//GEN-LAST:event_jexitActionPerformed

    private void jmanageRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmanageRoomActionPerformed
        // TODO add your handling code here:
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_jmanageRoomActionPerformed

    private void jcustomerCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcustomerCheckInActionPerformed
        // TODO add your handling code here:
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_jcustomerCheckInActionPerformed

    private void jcustomerCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcustomerCheckoutActionPerformed
        // TODO add your handling code here:
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jcustomerCheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jcustomerCheckIn;
    private javax.swing.JButton jcustomerCheckout;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jlogout;
    private javax.swing.JButton jmanageRoom;
    // End of variables declaration//GEN-END:variables
}
