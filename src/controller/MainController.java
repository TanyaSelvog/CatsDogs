package controller;

import javafx.collections.FXCollections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {
    public RadioButton dogRadioBtn;
    public RadioButton catRadioBtn;
    public RadioButton fishRadioBtn;
    public ToggleGroup tgroup;
    public Label changeMe;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onDogs(ActionEvent actionEvent) {
        changeMe.setText("You picked dogs!");

    }

    public void onCats(ActionEvent actionEvent) {
        changeMe.setText("You picked cats!");
    }

    public void onFish(ActionEvent actionEvent) {
        changeMe.setText("You picked fish!");
    }
}







