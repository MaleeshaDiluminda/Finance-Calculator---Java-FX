package com.maleesha;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class savings  {

    public static void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Menu");
        AnchorPane pane =  new AnchorPane();

        //_______________________________________________________________ Labels _______________________________________________________________//

        // Topic - Label

        Label textTopic = new Label("Simple Savings Calculator");
        textTopic.setLayoutX(200);                                              // label kiyna class eke method
        textTopic.setLayoutY(60);
        textTopic.setStyle("-fx-font-size:25; -fx-text-fill: white");

        // Future Value - Label

        Label labelFutureValue = new Label("Future Value");
        labelFutureValue.setLayoutX(50);
        labelFutureValue.setLayoutY(130);
        labelFutureValue.setStyle("-fx-font-size:16; -fx-text-fill: white");

        // Present Value - Label

        Label labelPresentValue = new Label("Present Value");
        labelPresentValue.setLayoutX(50);
        labelPresentValue.setLayoutY(180);
        labelPresentValue.setStyle("-fx-font-size:16; -fx-text-fill: white");

        // Loan Term - Label

        Label labelloanTerm = new Label("Time");
        labelloanTerm.setLayoutX(50);
        labelloanTerm.setLayoutY(230);
        labelloanTerm.setStyle("-fx-font-size:16; -fx-text-fill: white");

        // Interest Rate - Label

        Label labelinterestRate = new Label("Interest Rate");
        labelinterestRate.setLayoutX(50);
        labelinterestRate.setLayoutY(280);
        labelinterestRate.setPrefSize(200,30);
        labelinterestRate.setStyle("-fx-font-size:16; -fx-text-fill: white");

        // Total Amount - Label

        Label answerLabel = new Label(" ");
        answerLabel.setLayoutX(200);
        answerLabel.setLayoutY(330);
        answerLabel.setPrefSize(200,30);
        answerLabel.setStyle("-fx-text-fill: gray; -fx-text-fill: white");

        //_______________________________________________________________ Text Fields _______________________________________________________________//

        // homePrice - TextField

        TextField futureValueTextField = new TextField();
        futureValueTextField.setLayoutX(200);
        futureValueTextField.setLayoutY(130);
        futureValueTextField.setPrefSize(200,30);

        // Interest Rate - TextField

        TextField interestRateTextField = new TextField();
        interestRateTextField.setLayoutX(200);
        interestRateTextField.setLayoutY(280);
        interestRateTextField.setPrefSize(200,30);

        // Present Value - Text Field

        TextField presentValuetTextField = new TextField();
        presentValuetTextField.setLayoutX(200);
        presentValuetTextField.setLayoutY(180);
        presentValuetTextField.setPrefSize(200,30);

        // Loan Term - Text Field

        TextField loanTermTextField = new TextField();
        loanTermTextField.setLayoutX(200);
        loanTermTextField.setLayoutY(230);
        loanTermTextField.setPrefSize(200,30);

        //__________________________________________________________ Calculate Buttons __________________________________________________________//

        // CALCULATE Button - Loan Term

        Button btnCalculate = new Button("Calculate");
        btnCalculate.setLayoutX(405);
        btnCalculate.setLayoutY(230);
        btnCalculate.setPrefSize(105,15);
        btnCalculate.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

        // Calculate Button - Future Value

        Button btnCalFutureValue = new Button("Calculate");
        btnCalFutureValue.setLayoutX(405);
        btnCalFutureValue.setLayoutY(130);
        btnCalFutureValue.setPrefSize(105,15);
        btnCalFutureValue.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

        // Calculate Button - Interest Rate

        Button btnCalInterestRate = new Button("Calculate");
        btnCalInterestRate.setLayoutX(405);
        btnCalInterestRate.setLayoutY(280);
        btnCalInterestRate.setPrefSize(105,15);
        btnCalInterestRate.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

        // Calculate Button - Present Value

        Button btnCalPresentValue = new Button("Calculate");
        btnCalPresentValue.setLayoutX(405);
        btnCalPresentValue.setLayoutY(180);
        btnCalPresentValue.setPrefSize(105,15);
        btnCalPresentValue.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

        // Clear All Button

        Button btnClearAll = new Button("Clear All");
        btnClearAll.setLayoutX(560);
        btnClearAll.setLayoutY(330);
        btnClearAll.setPrefSize(200,45);
        btnClearAll.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff;-fx-text-fill: black");

        // Back Button

        Button btnBackButton = new Button("Back");
        btnBackButton.setLayoutX(10);
        btnBackButton.setLayoutY(10);
        btnBackButton.setStyle("-fx-font-size:16");
        btnBackButton.setStyle("-fx-background-color: #3bc7ff");
        btnBackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Main.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

       futureValueTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(futureValueTextField,pane);
            }
        });

        presentValuetTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(presentValuetTextField,pane);
            }
        });

        loanTermTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(loanTermTextField,pane);
            }
        });

        interestRateTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(interestRateTextField,pane);
            }
        });

        answerLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(interestRateTextField,pane);
            }
        });

        // Clear All Button - linked text fields

        btnClearAll.setOnAction(event -> {
            loanTermTextField.clear();
            futureValueTextField.clear();
            presentValuetTextField.clear();
            interestRateTextField.clear();

        });

        pane.setStyle("-fx-background-image: url('darkblue.jpg')");
        pane.getChildren().addAll(textTopic,labelFutureValue,labelPresentValue,labelloanTerm,labelinterestRate,btnClearAll,btnCalculate);
        pane.getChildren().addAll(futureValueTextField,presentValuetTextField,loanTermTextField,interestRateTextField,answerLabel);
        pane.getChildren().addAll(btnBackButton,btnCalFutureValue,btnCalInterestRate,btnCalPresentValue);
        primaryStage.setScene(new Scene(pane,800,500));
        primaryStage.setResizable(false);        // for Fixed Size
        primaryStage.show();

        //________________________________________________________ Calculations ________________________________________________________//

        // Loan Term Calculation

        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double FV = Double.parseDouble(futureValueTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PV = Double.parseDouble(presentValuetTextField.getText());
                double Time =  (FV/PV)/((Math.log(1+(IR/12))));
                String result = String.format("%.2f",Time);
                loanTermTextField.setText(result);

            }
        });

        // Future Value Calculation

        btnCalFutureValue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PV = Double.parseDouble(presentValuetTextField.getText());
                double Time = Double.parseDouble(loanTermTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double FV = PV *(Math.pow((1+(IR/100/12)),(12*Time)));
                String result = String.format("%.2f",FV);
                futureValueTextField.setText(result);

            }
        });

        // Interest Calculation

        btnCalInterestRate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PV = Double.parseDouble(presentValuetTextField.getText());
                double Time = Double.parseDouble(loanTermTextField.getText());
                double FV = Double.parseDouble(futureValueTextField.getText());
                double IR = 12*((Math.pow((FV/PV),1/(12*Time)))-1);
                String result = String.format("%.2f",IR);
                interestRateTextField.setText(result);

            }
        });

        // Present Value Calculation

        btnCalPresentValue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double FV = Double.parseDouble(futureValueTextField.getText());
                double Time = Double.parseDouble(loanTermTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PV = FV/((Math.pow((1+(IR/100/12)),(12*Time))));
                String result = String.format("%.2f",PV);
                presentValuetTextField.setText(result);

            }
        });

    }

}
