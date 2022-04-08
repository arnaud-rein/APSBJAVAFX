package fr.ram;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private TextField testnombre;

    @FXML
    private TextField resultatnombre;

    @FXML
    private DatePicker mydatepicker;

    @FXML
    private Label myLabel;

    @FXML
    private TextField quantite;

    @FXML
    private TextField montantunitaire;

    @FXML
    private TextField total;

    @FXML
    private TextField quantite2;

    @FXML
    private TextField montantunitaire2;

    @FXML
    private TextField total2;

    @FXML
    private TextField quantite3;

    @FXML
    private TextField montantunitaire3;

    @FXML
    private TextField total3;

    @FXML
    private TextField usernamefield;

    @FXML
    private TextField matricule;

    @FXML
    private TextField nom;

    @FXML
    private TextField email1;
   
    



    
   /* public void nombrevalider(ActionEvent event) {
    String nombreinit = testnombre.getText();
    int number = Integer.parseInt(nombreinit) * 2;
    System.out.println(number * 2);

    
    String nombredeux = String.valueOf(number);
    
        

    resultatnombre.setText(nombredeux);

    }*/

    public void qttunitairetotal(ActionEvent event) {
        String unitaire = montantunitaire.getText();
        String qtt = quantite.getText();
        int totaux = Integer.parseInt(unitaire) * Integer.parseInt(qtt) ;

        String unitaire2 = montantunitaire2.getText();
        String qtt2 = quantite2.getText();
        int totaux2 = Integer.parseInt(unitaire2) * Integer.parseInt(qtt2) ;

        String unitaire3 = montantunitaire3.getText();
        String qtt3 = quantite3.getText();
        int totaux3 = Integer.parseInt(unitaire3) * Integer.parseInt(qtt3) ;       
           
        
        String finaltotal = String.valueOf(totaux);
        String finaltotal2 = String.valueOf(totaux2);
        String finaltotal3 = String.valueOf(totaux3);       
                

        total.setText(finaltotal);
        total2.setText(finaltotal2);
        total3.setText(finaltotal3);
    
        }


    public void getDate(ActionEvent event){

        LocalDate mydate = mydatepicker.getValue();
        String newdate = mydate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        myLabel.setText(newdate.toString());
    }


    public void bdd2(ActionEvent event) throws IOException {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "";

       

        try (Connection Conn2 = DriverManager.getConnection(dbURL, username, password)) {
            
            java.sql.Statement statement = Conn2.createStatement();            

            
            
            
            
           /*String nombreinit = testnombre.getText();
            int number = Integer.parseInt(nombreinit);*/

            String usernamebdd = usernamefield.getText();

            String matriculebdd = matricule.getText();

            /*String nombdd = nom.getText();*/

            String emailbdd = email1.getText();


           /* String unitaire = montantunitaire.getText();
            String qtt = quantite.getText();
        int totaux = Integer.parseInt(unitaire) * Integer.parseInt(qtt) ;


        String unitaire2 = montantunitaire2.getText();
        String qtt2 = quantite2.getText();
        int totaux2 = Integer.parseInt(unitaire2) * Integer.parseInt(qtt2) ;

        String unitaire3 = montantunitaire3.getText();
        String qtt3 = quantite3.getText();
        int totaux3 = Integer.parseInt(unitaire3) * Integer.parseInt(qtt3) ;*/

            /*créer un bouton / méthode pour valider ce qui suit*/

            /* pour mettre une variable java dans un requête sql, on doit mettre "+mavariable+"    lien de l'endroit où j'ai trouvé la solution
            :  https://www.developpez.net/forums/d937990/java/developpement-mobile-java/java-me/mettre-variable-requete-sql/  */

            /* cette requête sql va permettre de mettre les données (frais) de la fiche de remboursement dans workbench, 
            ensuite, ces données seront rrécupérer pour dans la fiche de validation du comptable qui sera chargé de valider ou non 
            le remboursement */

            /*String sql = "INSERT INTO Users (username, password, fullname, email, type, matricule, nom, totaux, totaux2, totaux3, montantunitaire, montantunitaire2, montantunitaire3, quantite, quantite2, quantite3) VALUES ('"+usernamebdd+"','007','jamesbond', '"+emailbdd+"', 'client', '"+matriculebdd+"', '"+nombdd+"', '"+totaux+"', '"+totaux2+"', '"+totaux3+"', '"+montantunitaire+"', '"+montantunitaire2+"', '"+montantunitaire3+"', '"+quantite+"', '"+quantite2+"', '"+quantite3+"' )";*/
            
            String sql = "INSERT INTO Users (username, password, fullname, email, type, matricule) VALUES ('"+usernamebdd+"','007','jamesbond', '"+emailbdd+"', 'client', '"+matriculebdd+"')";

            

            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("A new user was inserted successfully!!!!");
            }
            
           /* connection.close();    */
                  

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    
    }
}


