package fr.ram;

import java.io.IOException;
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
    private TextField resultkey;

    @FXML
    private TextField testinput;

    @FXML
    private DatePicker mydatepicker;

    @FXML
    private Label myLabel;
   

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




        
            
        /*
            @FXML  // <== perhaps you had this missing??
           public void keyPressed(KeyEvent event) {
                switch (event.getCode()) {
                case LEFT:
                case KP_LEFT:
                    System.out.println("to the left");
                    break;
                case RIGHT:
                case KP_RIGHT:
                    System.out.println("to the right");
                    break;
                default:
                    break;
                }
            }*/

            
            /* un essai de saisi en direct 
            public void touche(TouchEvent event){
                TouchPoint recuperetest = event.getTouchPoint();

                resultkey.setText(recuperetest);
            }


            */
        


        

    
}
