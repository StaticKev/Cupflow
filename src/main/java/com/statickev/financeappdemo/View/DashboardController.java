package com.statickev.financeappdemo.View;

import com.statickev.financeappdemo.Values.ColorPalette;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.lang.reflect.Field;
import java.util.Objects;

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
    private ImageView profilePicture;

    @FXML
    private Pane pane_recapChart;

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
    private ImageView
            barChart_I_border1, barChart_I_border2, barChart_I_border3, barChart_I_border4,
            barChart_I_border5, barChart_I_border6, barChart_I_border7, barChart_I_border8,
            barChart_I_border9, barChart_I_border10, barChart_I_border11, barChart_I_border12;

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
    private ImageView
            barChart_E_border1, barChart_E_border2, barChart_E_border3, barChart_E_border4,
            barChart_E_border5, barChart_E_border6, barChart_E_border7, barChart_E_border8,
            barChart_E_border9, barChart_E_border10, barChart_E_border11, barChart_E_border12;

    @FXML
    private Pane
            barChart_hoverEffect1, barChart_hoverEffect2, barChart_hoverEffect3, barChart_hoverEffect4,
            barChart_hoverEffect5, barChart_hoverEffect6, barChart_hoverEffect7, barChart_hoverEffect8,
            barChart_hoverEffect9, barChart_hoverEffect10, barChart_hoverEffect11, barChart_hoverEffect12;

    @FXML
    private Pane pane_recentItems;

    @FXML
    private Pane pane_record1, pane_record2, pane_record3, pane_record4;

    @FXML
    private Label label_record1, label_record2, label_record3, label_record4;

    @FXML
    private Label label_value1, label_value2, label_value3, label_value4;

    @FXML
    private Pane button_addRecord_I, button_addRecord_E;

    @FXML
    private ImageView image_addRecord_I, image_addRecord_E;

    @FXML
    private Label label_add_I, label_add_E;

    @FXML
    private Label label_button_I, label_button_E;

    @FXML
    private ImageView image_icon_I, image_icon_E;

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
//            for (int i = 1; i <= 4; i++) {
//                String recordPaneName = "pane_record" + i;
//                Field field = this.getClass().getDeclaredField(recordPaneName);
//                field.setAccessible(true);
//                Pane recordPane = (Pane) field.get(this);
//                recordPane.setVisible(false);
//            }
            for (int i = 1; i <= 12; i++) {
                String barChartNameI = "barChart_I_" + i;
                Field field1 = this.getClass().getDeclaredField(barChartNameI);
                field1.setAccessible(true);
                Pane pane1 = (Pane) field1.get(this);
                pane1.setClip(new Rectangle(8, 70));

                String barChartNameE = "barChart_E_" + i;
                Field field2 = this.getClass().getDeclaredField(barChartNameE);
                field2.setAccessible(true);
                Pane pane2 = (Pane) field2.get(this);
                pane2.setClip(new Rectangle(8, 70));

                String barChartFillNameI = "barChart_I_fill" + i;
                Field field3 = this.getClass().getDeclaredField(barChartFillNameI);
                field3.setAccessible(true);
                ImageView imageView1 = (ImageView) field3.get(this);
                imageView1.setLayoutY(65);

                String barChartFillNameE = "barChart_E_fill" + i;
                Field field4 = this.getClass().getDeclaredField(barChartFillNameE);
                field4.setAccessible(true);
                ImageView imageView2 = (ImageView) field4.get(this);
                imageView2.setLayoutY(-65);
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

    public void barChart_onMouseEnter(MouseEvent event) throws NoSuchFieldException, IllegalAccessException {
        Pane pane = (Pane) event.getSource();

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/BarChart_HoverEffect.png")));
        BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false)
        );

        String barId = pane.getId().substring(20);

        Field fieldI = this.getClass().getDeclaredField("barChart_I_border" + barId);
        Field fieldE = this.getClass().getDeclaredField("barChart_E_border" + barId);
        fieldI.setAccessible(true);
        fieldE.setAccessible(true);
        ImageView barChartBorderI = (ImageView) fieldI.get(this);
        ImageView barChartBorderE = (ImageView) fieldE.get(this);
        barChartBorderI.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/BarChart_border_onHover.png"))));
        barChartBorderE.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/BarChart_border_onHover.png"))));

        pane.setBackground(new Background(backgroundImage));
    }

    public void barChart_onMouseExited(MouseEvent event) throws NoSuchFieldException, IllegalAccessException {
        Pane pane = (Pane) event.getSource();
        pane.setBackground(null);

        String barId = pane.getId().substring(20);

        Field fieldI = this.getClass().getDeclaredField("barChart_I_border" + barId);
        Field fieldE = this.getClass().getDeclaredField("barChart_E_border" + barId);
        fieldI.setAccessible(true);
        fieldE.setAccessible(true);
        ImageView barChartBorderI = (ImageView) fieldI.get(this);
        ImageView barChartBorderE = (ImageView) fieldE.get(this);
        barChartBorderI.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/BarChart_border.png"))));
        barChartBorderE.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/BarChart_border.png"))));
    }

    public void addButton_onMouseEntered(MouseEvent event) {
        Node sender = (Node) event.getSource();

        if (sender.getId().contains("_I")) {
            image_addRecord_I.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Button_addRecord_I.png"))));
            label_add_I.setStyle("-fx-text-fill: " + ColorPalette.get("Cream") + ";");
            label_button_I.setStyle("-fx-text-fill: " + ColorPalette.get("Cream") + ";");
            image_icon_I.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_income.png"))));
        } else if (sender.getId().contains("_E")) {
            image_addRecord_E.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Button_addRecord_E.png"))));
            label_add_E.setStyle("-fx-text-fill: " + ColorPalette.get("Cream") + ";");
            label_button_E.setStyle("-fx-text-fill: " + ColorPalette.get("Cream") + ";");
            image_icon_E.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_expense.png"))));
        }
    }

    public void addButton_onMouseExited(MouseEvent event) {
        Node sender = (Node) event.getSource();

        if (sender.getId().contains("_I")) {
            image_addRecord_I.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Button_addRecord.png"))));
            label_add_I.setStyle("-fx-text-fill: " + ColorPalette.get("Espresso") + ";");
            label_button_I.setStyle("-fx-text-fill: " + ColorPalette.get("Espresso") + ";");
            image_icon_I.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_income_dark.png"))));
        } else if (sender.getId().contains("_E")) {
            image_addRecord_E.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Button_addRecord.png"))));
            label_add_E.setStyle("-fx-text-fill: " + ColorPalette.get("Espresso") + ";");
            label_button_E.setStyle("-fx-text-fill: " + ColorPalette.get("Espresso") + ";");
            image_icon_E.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Icon_expense_dark.png"))));
        }
    }

    public void addButton_onMouseClick(MouseEvent event) throws Exception {
        throw new Exception("Feature not implemented!");
//        Node sender = (Node) event.getSource();

//        if (sender.getId().contains("_I")) {
//
//        } else if (sender.getId().contains("_E")) {
//
//        }
    }

    public void record_onMouseEntered(MouseEvent event) {
        Pane sender = (Pane) event.getSource();

        if (sender.getId().contains("1")) {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Images/Image_recentlyAdded_highlight1.png")));
            BackgroundImage backgroundImage = new BackgroundImage(
                    image,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false)
            );
            sender.setBackground(new Background(backgroundImage));
        } else {
            sender.setStyle("-fx-background-color: " + ColorPalette.get("Light-caramel") + ";");
        }

    }

    public void record_onMouseExited(MouseEvent event) {
        Pane sender = (Pane) event.getSource();

        if (sender.getId().contains("1")) sender.setBackground(null);
        else sender.setStyle("-fx-background-color: transparent;");
    }

    public void record_onMouseClicked(MouseEvent event) throws Exception {
        throw new Exception ("Feature not implemented!");
    }

}
