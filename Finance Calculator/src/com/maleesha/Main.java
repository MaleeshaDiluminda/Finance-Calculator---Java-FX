package com.maleesha;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.FileInputStream;

public class Main  {



    public static void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Menu");

        Label textTopic = new Label("Finance Calculator");
        textTopic.setLayoutX(295);
        textTopic.setLayoutY(60);
        textTopic.setStyle("-fx-font-size:25; -fx-text-fill: white");

        // HELP Button

        Button helpButton = new Button("HELP");
        helpButton.setLayoutX(730);
        helpButton.setLayoutY(10);
        helpButton.setStyle("-fx-background-color: #3bc7ff");
        helpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    help.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Savings Button

        Button savingsButton = new Button(" ");
        savingsButton.setLayoutY(175);
        savingsButton.setLayoutX(50);
        savingsButton.setPrefSize(120,120);
        savingsButton.setStyle("-fx-font-size:16;-fx-background-color: transparent");
        savingsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override                                                                          //  @Override   ??????????????????
            public void handle(ActionEvent event) {                                            // public void handle(Action event)
                try {
                    savings.start(primaryStage);                                               // try  catch ????
                }catch (Exception e){                                                          // Exception e
                    e.printStackTrace();                                                       // e.printStackTrace  ???????????
                }
            }
        });

        // Loan Button

        Button loanButton = new Button(" ");
        loanButton.setLayoutY(175);
        loanButton.setLayoutX(230);
        loanButton.setPrefSize(120,120);

        loanButton.setStyle("-fx-font-size:16;-fx-background-color: transparent");
        loanButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override                                                               // OOP wala polymophison - Standered method ekak apita ona widiyta apita ona prt eka withrk modifi krna eka
            public void handle(ActionEvent event) {                                 //
                try {
                    loan.start(primaryStage);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        // Compound Interest Button

        Button compoundButton = new Button(" ");
        compoundButton.setLayoutY(175);
        compoundButton.setLayoutX(410);
        compoundButton.setPrefSize(120,120);
        compoundButton.setStyle("-fx-font-size:16;-fx-background-color: transparent");
        compoundButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    finance.start(primaryStage);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        // Mortgage Button

        Button mortgageButton = new Button(" ");
        mortgageButton.setLayoutY(175);
        mortgageButton.setLayoutX(600);
        mortgageButton.setPrefSize(120,120);
        mortgageButton.setStyle("-fx-font-size:16;-fx-background-color: transparent");
        mortgageButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    mortgage.start(primaryStage);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        // Savings Button Image

        Image imageSavings = new Image(new FileInputStream("Savings.png"));
        ImageView imageViewSavings = new ImageView(imageSavings);
        savingsButton.setGraphic(imageViewSavings);
        imageViewSavings.setFitHeight(120);
        imageViewSavings.setFitWidth(120);

        // Mortgage Button Image

        Image imageMortgage = new Image(new FileInputStream("Mortgage.png"));
        ImageView imageViewMortgage = new ImageView(imageMortgage);
        mortgageButton.setGraphic(imageViewMortgage);
        imageViewMortgage.setFitHeight(120);
        imageViewMortgage.setFitWidth(120);

        // Loan Button Image

        Image imageLoan = new Image(new FileInputStream("Loan.png"));
        ImageView imageViewLoan = new ImageView(imageLoan);
        loanButton.setGraphic(imageViewLoan);
        imageViewLoan.setFitHeight(120);
        imageViewLoan.setFitWidth(120);

        // Compound Button Image

        Image imageCompound = new Image(new FileInputStream("Compound.png"));
        ImageView imageViewCompound = new ImageView(imageCompound);
        compoundButton.setGraphic(imageViewCompound);
        imageViewCompound.setFitHeight(120);
        imageViewCompound.setFitWidth(120);

        AnchorPane pane =  new AnchorPane();
        pane.getChildren().addAll(textTopic,savingsButton,loanButton,mortgageButton,compoundButton,helpButton);

        primaryStage.setScene(new Scene(pane,800,500));
        primaryStage.show();
        pane.setStyle("-fx-background-image: url('darkblue.jpg')");

    }

}
