/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LOQ
 */
public class Koneksi {
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        try {
            // URL database xampp kamu (Port 3300 sesuai kodemu sebelumnya)
            String url = "jdbc:mysql://localhost:3306/db_bikantin_java"; 
            String user = "root";
            String pass = ""; // Default XAMPP kosong
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}
