package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/23832-tp-creez-une-calculatrice

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculatrice");
        primaryStage.setScene(new Scene(root, 320, 450));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }


}
