package com.example.balatro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX + Maven + JUnit is ready");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 640, 360);

        stage.setTitle("balatro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}