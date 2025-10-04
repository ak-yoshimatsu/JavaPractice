package com.example.calculator;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner = new Scanner(System.in);

    public double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("数値を入力してください。");
            scanner.next(); // 無効な入力をスキップ
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    public String getOperator() {
        System.out.print("演算子を入力してください (+, -, *, /): ");
        String op = scanner.next();
        if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            throw new IllegalArgumentException("不正な演算子です: " + op);
        }
        return op;
    }
}
