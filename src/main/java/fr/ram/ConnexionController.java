package fr.ram;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class ConnexionController {
    
  
    @FXML
    private Button btnValider;

    @FXML
    private TextField resultatid;

    @FXML
    private TextField recupereid;

    @FXML
    private DatePicker date;

    @FXML
    private TextField testdate;


    


    /**
     * Méthode qui servira à faire une multiplication.
     * détail calcul : total = quantité * montant unitaire.
     *
     */
    
    /*
    
    @FXML
    void btnmultiplication(ActionEvent event){
        String num1 = txt1.getText();
        String num2 = txt2.getText();
        Double numfin = num1 * num2;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(numfin);

        alert.showAndWait();


    }*/
  

    /* méthode de test**//*
    @FXML
    void btnValiderClic(ActionEvent event) {

        String lePrenom = txtPrenom.getText();
  // Affichage sur la console pour vérification
        System.out.println("Prénom récupéré :" + lePrenom);
    }

*/
    /**
     * classe servant à switch de view.
     */

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }


    /*private void recuperedate(ActionEvent event)throws IOException{
        date2 = date.getValue();
        testdate.setText(date2);


    }*/


    /* bddrecupere : cette méthode sert à afficher les données d'un client en tapant son ID */ 

    public void bddrecupere(ActionEvent event) throws IOException {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "";

       

        try (Connection Conn2 = DriverManager.getConnection(dbURL, username, password)) {
            
            java.sql.Statement statement = Conn2.createStatement();        

            
            
            
            
            String nombreinit = recupereid.getText();
            int idnombre = Integer.parseInt(nombreinit);
            

            String sql = "SELECT user_id, username FROM users WHERE user_id = '"+idnombre+"' ";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                String name = rs.getString("username");  
                /*String    */
                
               resultatid.setText(name);
            }

            
            /*if (rows > 0) {
                System.out.println("A new user was inserted successfully!");
            }*/
            
           /* connection.close();    */
                  

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
}
