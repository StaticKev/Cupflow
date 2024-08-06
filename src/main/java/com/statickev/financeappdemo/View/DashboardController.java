package com.statickev.financeappdemo.View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.util.Objects;

public class DashboardController {
    @FXML
    private AnchorPane dashboardPane;

    @FXML
    private Label label_date;

    @FXML
    private Pane pane_userBalance;

    @FXML
    private Label label_balance;

    @FXML
    private Label label_income;

    @FXML
    private Label label_outcome;

    @FXML
    private Pane pane_myCup;

    @FXML
    private Label label_target;

    @FXML
    private Label label_cupValue;

    @FXML
    private Pane progressBar;

    @FXML
    private ImageView progressBar_fill;

    @FXML
    private Pane pane_recapChart;

    @FXML
    private Pane barChart_E_12;

    @FXML
    private ImageView barChart_E_fill12;

    @FXML
    private Pane barChart_E_11;

    @FXML
    private ImageView barChart_E_fill11;

    @FXML
    private Pane barChart_E_10;

    @FXML
    private ImageView barChart_E_fill10;

    @FXML
    private Pane barChart_E_9;

    @FXML
    private ImageView barChart_E_fill9;

    @FXML
    private Pane barChart_E_8;

    @FXML
    private ImageView barChart_E_fill8;

    @FXML
    private Pane barChart_E_7;

    @FXML
    private ImageView barChart_E_fill7;

    @FXML
    private Pane barChart_E_6;

    @FXML
    private ImageView barChart_E_fill6;

    @FXML
    private Pane barChart_E_5;

    @FXML
    private ImageView barChart_E_fill5;

    @FXML
    private Pane barChart_E_4;

    @FXML
    private ImageView barChart_E_fill4;

    @FXML
    private Pane barChart_E_3;

    @FXML
    private ImageView barChart_E_fill3;

    @FXML
    private Pane barChart_E_2;

    @FXML
    private ImageView barChart_E_fill2;

    @FXML
    private Pane barChart_E_1;

    @FXML
    private ImageView barChart_E_fill1;

    @FXML
    private Pane barChart_I_12;

    @FXML
    private ImageView barChart_I_fill12;

    @FXML
    private Pane barChart_I_11;

    @FXML
    private ImageView barChart_I_fill11;

    @FXML
    private Pane barChart_I_10;

    @FXML
    private ImageView barChart_I_fill10;

    @FXML
    private Pane barChart_I_9;

    @FXML
    private ImageView barChart_I_fill9;

    @FXML
    private Pane barChart_I_8;

    @FXML
    private ImageView barChart_I_fill8;

    @FXML
    private Pane barChart_I_7;

    @FXML
    private ImageView barChart_I_fill7;

    @FXML
    private Pane barChart_I_6;

    @FXML
    private ImageView barChart_I_fill6;

    @FXML
    private Pane barChart_I_5;

    @FXML
    private ImageView barChart_I_fill5;

    @FXML
    private Pane barChart_I_4;

    @FXML
    private ImageView barChart_I_fill4;

    @FXML
    private Pane barChart_I_3;

    @FXML
    private ImageView barChart_I_fill3;

    @FXML
    private Pane barChart_I_2;

    @FXML
    private ImageView barChart_I_fill2;

    @FXML
    private Pane barChart_I_1;

    @FXML
    private ImageView barChart_I_fill1;

    @FXML
    private Pane pane_recentItems;

    @FXML
    private Pane pane_record1;

    @FXML
    private Label label_record1;

    @FXML
    private Label label_value1;

    @FXML
    private Line line_separator1;

    @FXML
    private Line line_separator2;

    @FXML
    private Line line_separator3;

    @FXML
    private Pane pane_record2;

    @FXML
    private Label label_record2;

    @FXML
    private Label label_value2;

    @FXML
    private Pane pane_record3;

    @FXML
    private Label label_record3;

    @FXML
    private Label label_value3;

    @FXML
    private Pane pane_record4;

    @FXML
    private Label label_record4;

    @FXML
    private Label label_value4;

    @FXML
    private Pane button_addRecord_I;

    @FXML
    private ImageView image_addRecord_I;

    @FXML
    private Label label_add1;

    @FXML
    private Label label_incomeButton;

    @FXML
    private ImageView image_incomeIcon;

    @FXML
    private Pane button_addRecord_E;

    @FXML
    private ImageView image_addRecord_E;

    @FXML
    private Label label_expenseButton;

    @FXML
    private ImageView image_expenseIcon;

    public void initialize() {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Pane_bgImage_DashboardTop.png")));
        BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false)
        );
        pane_userBalance.setBackground(new Background(backgroundImage));

//        progressBar.setClip(new Rectangle(130, 18));
//        progressBarFill.setVisible(true);
//        progressBarFill.setLayoutX(-140);

    }
}
