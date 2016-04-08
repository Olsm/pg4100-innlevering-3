package com.smaola14;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeNumberCalculator {

    public String isPrimeToString(String number) {
        try {
            if (isPrimeNumber(number))
                return number + " is prime";
        } catch (NumberFormatException e) {
            return "Invalid input, you must enter a number!";
        }
        return number + " is not prime";
    }

    public boolean isPrimeNumber(String s) {
        int n = Integer.parseInt(s);
        return isPrime(n);
    }
}
