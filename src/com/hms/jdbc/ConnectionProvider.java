/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Anand
 */
public class ConnectionProvider {
    public static Connection getConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","root");
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Class Not Found!");
            return null;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
