package com.statickev.financeappdemo.View;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;

import java.util.Objects;

public class DashboardController {
    @FXML
    public AnchorPane dashboardPane;
    @FXML
    public Pane topPane;
//    @FXML
//    public Pane progressBar;
//    @FXML
//    public ImageView progressBarFill;

    public void initialize() {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Pane_bgImage_DashboardTop.png")));
        BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false)
        );
        topPane.setBackground(new Background(backgroundImage));

//        progressBar.setClip(new Rectangle(130, 18));
//        progressBarFill.setVisible(true);
//        progressBarFill.setLayoutX(-140);

    }
}
