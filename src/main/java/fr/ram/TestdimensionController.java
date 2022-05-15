package fr.ram;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class TestdimensionController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private TextField quantite;

    @FXML
    private TextField montantunitaire;

    @FXML
    private TextField total;

    @FXML
    private TextField keykey;

   

    @FXML
    private TextField testinput;

    @FXML
    private DatePicker mydatepicker;

    @FXML
    private Label myLabel;

    @FXML
    private TextField reponsevalidation;

    @FXML
    private TextField idvalidation;


   

    public void qttunitairetotal(ActionEvent event) {
        String unitaire = montantunitaire.getText();
        String qtt = quantite.getText();
        int totaux = Integer.parseInt(unitaire) * Integer.parseInt(qtt) ;
        
        System.out.println(totaux * 2);
    
        
        String finaltotal = String.valueOf(totaux);
        
            
    
        total.setText(finaltotal);
    
        }

        public void getDate(ActionEvent event){

            LocalDate mydate = mydatepicker.getValue();
            String newdate = mydate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
            myLabel.setText(newdate.toString());
        }        
            
       
            public void bddrecupere2(ActionEvent event) throws IOException {
                String dbURL = "jdbc:mysql://localhost:3306/fiche";
                String username = "root";
                String password = "";

                try (Connection Conn3 = DriverManager.getConnection(dbURL, username, password)) {
            
                    java.sql.Statement statement = Conn3.createStatement();   


                    String selection = idvalidation.getText();

                    String sql = "SELECT validation, date_creation,fk_vi FROM fiche WHERE fk_vi='"+selection+"'";

                    ResultSet rs =  statement.executeQuery(sql);  

                    while (rs.next()){                             
                           
                      reponsevalidation.setText(rs.getString("validation"));
                        
                     }


        
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    
    
            
    
        }
    
}
