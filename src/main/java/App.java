/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.print("Press F to convert from Celsius to Fahrenheit. ");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        System.out.println("Your choice: "+ choice);

        String temp = "nothing";
        String oppTemp = "nothing";

        if(choice.toUpperCase().equals("F"))
        {
            temp = "Celsius";
            oppTemp = "Farenheit";
        }
        else if(choice.toUpperCase().equals("C"))
        {
            temp = "Farenheit";
            oppTemp = "Celsius";
        }

        System.out.print("Please enter the temperature in " + temp + ": ");

        int ogDegree = scan.nextInt();
        int newDegree = 0;

        if(choice.toUpperCase().equals("F"))
        {
            newDegree = (ogDegree * 9 / 5) + 32;
        }
        else if(choice.toUpperCase().equals("C"))
        {
            newDegree = (ogDegree - 32) * 5 / 9;
        }

        System.out.print("The temperature in "+ oppTemp + " is "+ newDegree + ".");

        scan.close();
    }
}