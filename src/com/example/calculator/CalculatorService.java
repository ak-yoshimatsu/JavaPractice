package com.example.calculator;

public class CalculatorService {

    private final Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(double a, double b, String operator) {
        switch (operator) {
        case "+":
            return calculator.add(a, b);
        case "-":
            return calculator.subtract(a, b);
        case "*":
            return calculator.multiply(a, b);
        case "/":
            return calculator.divide(a, b);
        default:
            throw new IllegalArgumentException("不正な演算子です: " + operator);
        }
    }
}
