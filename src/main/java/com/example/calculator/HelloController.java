package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.text.NumberFormat;
import java.text.ParseException;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class HelloController {

    char operator;
    int result;
    StringBuilder calculation = new StringBuilder();
    int res1;
    int res2;


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
        calculation.append(0);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN1Clicked() {
        calculation.append(1);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN2Clicked() {
        calculation.append(2);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN3Clicked() {
        calculation.append(3);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN4Clicked() {
        calculation.append(4);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN5Clicked() {
        calculation.append(5);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN6Clicked() {
        calculation.append(6);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN7Clicked() {
        calculation.append(7);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN8Clicked() {
        calculation.append(8);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onN9Clicked() {
        calculation.append(9);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onPlusClicked() {
        res1 = parseInt(String.valueOf(calculation));
        operator = '+';
        Display.setText("");
        calculation.delete(0, calculation.length());
    }

    @FXML
    protected void onMinusClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '-';
        //Display.setText("");
        calculation.replace(0, calculation.length()-1, "");
    }

    @FXML
    protected void onMultipleClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '*';
        //Display.setText("");
        calculation = null;
    }

    @FXML
    protected void onDivideClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '/';
        //Display.setText("");
        calculation.delete(0, calculation.length()-1);
    }

    @FXML
    protected void onDeleteClicked() {
        /*char[] step = calculation.toCharArray();
        char i = calculation.charAt(calculation.length() - 1);
        calculation = calculation.replace(i, ' ').trim();
        */
        calculation.deleteCharAt(calculation.length()-1);
        Display.setText(String.valueOf(calculation));
    }

    @FXML
    protected void onEqualsClicked() {
        res2 = parseInt(Display.getText());
        switch (operator) {
            case '+':
                result = res1 + res2;
                Display.setText(String.valueOf(result));

            case '-':
                result = parseInt(String.valueOf(calculation)) - parseInt(Display.getText());
                Display.setText(String.valueOf(result));

            case '*':
                result = valueOf(String.valueOf(calculation)) * valueOf(Display.getText());
                Display.setText(String.valueOf(result));

            case '/':
                result = valueOf(String.valueOf(calculation)) / valueOf(Display.getText());
                Display.setText(String.valueOf(result));
        }

    }

}