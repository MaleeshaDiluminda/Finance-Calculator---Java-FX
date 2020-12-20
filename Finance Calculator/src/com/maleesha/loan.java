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

public class loan  {

    public static void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Menu");
        AnchorPane pane =  new AnchorPane();

        //______________________________________________________ Labels ______________________________________________________//

        // Topic - Label

        Label textTopic = new Label("Loan Calculator");
        textTopic.setLayoutX(200);
        textTopic.setLayoutY(60);
        textTopic.setStyle("-fx-font-size:25; -fx-text-fill: white");

        // Payment - Label

        Label labelPayment = new Label("Payment");
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

        //______________________________________________________ Text Fields ______________________________________________________//

        // homePrice - TextField

        TextField paymentTextField = new TextField();
        paymentTextField.setLayoutX(200);
        paymentTextField.setLayoutY(130);
        paymentTextField.setPrefSize(200,30);

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

        //______________________________________________________ Interface Buttons ________________________________________________//

        // CALCULATE Button - Loan Term

        Button btnCalculate = new Button("Calculate");
        btnCalculate.setLayoutX(405);
        btnCalculate.setLayoutY(230);
        btnCalculate.setPrefSize(105,15);
        btnCalculate.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

        // Calculate Button - Future Value

        Button btnCalPayment = new Button("Calculate");
        btnCalPayment.setLayoutX(405);
        btnCalPayment.setLayoutY(130);
        btnCalPayment.setPrefSize(105,15);
        btnCalPayment.setStyle("-fx-font-size:14;-fx-background-color: #3bc7ff");

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

        //_____________________________________________________ Set Mouse Clicks ________________________________________________//

        paymentTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.callKeypad(paymentTextField,pane);
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

        // Clear All Button - linked text fields

        btnClearAll.setOnAction(event -> {
            loanTermTextField.clear();
            paymentTextField.clear();
            presentValuetTextField.clear();
            interestRateTextField.clear();

        });

        pane.setStyle("-fx-background-image: url('darkblue.jpg')");
        pane.getChildren().addAll(textTopic,labelPayment,labelPresentValue,labelloanTerm,labelinterestRate,btnClearAll,btnCalculate);
        pane.getChildren().addAll(paymentTextField,presentValuetTextField,loanTermTextField,interestRateTextField);
        pane.getChildren().addAll(btnBackButton,btnCalPayment,btnCalPresentValue);
        primaryStage.setScene(new Scene(pane,800,500));
        primaryStage.setResizable(false);        // for Fixed Size
        primaryStage.show();

        //______________________________________________________ Calculations ______________________________________________________//

        // Time Calculation

        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PMT = Double.parseDouble(paymentTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PV = Double.parseDouble(presentValuetTextField.getText());
                double Time = Math.log((PMT / IR) / ((PMT / IR) - PV)) / Math.log(1 + IR);
                String result = String.format("%.2f",Time);
                loanTermTextField.setText(result);

            }
        });

        // Payment Calculation

        btnCalPayment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PV = Double.parseDouble(presentValuetTextField.getText());
                double Time = Double.parseDouble(loanTermTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PMT = (PV * IR) / (1 - (1 / Math.pow((1 + IR), Time)));
                String result = String.format("%.2f",PMT);
                paymentTextField.setText(result);

            }
        });

        // Present Value Calculatio

        btnCalPresentValue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double PMT = Double.parseDouble(paymentTextField.getText());
                double Time = Double.parseDouble(loanTermTextField.getText());
                double IR = Double.parseDouble(interestRateTextField.getText());
                double PV = (PMT / IR) * (1 - (1 / Math.pow((1 + IR), Time)));
                String result = String.format("%.2f",PV);
                presentValuetTextField.setText(result);

            }
        });

    }

}
