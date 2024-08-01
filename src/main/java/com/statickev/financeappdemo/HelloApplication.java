package com.statickev.financeappdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/statickev/financeappdemo/main-view-trial.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Financial Management App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
