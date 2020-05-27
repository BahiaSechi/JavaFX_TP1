package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.*;


import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.lang.Float;

public class Controller implements Initializable {

    @FXML
    private TextField valeur;

    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonA, buttonB, buttonC, buttonE, buttonF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void display(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        try{

            float new_val = Float.parseFloat(valeur.getText().concat(btn.getText()));
            valeur.setText(String.valueOf(new_val));
        }
        catch(Exception e){

        }
    }
}
