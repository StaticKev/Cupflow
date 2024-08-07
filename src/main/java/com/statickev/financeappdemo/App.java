package com.statickev.financeappdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/statickev/financeappdemo/dashboard-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/statickev/financeappdemo/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);

        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("CupFlow");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
