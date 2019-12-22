package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]) {
        System.out.println("This program allows you to sum maximum of two numbers");
        Scanner scanner = new Scanner(System.in);
        Boolean anotherTry;

        do {
            System.out.println("enter the first number to add");
            double firstNumber = scanner.nextDouble();

            System.out.println("enter the second number to add");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);

            System.out.println("would you like to do another calculation: True or False" );
            anotherTry = scanner.nextBoolean();
        } while(anotherTry);

        scanner.close();
    }
}
