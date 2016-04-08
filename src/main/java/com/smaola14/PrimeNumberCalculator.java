package com.smaola14;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeNumberCalculator {

    public boolean isPrimeNumber(int n) {
        return isPrime(n);
    }

    public boolean isPrimeNumber(String s) {
        int n = Integer.parseInt(s);
        return isPrimeNumber(n);
    }
}
