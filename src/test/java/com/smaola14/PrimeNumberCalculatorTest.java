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
    public void testIsPrimeNumberToStringPrime() {
        assertEquals("2 is prime", pnc.isPrimeToString("2"));
    }

    @Test
    public void testIsPrimeNumberToStringNotPrime() {
        assertEquals("1 is not prime", pnc.isPrimeToString("1"));
    }

    @Test
    public void testIsPrimeNumberToStringInvalid() {
        assertEquals("Invalid input, you must enter a number!", pnc.isPrimeToString("test"));
    }

    @Test
    public void testIsPrimeNumberToStringNull() {
        assertEquals("", pnc.isPrimeToString(null));
    }

    @Test
    public void testIsPrimeNumberToStringEmpty() {
        assertEquals("Empty input, please enter a number!", pnc.isPrimeToString(""));
    }


    @Test
    public void testIsPrimeNumber() {
        assertTrue(pnc.isPrimeNumber("2"));
    }

    @Test
    public void testIsNotPrimeNumber() {
        assertFalse(pnc.isPrimeNumber("1"));
        assertFalse(pnc.isPrimeNumber("4"));
    }

    @Test
    public void testStringIsPrimeNumber() {
        assertTrue(pnc.isPrimeNumber("5"));
    }

    @Test
    public void testIllegalArgument() {
        Throwable exception = exceptionThrownBy(() -> pnc.isPrimeNumber("test"));
        assertEquals(NumberFormatException.class, exception.getClass());
    }
}