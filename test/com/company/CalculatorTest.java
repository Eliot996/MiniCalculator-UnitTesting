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

    @Test
    void testSum_WithTooLargeIntegers() {
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new Calculator().sum(101,10));
    }

    @Test
    void testRandom(){
        // Arrange
        Calculator calculator = new Calculator();

        for (int i = 0; i < 1000000000; i++) { // Act
            int result = calculator.random();

            // Assert
            assertTrue(result >= 1 && result <= 6);
        }
    }
}