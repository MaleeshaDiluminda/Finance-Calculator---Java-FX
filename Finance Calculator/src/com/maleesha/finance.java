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

public class finance  {


    public static void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Menu");
        AnchorPane pane =  new AnchorPane();

        //__________________________________________________________________ Labels _________________________________________________________________//

        // Topic - Label

        Label textTopic = new Label("Savings Calculator with Payment");
        textTopic.setLayoutX(200);
        textTopic.setLayoutY(60);
        textTopic.setStyle("-fx-font-size:25; -fx-text-fill: white");

        // Future Value - Label

        Label labelPayment = new Label("Future Value");
        labelPayment.setLayoutX(50);
        labelPayment.setLayoutY(130);
        labelPayment.setStyle("-fx-font-size:16; -fx-text-fill: white");

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

        // Payment - Label

        Label answerLabel = new Label("Payment");
        answerLabel.setLayoutX(50);
        answerLabel.setLayoutY(330);
        answerLabel.setPrefSize(200,30);
        answerLabel.setStyle("-fx-font-size:16; -fx-text-fill: white");

        //_______________________________________________________________ Text Fields ____________________________________________________________//

        // Future Value - TextField

        TextField futureValueTextField = new TextField();
        futureValueTextField.setLayoutX(200);
        futureValueTextField.setLayoutY(130);
        futureValueTextField.setPrefSize(200,30);

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

        // Interest Rate - TextField

        TextField interestRateTextField = new TextField();
        interestRateTextField.setLayoutX(200);
        interestRateTextField.setLayoutY(280);
        interestRateTextField.setPrefSize(200,30);

        // Payment - Text Field

        TextField paymentTextField = new TextField();
        paymentTextField.setLayoutX(200);
        paymentTextField.setLayoutY(330);
        paymentTextField.setPrefSize(200,30);

        //_________________________________________________ Calculate Buttons ______________________________________________//

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

        // Calculate Button - Payment

        Button btnPayment = new Button("Calculate");
        btnPayment.setLayoutX(405);
        btnPayment.setLayoutY(330);
        btnPayment.setPrefSize(105,15);
        btnPayment.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

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

        paymentTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(paymentTextField,pane);
            }
        });

        // Clear All Button - linked text fields

        btnClearAll.setOnAction(event -> {
            loanTermTextField.clear();
            futureValueTextField.clear();
            presentValuetTextField.clear();
            interestRateTextField.clear();
            paymentTextField.clear();

        });

        pane.setStyle("-fx-background-image: url('darkblue.jpg')");
        pane.getChildren().addAll(textTopic,labelPayment,labelPresentValue,labelloanTerm,labelinterestRate,btnClearAll,btnCalculate);
        pane.getChildren().addAll(futureValueTextField,presentValuetTextField,loanTermTextField,interestRateTextField,answerLabel);
        pane.getChildren().addAll(btnBackButton,btnCalFutureValue,btnCalPresentValue,paymentTextField,btnPayment);
        primaryStage.setScene(new Scene(pane,800,500));
        primaryStage.setResizable(false);        // for Fixed Size
        primaryStage.show();

        //________________________________________________________ Calculations ________________________________________________________//

        // Loan Term Calculation

        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PMT = Double.parseDouble(paymentTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PV = Double.parseDouble(presentValuetTextField.getText());
                double FV = Double.parseDouble(futureValueTextField.getText());
                double Time = Math.log(((((IR * FV) / 12) + PMT) / (((PV * IR) / 12) + PMT))) / (12 * Math.log(1 + (IR/12)));
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
                    double PMT = Double.parseDouble(paymentTextField.getText());
                    double FV = (PV * Math.pow((1 + (IR / 12)), (12 * Time))) + (PMT * ((Math.pow((1 + (IR / 12)), (12 * Time)) - 1) / (IR/12)));
                    String result = String.format("%.2f",FV);
                    futureValueTextField.setText(result);

            }
        });

        // Present Value Calculation

        btnCalPresentValue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                    double PMT = Double.parseDouble(paymentTextField.getText());
                    double Time = Double.parseDouble(loanTermTextField.getText());
                    double IR = Double.parseDouble(interestRateTextField.getText());
                    double FV = Double.parseDouble(futureValueTextField.getText());
                    double PV = (FV - (PMT * ((Math.pow((1 + (IR/12)), 12 * Time) - 1) / (IR/12))))/ (Math.pow((1 + (IR/12)), 12 * Time));
                    String result = String.format("%.2f",PV);
                    presentValuetTextField.setText(result);

            }
        });

        // Payment Calculation

        btnPayment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double P = Double.parseDouble(presentValuetTextField.getText());
                double R = Double.parseDouble(interestRateTextField.getText());
                double FV = Double.parseDouble(futureValueTextField.getText());
                double T = Double.parseDouble(loanTermTextField.getText());
                double PMT = (FV - (P * Math.pow((1 + (R / 12)), (12 * T)))) / ((Math.pow((1 + (R / 12)), (12 * T)) - 1) / (R / 12));
                String result = String.format("%.2f",PMT);
                paymentTextField.setText(result);

            }
        });

    }

}
