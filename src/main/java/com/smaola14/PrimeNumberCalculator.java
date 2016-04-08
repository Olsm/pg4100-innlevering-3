package com.smaola14;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeNumberCalculator {

    public String isPrimeToString(String number) {
        if (number == null) return "";
        if (number.isEmpty()) return "Empty input, please enter a number.";

        try {
            if (isPrimeNumber(number))
                return number + " is prime";

        } catch (NumberFormatException e) {
            return "Invalid input, please enter a number between "
                    + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE;
        }

        return number + " is not prime";
    }

    public boolean isPrimeNumber(String s) {
        int n = Integer.parseInt(s);
        return isPrime(n);
    }
}
