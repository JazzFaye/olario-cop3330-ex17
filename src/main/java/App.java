/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner; //using class scanner

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner to obtain
        double r = 0;   //declaration of variable
        System.out.println("Enter a 1 if you are a male or 2 if you are female: ");
        //Using try..catch to prevent abnormal termination of the program.
        try {
            int gender = Integer.parseInt(input.nextLine());    //Obtain user input
            //Using if-else statement
            if (gender == 1) {
                r = 0.73;
            } else if (gender == 2) {
                r = 0.66;
            } else{
                //Display this message if user input is neither 1 or 2.
                System.out.println("Invalid input. Please enter either 1 or 2 only.");
                System.exit(1); //terminates the program
            }
            System.out.println("How many ounces of alcohol did you have? ");
            double A = Double.parseDouble(input.nextLine());    //Obtain user input

            System.out.println("What is your weight in pounds? ");
            double W = Double.parseDouble(input.nextLine());    //Obtain user input

            System.out.println("How many hours has it been since your last drink? ");
            double H = Double.parseDouble(input.nextLine());    //Obtain user input

            double BAC = (A * (5.14 / W) * r) - (0.015 * H);
            System.out.printf("\nYour BAC is %.6f", BAC);   //Obtain user input
            //Using if-else statement
            if (BAC >= 0.08) {
                System.out.println("\nIt is not legal for you to drive.");
            } else {
                System.out.println("\nIs it legal for you to drive");
            }
        } catch (NumberFormatException e) {
            //Display the following if user inputs a non numerical value
            System.out.println("Invalid input. Please enter numerical values only");
        }
    }
}
