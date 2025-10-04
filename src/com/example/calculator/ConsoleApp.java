package com.example.calculator;

public class ConsoleApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorService service = new CalculatorService(calculator);
        InputHandler inputHandler = new InputHandler();

        double a = inputHandler.getNumber("1つ目の数値を入力してください: ");
        String operator = inputHandler.getOperator();
        double b = inputHandler.getNumber("2つ目の数値を入力してください: ");

        double result = service.calculate(a, b, operator);
        System.out.println("結果: " + result);
    }
}
