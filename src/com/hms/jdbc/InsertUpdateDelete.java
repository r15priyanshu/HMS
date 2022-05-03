/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.jdbc;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Anand
 */
public class InsertUpdateDelete {
    public static void executeCustomQuery(String query,String msg)
    {
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getConnection();
            st=con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("Exception occurred in executeCustomQuery :\n"+e);
        }finally{
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
