package com.statickev.financeappdemo;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Objects;

public class MainController {

    @FXML
    public AnchorPane mainPane;
    @FXML
    public Pane navigationDrawer;
    @FXML
    private ImageView dashboardButtonIcon;
    @FXML
    private Label dashboardButton;
    @FXML
    private ImageView profileButtonIcon;
    @FXML
    private Label profileButton;
    @FXML
    private ImageView incomeButtonIcon;
    @FXML
    private Label incomeButton;
    @FXML
    private ImageView expenseButtonIcon;
    @FXML
    private Label expenseButton;
    @FXML
    private ImageView analyticsButtonIcon;
    @FXML
    private Label analyticsButton;

    boolean navigationDrawerOpen = false;
    boolean transitionRunning = false;

    @FXML
    public void initialize() {
        dashboardButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_dashboard.png"))));
        profileButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_profile.png"))));
        incomeButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_income.png"))));
        expenseButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_expense.png"))));
        analyticsButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_analytics.png"))));

//        navigationDrawer.setTranslateX(-192);
    }

    @FXML
    public void hideNavigationDrawer() {
        if (transitionRunning) return;
        else transitionRunning = true;

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(navigationDrawer);
        translateTransition.setDuration(Duration.seconds(0.2));
        translateTransition.setRate(1);
        if (navigationDrawerOpen) {
            translateTransition.setByX(-192);
            navigationDrawerOpen = false;
        }
        else {
            translateTransition.setByX(192);
            navigationDrawerOpen = true;
        }
        translateTransition.setInterpolator(Interpolator.EASE_OUT);

        translateTransition.setOnFinished(event -> {
            transitionRunning = false;
        });

        translateTransition.play();
    }

}