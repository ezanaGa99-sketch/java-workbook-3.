
package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Store 10 famous quotes in an array
        String[] quotes = {
                "Believe you can and you're halfway there.",
                "The only way to do great work is to love what you do.",
                "Never give up on your dreams.",
                "Success is not final, failure is not fatal.",
                "It always seems impossible until it's done.",
                "The future depends on what you do today.",
                "Dream big and dare to fail.",
                "Every day is a second chance.",
                "Stay hungry, stay foolish.",
                "The journey of a thousand miles begins with one step."
        };

        // Ask the user to select a quote
        System.out.println("Welcome to Famous Quotes!");
        System.out.print("Select a number between 1 and 10: ");

        try {
            int choice = scanner.nextInt();

            // Convert user choice to array index
            int index = choice - 1;

            // Display the selected quote
            System.out.println("Your quote:");
            System.out.println(quotes[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handle numbers outside the array
            System.out.println("Invalid number! Please choose 1 to 10.");

        } catch (java.util.InputMismatchException e) {

            // Handle input that is not a number
            System.out.println("Invalid input! Please enter a number.");

        }

        scanner.close();
    }
}

