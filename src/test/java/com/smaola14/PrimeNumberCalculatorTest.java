package com.smaola14;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberCalculatorTest {
    private static PrimeNumberCalculator pnc;

    @BeforeClass
    public static void setUp() {
        pnc = new PrimeNumberCalculator();
    }

    @Test
    public void testIsPrimeNumber() {
        assertTrue(pnc.isPrimeNumber(2));
    }

    @Test
    public void testIsNotPrimeNumber() {
        assertFalse(pnc.isPrimeNumber(1));
        assertFalse(pnc.isPrimeNumber(4));
    }

    // Add tests for invalid input
}