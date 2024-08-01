package com.statickev.financeappdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.Objects;

public class MainPaneController {
    @FXML
    public Pane navigationDrawer;
    @FXML
    public Label dashboardButton, profileButton, incomeButton, expenseButton, analyticsButton;
    @FXML
    public Pane navigationDrawerIcons;
    @FXML
    public ImageView dashboardButtonIcon, profileButtonIcon, incomeButtonIcon, expenseButtonIcon, analyticsButtonIcon;

    @FXML
    public void initialize() {
        dashboardButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_dashboard.png"))));
        profileButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_profile.png"))));
        incomeButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_income.png"))));
        expenseButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_expense.png"))));
        analyticsButtonIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_analytics.png"))));
    }
}
