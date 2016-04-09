package com.smaola14;

import static org.apache.commons.math3.primes.Primes.isPrime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumberCalculator {

    private static final Logger logger = LogManager.getLogger(PrimeNumberCalculator.class);

    public String isPrimeToString(String number) {
        if (number == null) return "";
        if (number.isEmpty()) return "Empty input, please enter a number.";

        logger.info("Calculate number: " + number);

        try {
            if (isPrimeNumber(number))
                return number + " is prime";

        } catch (NumberFormatException e) {
            logger.error("Invalid input!", e);
            return "Invalid input, please enter a number between "
                    + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE;
        }

        return number + " is not prime";
    }

    public boolean isPrimeNumber(String s) throws NumberFormatException {
        int n = Integer.parseInt(s);
        return isPrime(n);
    }
}

