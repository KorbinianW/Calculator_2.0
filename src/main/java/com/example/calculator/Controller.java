package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    char operator;
    int result;
    StringBuilder calculation = new StringBuilder();
    int res1;
    int res2;

    @FXML
    private Label Display;


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
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '+';
        calculation.delete(0, calculation.length());
    }

    @FXML
    protected void onMinusClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '-';
        calculation.delete(0, calculation.length());
    }

    @FXML
    protected void onMultipleClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '*';
        calculation.delete(0, calculation.length());
    }

    @FXML
    protected void onDivideClicked() {
        res1 = Integer.parseInt(String.valueOf(calculation));
        operator = '/';
        calculation.delete(0, calculation.length());
    }

    @FXML
    protected void onDeleteClicked() throws StringIndexOutOfBoundsException {
        try {
            calculation.deleteCharAt(calculation.length() - 1);
            Display.setText(String.valueOf(calculation));
        }
        catch (StringIndexOutOfBoundsException e) {

        }
    }

    @FXML
    protected void onEqualsClicked() {
        res2 = Integer.parseInt(String.valueOf(calculation));
        switch (operator) {
            case '+':
                result = Math.addExact(res1, res2);
                Display.setText(String.valueOf(result));
                break;

            case '-':
                result = Math.subtractExact(res1, res2);
                Display.setText(String.valueOf(result));
                break;

            case '*':
                result = Math.multiplyExact(res1, res2);
                Display.setText(String.valueOf(result));
                break;

            case '/':
                result = Math.floorDiv(res1, res2);
                Display.setText(String.valueOf(result));
                break;
        }

    }

}