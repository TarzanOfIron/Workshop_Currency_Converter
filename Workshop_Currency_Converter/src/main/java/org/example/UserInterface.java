package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {

    public static void startApp() {
        printMenu();
        generateResultFromInput();
    }

    private static void generateResultFromInput() {
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculate(exchangeOption(), amountToExchange()) + " at " + dateTime());
    }

    public static void printMenu() {
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EUR");
        System.out.println("4. Convert EUR to SEK");
        System.out.println("0. Exit ");
    }

    public static int exchangeOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter option: ");
        int userInput = sc.nextInt();
        while (true) {
            if (userInput < 0 || userInput > 5) {
                System.out.print("Not an option, please enter a menu point");
                continue;
            }
            break;
        }
        return userInput;
    }

    public static BigDecimal amountToExchange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        BigDecimal userInput = sc.nextBigDecimal();
        while (true) {
            if (userInput.compareTo(new BigDecimal("0")) <= 0) {
                System.out.print("Amount less than 0, try again: ");
                continue;
            }
            break;
        }
        return userInput;
    }

    public static String dateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd - HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(dateTimeFormatter);
    }


}
