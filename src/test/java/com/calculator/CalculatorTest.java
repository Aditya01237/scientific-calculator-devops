package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(10), calculator.naturalLog(10));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2,3));
    }
}