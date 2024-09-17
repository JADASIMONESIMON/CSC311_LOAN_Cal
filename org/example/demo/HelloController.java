package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public static class LoabCalculatorApp extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root= FXMLLoader.load(getClass().getResource("LoanCalculator.fxml"));
            primaryStage.setTitle("Loan Calculator");
            primaryStage.setScene(new Scene(root, 300, 250));
            primaryStage.show();

        }
        public static void main(String[] args){
            launch(args);
        }

    }
}