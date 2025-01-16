package org.example;

import java.math.BigDecimal;

public class Calculation {

    BigDecimal exchangeRateSEKtoUSD = new BigDecimal("0.09");
    BigDecimal exchangeRateSEKtoEUR = new BigDecimal("0.087");

    public  BigDecimal calculate(int option, BigDecimal amount) {
        return switch (option) {
            case 1 -> amount.multiply(exchangeRateSEKtoUSD);
            case 2 -> amount.divide(exchangeRateSEKtoUSD);
            case 3 -> amount.multiply(exchangeRateSEKtoEUR);
            case 4 -> amount.divide(exchangeRateSEKtoEUR);
            default -> throw new IllegalArgumentException("Invalid option");
        };
    }
}
