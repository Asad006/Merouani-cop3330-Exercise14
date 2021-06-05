package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        double amount;
        String state;
        System.out.println("What is the order amount?");
        amount = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the state?");
        state = scanner.nextLine();

        app.process(amount, state);
    }

    private void process(double amount, String state) {
        double total = amount;
        if (state.equals("WI")) {
            System.out.printf("The subtotal is $%.2f\n", amount);

            System.out.printf("The tax is $%.2f.\n", amount * 0.055);
            total += amount * 0.055;
        }
        System.out.printf("The total is $%.2f.", total);

    }
}
