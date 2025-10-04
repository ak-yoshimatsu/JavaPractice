package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService(new Calculator());

    @Test
    void testCalculateAdd() {
        assertEquals(7.0, service.calculate(3, 4, "+"));
    }

    @Test
    void testCalculateSubtract() {
        assertEquals(1.0, service.calculate(5, 4, "-"));
    }

    @Test
    void testCalculateMultiply() {
        assertEquals(20.0, service.calculate(5, 4, "*"));
    }

    @Test
    void testCalculateDivide() {
        assertEquals(2.5, service.calculate(5, 2, "/"));
    }

    @Test
    void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> service.calculate(5, 2, "%"));
    }
}
