package com.maleesha;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class KeyPad {
    public static void callKeypad(TextField text, AnchorPane pane){

        // KEY BOARD - Number 1

        Button btn_1 = new Button("1");
        btn_1.setLayoutX(560);
        btn_1.setLayoutY(130);
        btn_1.setPrefSize(60,35);
        btn_1.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 2

        Button btn_2 = new Button("2");
        btn_2.setLayoutX(630);
        btn_2.setLayoutY(130);
        btn_2.setPrefSize(60,35);
        btn_2.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 3

        Button btn_3 = new Button("3");
        btn_3.setLayoutX(700);
        btn_3.setLayoutY(130);
        btn_3.setPrefSize(60,35);
        btn_3.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 4

        Button btn_4 = new Button("4");
        btn_4.setLayoutX(560);
        btn_4.setLayoutY(180);
        btn_4.setPrefSize(60,35);
        btn_4.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 5

        Button btn_5 = new Button("5");
        btn_5.setLayoutX(630);
        btn_5.setLayoutY(180);
        btn_5.setPrefSize(60,35);
        btn_5.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 6

        Button btn_6 = new Button("6");
        btn_6.setLayoutX(700);
        btn_6.setLayoutY(180);
        btn_6.setPrefSize(60,35);
        btn_6.setStyle("-fx-background-color:#ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 7

        Button btn_7 = new Button("7");
        btn_7.setLayoutX(560);
        btn_7.setLayoutY(230);
        btn_7.setPrefSize(60,35);
        btn_7.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 8

        Button btn_8 = new Button("8");
        btn_8.setLayoutX(630);
        btn_8.setLayoutY(230);
        btn_8.setPrefSize(60,35);
        btn_8.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 9

        Button btn_9 = new Button("9");
        btn_9.setLayoutX(700);
        btn_9.setLayoutY(230);
        btn_9.setPrefSize(60,35);
        btn_9.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Number 0

        Button btn_0 = new Button("0");
        btn_0.setLayoutX(630);
        btn_0.setLayoutY(280);
        btn_0.setPrefSize(60,35);
        btn_0.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Clear Button

        Button btnClear = new Button("Clear");
        btnClear.setLayoutX(700);
        btnClear.setLayoutY(280);
        btnClear.setPrefSize(60,35);
        btnClear.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        // KEY BOARD - Dot Button

        Button btnDot = new Button(".");
        btnDot.setLayoutX(560);
        btnDot.setLayoutY(280);
        btnDot.setPrefSize(60,35);
        btnDot.setStyle("-fx-background-color: #ff0000;-fx-text-fill: #ffffff");

        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("1");

            }
        });
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("2");

            }
        });
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("3");

            }
        });
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("4");

            }
        });
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("5");

            }
        });
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("6");

            }
        });
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("7");

            }
        });
        btn_8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("8");

            }
        });
        btn_9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("9");

            }
        });
        btn_0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText("0");

            }
        });
        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.setText(text.getText().substring(0,text.getText().length()-1));

            }
        });
        btnDot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {text.appendText(".");

            }
        });

        pane.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btnDot,btn_0,btnClear);

    }

}