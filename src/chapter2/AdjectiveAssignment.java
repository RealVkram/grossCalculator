package chapter2;

import java.util.Scanner;

public class AdjectiveAssignment {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kindly enter a good adjective ");
        String adjective = scanner.next();

        // enter a holiday season
        System.out.println("enter the holiday season you are now? ");
        String holidaySeason = scanner.next();

        // collect the amount of coffee taken a day.
        System.out.println("amount of coffee taken per day? ");
        int coffeeAmount = scanner.nextInt();
        scanner.close();

        //print out the sentence.
        System.out.println("On a " + adjective + " " + holidaySeason + " day, I drink a minimum of " + coffeeAmount + " cups of coffee");

    }
}
