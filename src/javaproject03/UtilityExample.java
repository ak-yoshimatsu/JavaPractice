package javaproject03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilityExample {
    public static void main(String[] args) {
        // 日付処理
        System.out.println("=== 日付処理 ===");
        LocalDate today = LocalDate.now();
        System.out.println("今日の日付: " + today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("明日の日付: " + tomorrow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println("フォーマットした日付: " + today.format(formatter));

        // 日時処理
        System.out.println("\n=== 日時処理 ===");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("現在の日時: " + now);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("現在時刻: " + now.format(timeFormatter));

        // 数値計算
        System.out.println("\n=== 数値計算 ===");
        System.out.println("円周率: " + Math.PI);
        System.out.println("2の平方根: " + Math.sqrt(2));
        System.out.println("3の2乗: " + Math.pow(3, 2));

        // 乱数生成
        System.out.println("\n=== 乱数生成 ===");
        Random random = new Random();
        System.out.println("0から9までの乱数: " + random.nextInt(10));
        System.out.println("0から1までの乱数: " + random.nextDouble());
    }
}