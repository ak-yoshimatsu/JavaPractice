package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComp {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println("年月日を入力（yyyy/MM/dd）：");

                    String input = scan.nextLine();

                    System.out.println(input);
                    System.out.println(input.equals("exit"));

                    if (input.equals("exit")) {
                        System.out.println("終了します。");
                        break;
                    }

                    LocalDate date = DateTimeFormatter.ofPattern("yyyy/MM/dd").parse(input, LocalDate::from);

                    System.out.println("入力された値：" + date);

                    System.out.println("-------");
                    System.out.println("'exit' を入力すると終了します。");

                } catch (DateTimeParseException e) {
                    System.out.println("もう一度入力してください。");
                    System.out.println("-------");
                    System.out.println("'exit' を入力すると終了します。");
                }
            }
        }
    }
}