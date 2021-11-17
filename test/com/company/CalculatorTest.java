package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int result = new Calculator().sum(20,10);
        assertEquals(30, result);
    }
}