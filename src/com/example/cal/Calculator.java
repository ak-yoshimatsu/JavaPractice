package com.example.cal;

public class Calculator {

    /**
     * 2つの整数を足し算します。
     * 
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return aとbの合計
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 2つの整数を引き算します。
     * 
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return aからbを引いた結果
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 5);
        System.out.println("10 + 5 = " + sum); // 15
        int diff = calculator.subtract(10, 5);
        System.out.println("10 - 5 = " + diff); // 5
    }
}