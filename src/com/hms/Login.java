/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms;

import com.hms.jdbc.Select;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Anand
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jlogin = new javax.swing.JButton();
        jsignup = new javax.swing.JButton();
        jforgot = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 70, -1));

        jemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 310, -1));

        jpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 310, -1));

        jlogin.setBackground(new java.awt.Color(102, 0, 0));
        jlogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        getContentPane().add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 70, -1));

        jsignup.setBackground(new java.awt.Color(102, 0, 0));
        jsignup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jsignup.setForeground(new java.awt.Color(255, 255, 255));
        jsignup.setText("SignUp");
        jsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 70, -1));

        jforgot.setBackground(new java.awt.Color(102, 0, 0));
        jforgot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jforgot.setForeground(new java.awt.Color(255, 255, 255));
        jforgot.setText("Forgot Password ?");
        jforgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jforgotActionPerformed(evt);
            }
        });
        getContentPane().add(jforgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 150, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsignupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jsignupActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
            int option=JOptionPane.showConfirmDialog(null,"Do you want to close the Application ?","Select proper option",JOptionPane.YES_NO_OPTION);
            if(option==0)
                System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        // TODO add your handling code here:
        String email=jemail.getText();
        String password=jpassword.getText();
        boolean flag=false;
        if(email.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter all details !!");
        }else{
            System.out.println("Login Request for :"+email);
            String query=String.format("select * from hmsadmin where email='%s'",email);
            ResultSet rs=Select.executeSelectQuery(query);
            try
            {
                if(rs.next())
                {
                   if(rs.getString("password").equals(password) && rs.getString("accstatus").equals("true"))
                   {
                       System.out.println("Login Successful for :"+email);
                       setVisible(false);
                       new AdminHome().setVisible(true);
                   }else if(rs.getString("password").equals(password) && rs.getString("accstatus").equals("false"))
                   {
                       JOptionPane.showMessageDialog(null,"Your Account is still not activated. Kindly wait for the admin to approve !!");
                   }else
                   {
                       JOptionPane.showMessageDialog(null,"Incorrect password !!");
                   }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No account found for "+email+" , Please enter correct details !!");
                }
            }catch(Exception e)
            {
                System.out.println("Exception occurred for Login Attempt:");
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jloginActionPerformed

    private void jforgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jforgotActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_jforgotActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jemail;
    private javax.swing.JButton jforgot;
    private javax.swing.JButton jlogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton jsignup;
    // End of variables declaration//GEN-END:variables
}