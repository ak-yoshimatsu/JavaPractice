package com.example.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        // 各テストの前に、新しいCalculatorインスタンスを作成
        calculator = new Calculator();
    }

    @Test
    @DisplayName("足し算が正しく行われること")
    void testAdd() {
        // 期待値: 1 + 2 = 3
        int expected = 3;
        // 実際の値
        int actual = calculator.add(1, 2);

        // 期待値と実際の値が等しいか検証
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("引き算が正しく行われること")
    void testSubtract() {
        // 期待値: 5 - 3 = 2
        int expected = 2;
        // 実際の値
        int actual = calculator.subtract(5, 3);

        // 期待値と実際の値が等しいか検証
        assertEquals(expected, actual);
    }
}