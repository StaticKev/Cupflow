package com.statickev.financeappdemo.View;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class DashboardController {
    @FXML
    private AnchorPane dashboardPane;

    @FXML
    private Label label_date;

    @FXML
    private Pane pane_userBalance;

    @FXML
    private Label label_balance, label_income, label_outcome;

    @FXML
    private Pane pane_myCup;

    @FXML
    private Label label_target, label_cupValue;

    @FXML
    private Pane progressBar;

    @FXML
    private ImageView progressBar_fill;

    @FXML
    private Pane pane_recapChart;

    @FXML
    private Pane
            barChart_E_1, barChart_E_2, barChart_E_3, barChart_E_4,
            barChart_E_5, barChart_E_6, barChart_E_7, barChart_E_8,
            barChart_E_9, barChart_E_10, barChart_E_11, barChart_E_12;

    @FXML
    private ImageView
            barChart_E_fill1, barChart_E_fill2, barChart_E_fill3, barChart_E_fill4,
            barChart_E_fill5, barChart_E_fill6, barChart_E_fill7, barChart_E_fill8,
            barChart_E_fill9, barChart_E_fill10, barChart_E_fill11, barChart_E_fill12;

    @FXML
    private Pane
            barChart_I_1, barChart_I_2, barChart_I_3, barChart_I_4,
            barChart_I_5, barChart_I_6, barChart_I_7, barChart_I_8,
            barChart_I_9, barChart_I_10, barChart_I_11, barChart_I_12;

    @FXML
    private ImageView
            barChart_I_fill1, barChart_I_fill2, barChart_I_fill3, barChart_I_fill4,
            barChart_I_fill5, barChart_I_fill6, barChart_I_fill7, barChart_I_fill8,
            barChart_I_fill9, barChart_I_fill10, barChart_I_fill11, barChart_I_fill12;

    @FXML
    private Pane pane_recentItems;

    @FXML
    private Pane pane_record1, pane_record2, pane_record3, pane_record4;

    @FXML
    private Label label_record1, label_record2, label_record3, label_record4;

    @FXML
    private Label label_value1, label_value2, label_value3, label_value4;

    @FXML
    private Line line_separator1, line_separator2, line_separator3;

    @FXML
    private Pane button_addRecord_I, button_addRecord_E;

    @FXML
    private ImageView image_addRecord_I, image_addRecord_E;

    @FXML
    private Label label_addI, label_addE;

    @FXML
    private Label label_incomeButton, label_expenseButton;

    @FXML
    private ImageView image_incomeIcon, image_expenseIcon;

    public void initialize() {
//        label_date.setText(LocalDateTime.now().toString());

        startLeftTransition(pane_userBalance, 0.3, pane_userBalance.getWidth());
        startLeftTransition(pane_recapChart, 0.6, pane_recapChart.getWidth());
        startRightTransition(pane_recentItems, 0.4);
        startRightTransition(pane_myCup, 0.7);
        startRightTransition(button_addRecord_I, 0.6);
        startRightTransition(button_addRecord_E, 0.8);

        progressBar.setClip(new Rectangle(130, 18));
        progressBar_fill.setVisible(true);
        progressBar_fill.setLayoutX(-130);

        try {
            for (int i = 1; i <= 3; i++) {
                String separatorName = "line_separator" + i;
                Field field = this.getClass().getDeclaredField(separatorName);
                field.setAccessible(true);
                Line separator = (Line) field.get(this);
                separator.setVisible(false);
            }
            for (int i = 1; i <= 4; i++) {
                String recordPaneName = "pane_record" + i;
                Field field = this.getClass().getDeclaredField(recordPaneName);
                field.setAccessible(true);
                Pane recordPane = (Pane) field.get(this);
                recordPane.setVisible(false);
            }
            for (int i = 1; i <= 12; i++) {
                String barChartName = "barChart_I_" + i;
                Field field = this.getClass().getDeclaredField(barChartName);
                field.setAccessible(true);
                Pane pane = (Pane) field.get(this);
                pane.setClip(new Rectangle(8, 70));
            }
            for (int i = 1; i <= 12; i++) {
                String barChartName = "barChart_E_" + i;
                Field field = this.getClass().getDeclaredField(barChartName);
                field.setAccessible(true);
                Pane pane = (Pane) field.get(this);
                pane.setClip(new Rectangle(8, 70));
            }
            for (int i = 1; i <= 12; i++) {
                String barChartFillName = "barChart_I_fill" + i;
                Field field = this.getClass().getDeclaredField(barChartFillName);
                field.setAccessible(true);
                ImageView imageView = (ImageView) field.get(this);
                imageView.setLayoutY(65);
            }
            for (int i = 1; i <= 12; i++) {
                String barChartFillName = "barChart_E_fill" + i;
                java.lang.reflect.Field field = this.getClass().getDeclaredField(barChartFillName);
                field.setAccessible(true);
                ImageView imageView = (ImageView) field.get(this);
                imageView.setLayoutY(-65);
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public void startLeftTransition(Node node, double duration, double width) {
        node.setLayoutX(0);
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(node);
        transition.setDuration(Duration.seconds(duration));
        transition.setInterpolator(Interpolator.EASE_IN);
        transition.setRate(0.8);
        transition.setByX(43);

        transition.play();
    }

    public void startRightTransition(Node node, double duration) {
        node.setLayoutX(node.getLayoutX() + 43);
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(node);
        transition.setDuration(Duration.seconds(duration));
        transition.setInterpolator(Interpolator.EASE_IN);
        transition.setRate(0.8);
        transition.setByX(-43);

        transition.play();
    }
}
