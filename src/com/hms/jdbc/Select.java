/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.jdbc;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Anand
 */
public class Select {
    public static ResultSet executeSelectQuery(String query)
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con=ConnectionProvider.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("Exception occurred in executeSelectQuery :\n"+e);
            return null;
        }
    }
}
