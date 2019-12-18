package chapter3;

/*all salespeople get a payment of $1000 a week
 Salespeople who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]) {
        //initialize the given values
        int salary = 1000;
        int bonus = 250;
        int salesTarget = 10;

        //get the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name = scanner.next();

        System.out.print("How many sales did " + name + " made this week? ");
        int sales = scanner.nextInt();
        scanner.close();

        //check the sales if it exceeds the 10
        if (sales > salesTarget) {
            salary += bonus;
        }
        System.out.println(name + " made N" + salary + " this month");
    }
}
