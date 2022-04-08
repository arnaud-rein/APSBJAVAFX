package fr.ram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class update {

    
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "";
        
        
       
        try {
         
            Connection connection = DriverManager.getConnection(dbURL, username, password);
         
            String sql = "INSERT INTO Users (username, password, fullname, email, type, matricule, nom, quantite, montantunitaire) VALUES ('manu','manu666','manumacron' ,'macron.manu@gouv.Fr', 'compta', '15a', 'macron', '15', '29' )";                
            
            java.sql.Statement statement = connection.createStatement();            
            
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            
            connection.close();
            
    } catch (SQLException ex) {
    ex.printStackTrace();
     }        
                
}
}
