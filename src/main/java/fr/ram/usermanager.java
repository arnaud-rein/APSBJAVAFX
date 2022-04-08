package fr.ram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class usermanager {

    public static void main(String[] args) {
    String dbURL = "jdbc:mysql://localhost:3306/sampledb";
    String username = "root";
    String password = "";
    
    
   
    try {
     
        Connection conn = DriverManager.getConnection(dbURL, username, password);
     
        if (conn != null) {

            
            System.out.println("Connected");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }        
    
}
    
}

