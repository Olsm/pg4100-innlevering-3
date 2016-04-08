package com.smaola14;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeNumberCalculator {

    public String isPrimeToString(String number) {
        if (number == null) return "";
        if (number.isEmpty()) return "Empty input, please enter a number.";

        try {
            if (Long.parseLong(number) > 2147483647)
                return "Number must be less than 2147483648!";

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
