/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms;

import com.hms.jdbc.InsertUpdateDelete;
import com.hms.jdbc.Select;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Anand
 */
public class CustomerCheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckIn
     */
    String bed,roomType,roomNumber;
    int price;
    public CustomerCheckIn() {
        initComponents();
        jdateText.setEditable(false);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        jdateText.setText(sdf.format(Calendar.getInstance().getTime()));
        jpriceText.setEditable(false);
        roomDetails();
    }
    
    public void roomDetails()
    {
        jroomCombo.removeAllItems();
        jpriceText.setText("");
        bed=(String)jbedCombo.getSelectedItem();
        roomType=(String)jroomTypeCombo.getSelectedItem();
        try
        {
            System.out.println(String.format("Select * from rooms where bed='%s' and roomtype='%s' and status='Not Booked'",bed,roomType));
            ResultSet rs=Select.executeSelectQuery(String.format("Select * from rooms where bed='%s' and roomtype='%s' and status='Not Booked'",bed,roomType));
            while(rs.next())
            {
                jroomCombo.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jnameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jmobileText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jnationalityText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jgenderCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jemailText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jidproofText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jaddressText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jdateText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbedCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jroomTypeCombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jroomCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jpriceText = new javax.swing.JTextField();
        jbookRoomButton = new javax.swing.JButton();
        jclearButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerRegistrationAndCheckIN.png"))); // NOI18N
        jLabel1.setText("Customer Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 34, 220, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 36, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 350, -1));

        jnameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 188, 350, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 232, 350, -1));

        jmobileText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jmobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 350, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nationality");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 314, 350, -1));

        jnationalityText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jnationalityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 352, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 396, 350, -1));

        jgenderCombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jgenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jgenderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 434, 350, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 478, 350, -1));

        jemailText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jemailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 516, 350, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID Proof");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 150, 350, -1));

        jidproofText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jidproofText, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 188, 350, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 232, 350, -1));

        jaddressText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jaddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 270, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Check-In Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 314, 350, -1));

        jdateText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jdateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 352, 350, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Bed");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 150, 350, -1));

        jbedCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbedCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        jbedCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbedComboActionPerformed(evt);
            }
        });
        getContentPane().add(jbedCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 188, 350, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 232, 350, -1));

        jroomTypeCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jroomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC" }));
        jroomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroomTypeComboActionPerformed(evt);
            }
        });
        getContentPane().add(jroomTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 270, 350, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Room No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 314, 350, -1));

        jroomCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jroomCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroomComboActionPerformed(evt);
            }
        });
        getContentPane().add(jroomCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 352, 350, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 393, 350, -1));

        jpriceText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jpriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpriceTextActionPerformed(evt);
            }
        });
        getContentPane().add(jpriceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 428, 350, -1));

        jbookRoomButton.setBackground(new java.awt.Color(102, 0, 0));
        jbookRoomButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbookRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        jbookRoomButton.setText("Book Room");
        jbookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbookRoomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jbookRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 478, -1, -1));

        jclearButton.setBackground(new java.awt.Color(102, 0, 0));
        jclearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jclearButton.setForeground(new java.awt.Color(255, 255, 255));
        jclearButton.setText("Clear");
        jclearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jclearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 520, 109, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allPagesBackground.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int option=JOptionPane.showConfirmDialog(null,"Do you want to close the Customer Check-In Section?","Select proper option",JOptionPane.YES_NO_OPTION);
        if(option==0)
            setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jclearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearButtonActionPerformed
        // TODO add your handling code here:
        int option=JOptionPane.showConfirmDialog(null,"Do you want to clear all the fields ?","Select proper option",JOptionPane.YES_NO_OPTION);
        if(option==0)
        {
            setVisible(false);
            new CustomerCheckIn().setVisible(true);
        }
        
    }//GEN-LAST:event_jclearButtonActionPerformed

    private void jbedComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbedComboActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jbedComboActionPerformed

    private void jroomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroomTypeComboActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jroomTypeComboActionPerformed

    private void jpriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpriceTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jpriceTextActionPerformed

    private void jroomComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroomComboActionPerformed
        // TODO add your handling code here:
        try
        {
            roomNumber=(String)jroomCombo.getSelectedItem();
            ResultSet rs=Select.executeSelectQuery(String.format("Select price from rooms where roomnumber='%s'",roomNumber));
            if(rs.next())
                jpriceText.setText(String.valueOf(rs.getInt("price")));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jroomComboActionPerformed

    private void jbookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbookRoomButtonActionPerformed
        // TODO add your handling code here:
        String name=jnameText.getText();
        String mobile=jmobileText.getText();
        String nationality=jnationalityText.getText();
        String gender=(String)jgenderCombo.getSelectedItem();
        String email=jemailText.getText();
        String idproof=jidproofText.getText();
        String address=jaddressText.getText();
        String checkindate=jdateText.getText();
        String room=(String)jroomCombo.getSelectedItem();
        try
        {
            System.out.println("Request received for booking room "+email);
            String query=String.format("insert into customers(name,mobilenumber,nationality,gender,email,idproof,address,checkindate,room) values('%s',%d,'%s','%s','%s','%s','%s','%s','%s')",name,Integer.parseInt(mobile),nationality,gender,email,idproof,address,checkindate,room);
            InsertUpdateDelete.executeCustomQuery(query,"Room Successfully Booked !!");
            query=String.format("update rooms set status='Booked' where roomnumber='%s'",room);
            InsertUpdateDelete.executeCustomQuery(query,"");
            System.out.println("New Customer successfully added "+email);
            setVisible(false);
            new CustomerCheckIn().setVisible(true);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jbookRoomButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jaddressText;
    private javax.swing.JComboBox<String> jbedCombo;
    private javax.swing.JButton jbookRoomButton;
    private javax.swing.JButton jclearButton;
    private javax.swing.JTextField jdateText;
    private javax.swing.JTextField jemailText;
    private javax.swing.JComboBox<String> jgenderCombo;
    private javax.swing.JTextField jidproofText;
    private javax.swing.JTextField jmobileText;
    private javax.swing.JTextField jnameText;
    private javax.swing.JTextField jnationalityText;
    private javax.swing.JTextField jpriceText;
    private javax.swing.JComboBox<String> jroomCombo;
    private javax.swing.JComboBox<String> jroomTypeCombo;
    // End of variables declaration//GEN-END:variables
}
