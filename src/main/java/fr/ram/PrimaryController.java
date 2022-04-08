package fr.ram;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*import com.mysql.cj.xdevapi.Statement;*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    /**
     * Méthode servant de switch de primary vers la page secondary.
     * 
     * @throws IOException
     */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    /**
     * méthode servant de swtitch de primary vers la page connexion.
     */
    @FXML
    private void switchToConnexion() throws IOException {
        App.setRoot("Connexion");
    }

    @FXML
    private void switchToTestdimension() throws IOException {
        App.setRoot("testdimension");
    }



    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private TextField validerbdd;

    @FXML
    private TextField passwordnew;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button validation;

    @FXML
    private Label lab;

    @FXML
    private Label badlab;

    @FXML
    private Label erreur;

    @FXML
    private Label voirmdp;

    /**
     * Méthode renvoyant du texte dans une alert().
     * elle sert d'exemple pour nos futures lignes codes.
     * 
     * @param event
     */
    public void demon(ActionEvent event) {

        String username1 = username.getText();
        String password1 = password.getText();
        String params = username1 + " " + password1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(params);

        alert.showAndWait();

    }

    public void voirmotdepasse(ActionEvent event){
        /*String password = passwordnew.getText();*/
        voirmdp.setText(passwordfield.getText());
    }

    public void valid(ActionEvent event) {
        if (username.getText().equals("arnaud")) {
            lab.setText("ok git c'est la même chose");
        } else {
            lab.setText("ah ah ah, bien essayer mais tu t'es tromper, retente une fois");
        }
    }

    public void ok(ActionEvent event) {

        if (username.getText().isBlank() != false && password.getText().isBlank() != false) {
            lab.setText("va marcher ?");
        } else {
            lab.setText("ok ok");
        }
    }

    /**
     * méthode permetant de se connecter à la bdd et y mettre des requêtes
     * @throws IOException
     * 
     * @throws SQLException
     */

    public void bdd(ActionEvent event) throws IOException {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "";

        String req = "SELECT username, user_id, email, password FROM users  ";
        

        try (Connection Conn = DriverManager.getConnection(dbURL, username, password)) {

            /*
             * java.sql.Statement st = Conn.createStatement();
             * st.execute(req);
             * st.close();
             */
            java.sql.Statement statement = Conn.createStatement();

            ResultSet rs = statement.executeQuery(req);

            
            while (rs.next()){
                String name = rs.getString("username");
                String mail = rs.getString("email"); 
                String passwordbdd = rs.getString("password");
                 
                
               
                
                if(validerbdd.getText().equals(name) && mail.equals("arnaud")&& passwordfield.getText().equals(passwordbdd)){
                    switchToSecondary();
                
                /*System.out.println(String.format(name));
                badlab.setText(name);*/}
                if(validerbdd.getText().equals(name) && mail.equals("rein") && passwordfield.getText().equals(passwordbdd)){
                    switchToConnexion();
                }else{
                    erreur.setText("erreur dans l'username ou le password");
                }
            }

            

          /*  if (validerbdd.getText().equals(test)) {
                badlab.setText("okok on est connecté");
            } else {
                badlab.setText("et non ca ne fonctionne pas");
            }

            /* badlab.setText(test); */

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /*
     * 
     * public void prouver(ActionEvent event){
     * String username1 = username.getText();
     * String password1 = password.getText();
     * 
     * 
     * }
     * String name = arnaud;
     * String passwd = rein;
     * String mess = "fonctionne pas";
     * if (username1 == arnaud && password1==rein ){
     * switchToConnexion();
     * 
     * }else{
     * Alert alert = new Alert(Alert.AlertType.INFORMATION);
     * alert.setTitle("Message");
     * alert.setContentText(mess);
     * 
     * alert.showAndWait();
     * }
     */

}
