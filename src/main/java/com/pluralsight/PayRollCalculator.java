package com.pluralsight;

import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name (Query 1)
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt the user for hours worked (Query 2)
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Prompt the user for pay rate (Query 3)
        System.out.print("Enter pay rate per hour: ");
        double payRate = input.nextDouble();

        // Calculate gross pay (Calculator)
        double grossPay = hoursWorked * payRate;

        // Display the employee's name and gross pay
        System.out.println("Employee: " + name);
        System.out.println("Gross Pay: $" + grossPay);
    }

}
