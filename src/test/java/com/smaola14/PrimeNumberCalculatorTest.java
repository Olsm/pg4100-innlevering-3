package com.smaola14;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.github.stefanbirkner.fishbowl.Fishbowl.*;

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

    @Test
    public void testIllegalArgument() {
        Throwable exception = exceptionThrownBy(() -> pnc.isPrimeNumber("one"));
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }
}