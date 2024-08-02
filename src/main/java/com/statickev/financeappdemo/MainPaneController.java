package com.statickev.financeappdemo;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainPaneController {
    @FXML
    public Pane navigationDrawer;
    @FXML
    public Label label_dashboard, label_profile, label_income, label_expenses, label_analytics;
    @FXML
    public Pane navigationBar;
    @FXML
    public ImageView icon_dashboard, icon_profile, icon_income, icon_expenses, icon_analytics;
    @FXML
    public Pane navButton_dashboard, navButton_profile, navButton_income, navButton_expenses, navButton_analytics;

    Map<String, String> colorPalette = Map.of(
            "Espresso", "#1A120B",
            "Mocha", "#3C2A21",
            "Latte", "#D5CEA3",
            "Cream", "#E5E5CB"
            );
    Map<String, Boolean> menuIsOpen = new HashMap<>(Map.of(
            "dashboard", true,
            "profile", false,
            "income", false,
            "expenses", false,
            "analytics", false
    ));
    Map<String, Pane> drawerButtons;
    Map<String, Label> drawerLabels;

    public void initialize() {
        navigationDrawer.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        navigationBar.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        label_dashboard.setStyle("-fx-background-color: " + colorPalette.get("Mocha"));
        label_profile.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        label_income.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        label_expenses.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        label_analytics.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        navButton_dashboard.setStyle("-fx-background-color: " + colorPalette.get("Mocha"));
        navButton_profile.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        navButton_income.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        navButton_expenses.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        navButton_analytics.setStyle("-fx-background-color: " + colorPalette.get("Espresso"));
        icon_dashboard.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_dashboard.png"))));
        icon_profile.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_profile.png"))));
        icon_income.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_income.png"))));
        icon_expenses.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_expense.png"))));
        icon_analytics.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_analytics.png"))));
        drawerButtons = Map.of(
                "dashboard", navButton_dashboard,
                "profile", navButton_profile,
                "income", navButton_income,
                "expenses", navButton_expenses,
                "analytics", navButton_analytics
        );
        drawerLabels = Map.of(
                "dashboard", label_dashboard,
                "profile", label_profile,
                "income", label_income,
                "expenses", label_expenses,
                "analytics", label_analytics
        );
    }

    public void drawNavigationDrawer() {
        if (navigationDrawer.getTranslateX() != -140) return;
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(navigationDrawer);
        transition.setDuration(Duration.seconds(0.2));
        transition.setInterpolator(Interpolator.EASE_OUT);
        transition.setRate(1);
        transition.setByX(140);

        transition.play();
    }

    public void hideNavigationDrawer() {
        if (navigationDrawer.getTranslateX() != 0) return;
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(navigationDrawer);
        transition.setDuration(Duration.seconds(0.2));
        transition.setInterpolator(Interpolator.EASE_IN);
        transition.setRate(1);
        transition.setByX(-140);

        transition.play();
    }

    public void colorDrawerButton(String color, Pane button, Label label) {
        button.setStyle("-fx-background-color: " + color);
        label.setStyle("-fx-background-color: " + color);
    }

    public void onMouseHover(MouseEvent event) {
        Node sender = (Node) event.getSource();

        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            for (String option : drawerButtons.keySet()) {
                if (sender.getId().contains(option)) {
                    colorDrawerButton(
                            colorPalette.get("Mocha"),
                            drawerButtons.get(option),
                            drawerLabels.get(option)
                    );
                    break;
                }
            }
        } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
            for (String option : drawerButtons.keySet()) {
                if (sender.getId().contains(option) && !menuIsOpen.get(option)) {
                    colorDrawerButton(
                            colorPalette.get("Espresso"),
                            drawerButtons.get(option),
                            drawerLabels.get(option)
                    );
                    break;
                }
            }
        }
    }

    public void clickMenu(Event event) {
        Node sender = (Node) event.getSource();

        for (String option : menuIsOpen.keySet()) {
            if (sender.getId().contains(option)) menuIsOpen.replace(option, true);
            else menuIsOpen.replace(option, false);
        }

        for (String option : menuIsOpen.keySet()) {
            if (!menuIsOpen.get(option)) {
                colorDrawerButton(
                        colorPalette.get("Espresso"),
                        drawerButtons.get(option),
                        drawerLabels.get(option)
                );
            }
        }
    }
}
