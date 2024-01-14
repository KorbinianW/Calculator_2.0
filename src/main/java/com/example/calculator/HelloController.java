package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {

    String calculation = "";
    @FXML
    private Label Display;
    @FXML
    private Button N0;
    @FXML
    private Button N1;
    @FXML
    private Button N2;
    @FXML
    private Button N3;
    @FXML
    private Button N4;
    @FXML
    private Button N5;
    @FXML
    private Button N6;
    @FXML
    private Button N7;
    @FXML
    private Button N8;
    @FXML
    private Button N9;
    @FXML
    private Button Delete;


    @FXML
    protected void onN0Clicked() {
        calculation = calculation + "0";
        Display.setText(calculation);
    }

    @FXML
    protected void onN1Clicked() {
        calculation = calculation + "1";
        Display.setText(calculation);
    }
    @FXML
    protected void onN2Clicked() {
        calculation = calculation + "2";
        Display.setText(calculation);
    }
    @FXML
    protected void onN3Clicked() {
        calculation = calculation + "3";
        Display.setText(calculation);
    }
    @FXML
    protected void onN4Clicked() {
        calculation = calculation + "4";
        Display.setText(calculation);
    }
    @FXML
    protected void onN5Clicked() {
        calculation = calculation + "5";
        Display.setText(calculation);
    }
    @FXML
    protected void onN6Clicked() {
        calculation = calculation + "6";
        Display.setText(calculation);
    }
    @FXML
    protected void onN7Clicked() {
        calculation = calculation + "7";
        Display.setText(calculation);
    }
    @FXML
    protected void onN8Clicked() {
        calculation = calculation + "8";
        Display.setText(calculation);
    }
    @FXML
    protected void onN9Clicked() {
        calculation = calculation + "9";
        Display.setText(calculation);
    }
    @FXML
    protected void onPlusClicked() {
        calculation = calculation + "+";
        Display.setText(calculation);
    }
    @FXML
    protected void onMinusClicked() {
        calculation = calculation + "-";
        Display.setText(calculation);
    }
    @FXML
    protected void onMultipleClicked() {
        calculation = calculation + "*";
        Display.setText(calculation);
    }
    @FXML
    protected void onDivideClicked() {
        calculation = calculation + "/";
        Display.setText(calculation);
    }
    @FXML
    protected void onDeleteClicked() {
        char[] step = calculation.toCharArray();
        char i = calculation.charAt(calculation.length() - 1);
        calculation = calculation.replace(i, ' ').trim();
        Display.setText(calculation);

    }
    @FXML
    protected void onEqualsClicked() {
        char[] result = calculation.toCharArray();
        int i = 0;
        while (i <= calculation.length()){

        };
    }

}