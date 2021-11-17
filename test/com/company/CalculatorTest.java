package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum_withPositiveNumbers() {
        int result = new Calculator().sum(20,10);
        assertEquals(30, result);
    }

    @Test
    void testSum_withNegativeNumbers() {
        int result = new Calculator().sum(-2,-3);
        assertEquals(-5, result);
    }

    @Test
    void testSum_withPositiveNegativeNumber() {
        int result = new Calculator().sum(20,-10);
        assertEquals(10, result);
    }
    @Test
    void testSum_withNegativePositiveNumber() {
        int result = new Calculator().sum(-20,10);
        assertEquals(-10, result);
    }
}