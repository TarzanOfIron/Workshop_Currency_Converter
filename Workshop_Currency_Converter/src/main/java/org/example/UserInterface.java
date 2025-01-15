package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {

    public static void startApp() {
        printMenu();
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculate(exchangeOption(),amountToExchange()) + " at " + dateTime());
    }

    public static void printMenu() {
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EUR");
        System.out.println("4. Convert EUR to SEK");
        System.out.println("0. Exit ");
    }

    public static int exchangeOption () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter option: ");
        return sc.nextInt();
    }

    public static BigDecimal amountToExchange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        return sc.nextBigDecimal();
    }

    public static String dateTime () {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd - HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(dateTimeFormatter);
    }
}
