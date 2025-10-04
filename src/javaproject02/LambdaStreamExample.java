package javaproject02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamExample {
    public static void main(String[] args) {
        // ラムダ式の例
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grapes", "melon");

        // 従来のfor文
        System.out.println("=== 従来のfor文 ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ラムダ式を使用したforEach
        System.out.println("\n=== ラムダ式を使用したforEach ===");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Stream APIの使用
        System.out.println("\n=== Stream APIの例 ===");

        // フィルタリング
        System.out.println("文字列の長さが5文字より大きい果物の名前:");
        fruits.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);

        // 変換
        System.out.println("\n果物の名前を大文字に変換:");
        List<String> upperFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperFruits);

        // 並び替え
        System.out.println("\n果物を名前の長さで並び替え:");
        fruits.stream().sorted((f1, f2) -> Integer.compare(f1.length(), f2.length())).forEach(System.out::println);

        // 集計
        System.out.println("\n果物の名前の平均文字数:");
        double averageLength = fruits.stream().mapToInt(String::length).average().orElse(0.0);
        System.out.println(averageLength);
    }
}