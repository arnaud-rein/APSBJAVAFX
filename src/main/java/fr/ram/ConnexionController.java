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
/*import javafx.scene.control.Button;*/
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ConnexionController {
    
  
    

   

    @FXML
    private TextField recupereid;

    

    
    @FXML
    private Label affichedate;
    
   

    
    @FXML
    private TextField recuperematricule;

    @FXML
    private TextField recuperenom;
   

    @FXML
    private TextField matriculeShow;

    @FXML
    private TextField nomShow;

    @FXML
    private TextField montant;

    @FXML
    private TextField datecreation;

    @FXML
    private TextField montanthf;

    @FXML
    private TextField dateFraisHf;

    @FXML
    private TextField libelFraisHf;

    @FXML
    private TextField voiture;

    @FXML
    private TextField prenom;

    @FXML
     private TextField lieuvalidation;

     @FXML
     private DatePicker datepique;

     @FXML
     private Label labdatepique;

     @FXML
     private TextField idcool;

     @FXML
     private TextField lieuvalider;

     @FXML
     private TextField validation;

     

     

    


    


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


    public void getDate2(ActionEvent event){

        LocalDate mydate = datepique.getValue();
        String newdate = mydate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        labdatepique.setText(newdate.toString());
        
    }
    


    

    /*private void recuperedate(ActionEvent event)throws IOException{
        date2 = date.getValue();
        testdate.setText(date2);


    }*/


    /* bddrecupere : cette méthode sert à afficher les données d'un client en tapant son ID */ 

    public void bddrecupere(ActionEvent event) throws IOException {
        String dbURL = "jdbc:mysql://localhost:3306/fiche";
        String username = "root";
        String password = "";

       

        try (Connection Conn2 = DriverManager.getConnection(dbURL, username, password)) {
            
            java.sql.Statement statement = Conn2.createStatement();        

            
            
            
            
            /*String nombreinit = recupereid.getText();
            int idnombre = Integer.parseInt(nombreinit);*/

            String nomrecup = recuperenom.getText();
            String matriculerecup = recuperematricule.getText();

            /*String idd = idcool.getText();*/

            /*String daterecuppique = labdatepique.getText();*/
            

          /*le code avec la bdd sampleDB fonctionne String sql = "SELECT user_id, username, matricule, quantite, montantunitaire FROM users WHERE user_id = '"+idnombre+"' ";*/
            /*String sql = "SELECT id_vi, matricule, nom, prenom, fk_ve, id_ve, vehicule FROM visiteur  INNER JOIN typevehicule ON visiteur.fk_ve = typevehicule.id_ve WHERE id_vi='"+idnombre+"' "; */
           /* String sql = "SELECT id_vi, matricule, nom, prenom, fk_ve, id_ve, vehicule FROM visiteur WHERE nom = '"+nomrecup+"' INNER JOIN typevehicule ON visiteur.fk_ve = typevehicule.id_ve";*/

            /*String sql = "SELECT id_vi, matricule, nom, prenom, fk_ve FROM visiteur WHERE nom = '"+nomrecup+"'";*/

            String sql = "SELECT id_vi, matricule, nom, prenom, fk_ve, id_ve, vehicule, cout, date_creation, date, libel, montant FROM visiteur INNER JOIN typevehicule ON visiteur.fk_ve = typevehicule.id_ve INNER JOIN fiche ON visiteur.id_vi = fiche.fk_vi INNER JOIN frais_hf ON fiche.id_fi = frais_hf.fk_fi2 WHERE nom = '"+nomrecup+"' AND '"+matriculerecup+"'   ";
            /*String lqs = "INSERT INTO fiche(date_validation) VALUES('2222-06-06')";*/
            
            
            ResultSet rs = statement.executeQuery(sql); 
            /*statement.executeQuery(lqs);  */          
            
           
            
            /*statement.executeQuery(lqs);*/
            
            
                             

            while (rs.next()){       
                              
               
               
                           
               


              
               nomShow.setText(rs.getString("nom"));
               matriculeShow.setText(rs.getString("matricule"));
               montant.setText(rs.getString("cout"));


               datecreation.setText(rs.getString("date_creation"));
               montanthf.setText(rs.getString("montant"));
               libelFraisHf.setText(rs.getString("libel"));


               dateFraisHf.setText(rs.getString("date"));
               prenom.setText(rs.getString("prenom"));
               voiture.setText(rs.getString("vehicule"));

               idcool.setText(rs.getString("id_vi"));
               
            }
            
           
            
                  

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        

    }


    public void bddrecupere2(ActionEvent event) throws IOException {
        String dbURL = "jdbc:mysql://localhost:3306/fiche";
        String username = "root";
        String password = "";

       

        try (Connection Conn3 = DriverManager.getConnection(dbURL, username, password)) {
            
            java.sql.Statement statement = Conn3.createStatement();     


            /*String daterecuppique = labdatepique.getText();*/
            String nomnom = idcool.getText();

            String dateasus= labdatepique.getText();

            String lieulieu = lieuvalider.getText();

            String valideca = validation.getText();
            

            String lqs = "UPDATE fiche SET date_validation = '"+dateasus+"', lieu_validation='"+lieulieu+"', validation='"+valideca+"' WHERE fk_vi ='"+nomnom+"' ";

            statement.executeUpdate(lqs);  

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        

    }
    
    
    
}
