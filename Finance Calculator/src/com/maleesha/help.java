package com.maleesha;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class help  {

    public static void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Menu");
        AnchorPane pane =  new AnchorPane();

        // Topic - Label

        Label textTopic = new Label("HELP");
        textTopic.setLayoutX(370);
        textTopic.setLayoutY(60);
        textTopic.setStyle("-fx-font-size:25; -fx-text-fill: white");

        Label textInstructions1 = new Label("  1. Choose the Calculator you want.");
        textInstructions1.setLayoutX(40);
        textInstructions1.setLayoutY(150);
        textInstructions1.setStyle("-fx-font-size:20; -fx-text-fill: white");

        Label textInstructions2 = new Label("  2. Click the text field to get Key Pad.");
        textInstructions2.setLayoutX(40);
        textInstructions2.setLayoutY(180);
        textInstructions2.setStyle("-fx-font-size:20; -fx-text-fill: white");

        Label textInstructions3 = new Label("  3. Keep the Text Field which you need to calculate and fill the others.");
        textInstructions3.setLayoutX(40);
        textInstructions3.setLayoutY(210);
        textInstructions3.setStyle("-fx-font-size:20; -fx-text-fill: white");

        Label textInstructions4 = new Label("  4. Click the relevant Calculate button to get the relevant calculation.");
        textInstructions4.setLayoutX(40);
        textInstructions4.setLayoutY(240);
        textInstructions4.setStyle("-fx-font-size:20; -fx-text-fill: white");

        Label textInstructions5 = new Label("  5. Click 'Clear All' button to erase the calculation.");
        textInstructions5.setLayoutX(40);
        textInstructions5.setLayoutY(270);
        textInstructions5.setStyle("-fx-font-size:20; -fx-text-fill: white");

        // Back Button

        Button btnBackButton = new Button("Back");
        btnBackButton.setLayoutX(10);
        btnBackButton.setLayoutY(10);
        btnBackButton.setStyle("-fx-font-size:16");
        btnBackButton.setStyle("-fx-background-color: #3bc7ff");
        btnBackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {                       //
                try {                                                     //
                    Main.start(primaryStage);                             //
                } catch (Exception e) {                                   //
                    e.printStackTrace();                                  //
                }                                                         //
            }                                                             //
        });

        pane.setStyle("-fx-background-image: url('darkblue.jpg')");
        pane.getChildren().addAll(textTopic,btnBackButton,textInstructions1,textInstructions2,textInstructions3,textInstructions4,textInstructions5);
        primaryStage.setScene(new Scene(pane,800,500));
        primaryStage.setResizable(false);        // for Fixed Size
        primaryStage.show();

    }

}




