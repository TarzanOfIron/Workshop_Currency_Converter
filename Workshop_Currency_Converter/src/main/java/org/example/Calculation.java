package org.example;

import java.math.BigDecimal;

public class Calculation {

    BigDecimal exchangeRateSEKtoUSD = new BigDecimal("0.09");
    BigDecimal exchangeRateSEKtoEUR = new BigDecimal("0.087");

    public  BigDecimal calculate(int option, BigDecimal amount) {
        return switch (option) {
            case 1 -> exchangeRateSEKtoUSD.multiply(amount);
            case 2 -> exchangeRateSEKtoUSD.divide(amount);
            case 3 -> exchangeRateSEKtoEUR.multiply(amount);
            case 4 -> exchangeRateSEKtoEUR.divide(amount);
            default -> throw new IllegalArgumentException("Invalid option");
        };
    }
}
