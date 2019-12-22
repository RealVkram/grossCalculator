package chapter4;

/*
Each store employee makes N200 per hour. write a program that allows the employee to enter the number of hours
worked for the week. Do not allow overtime
 */

import java.util.Scanner;

public class GrossPayValidation {
    public static void main(String args[]) {
        System.out.println("This program calculates the gross earned by am employee in a week. kindly answer " +
                "appropriately");
        //initialize the known value
        int ratePerHour = 200;
        int maxHourPerWeek = 40;
        int minHourPerWeek = 1;

        //get the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        // validated the input against no overtime
        while(hoursWorked > maxHourPerWeek || hoursWorked < minHourPerWeek) {
            System.out.println("You entered invalid hours worked, you are expected to work between" +
                    " 1 - 40hours/ per week. please try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate the gross
        double gross = ratePerHour * hoursWorked;
        System.out.println("The gross for the week: N" + gross);
    }
}
