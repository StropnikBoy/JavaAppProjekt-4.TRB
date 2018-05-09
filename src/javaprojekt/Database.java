/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojekt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static String url = "jdbc:postgresql://horton.elephantsql.com:5432/gtqozqor";    
    private static String driverName = "org.postgresql.Driver";   
    private static String username = "gtqozqor";   
    private static String password = "dsB-EHsYK-Kv13r33nXKjX3eVR6XcJpg";
    private static Connection conn;
    
    
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return conn;
    }
}
