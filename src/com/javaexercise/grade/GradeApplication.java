package com.javaexercise.grade;

public class GradeApplication {

    public static void main(String[] args) {
        System.out.println("=== 成績判定アプリケーション ===");

        // 正常系のテスト
        System.out.println("\n【正常系テスト】");
        GradeCalculator calculator1 = new GradeCalculator(80, 90, 70, 60, 85);
        int total1 = calculator1.calculateTotal();
        Grade grade1 = calculator1.calculateGrade();
        System.out.println("合計点: " + total1); // 385
        System.out.println("成績: " + grade1.getCode() ); // C 

        // 赤点のテスト
        System.out.println("\n【赤点テスト】");
        GradeCalculator calculator2 = new GradeCalculator(100, 95, 10, 90, 100);
        int total2 = calculator2.calculateTotal();
        Grade grade2 = calculator2.calculateGrade();
        System.out.println("合計点: " + total2); // 395
        System.out.println("成績: " + grade2.getCode() ); // F 

        // A判定のテスト
        System.out.println("\n【A判定テスト】");
        GradeCalculator calculator3 = new GradeCalculator(90, 90, 90, 90, 90);
        int total3 = calculator3.calculateTotal();
        Grade grade3 = calculator3.calculateGrade();
        System.out.println("合計点: " + total3); // 450
        System.out.println("成績: " + grade3.getCode() ); // A

        System.out.println("\n=== アプリケーション終了 ===");
    }

}
