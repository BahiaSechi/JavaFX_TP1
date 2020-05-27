package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.*;


import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.lang.Float;

/**
 * Address :
 * ENSICAEN
 * 6 Boulevard Maréchal Juin
 * F-14050 Caen Cedex
 *
 * Note :
 * This file is owned by an ENSICAEN student.  No portion of this
 * document may be reproduced, copied  or revised without written
 * permission of the authors.
 *
 * @author BURON Manfred <manfred.buron@ecole.ensicaen.fr>
 * @author Bahia SECHI <bahia.sechi@ecole.ensicaen.fr>
 * @version 1.0
 */

public class Controller implements Initializable {

    @FXML
    private TextField valeur;

    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonA, buttonB, buttonC, buttonE, buttonF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    /**
     * Displays the number clicked on the textfield
     * @param actionEvent
     */
    public void display(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();

        if(btn.getText().equals(".")){
            if(valeur.getText().equals("")){
                //NO . at the beginning
            }else{
                int is_there_dot = 0;

                for(int i = 0; i<valeur.getText().length(); i++)
                    if(valeur.getText().charAt(i) == '.')
                        is_there_dot = 1;

                if(is_there_dot == 0)
                    valeur.setText(valeur.getText().concat(btn.getText()));
            }
        }else if(btn.getText().equals("0")){
            if(valeur.getText().equals("")){
                //NO 0 at the beginning
            }else{
                valeur.setText(valeur.getText().concat(btn.getText()));
            }
        }else if(btn.getText().equals("C")){
            valeur.setText("");
        }else{
            valeur.setText(valeur.getText().concat(btn.getText()));
        }

    }

    public void quit(ActionEvent actionEvent) {
        ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
    }


}
