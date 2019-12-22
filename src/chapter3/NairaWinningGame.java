package chapter3;

import java.util.Scanner;

public class NairaWinningGame {
    public static void main(String args[]) {

//        You'll ask them how many pennies would you like?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        //amount of nickels
        System.out.print("How many nickels would you like? ");
        double numOfNickels = scanner.nextDouble();
        double nickelToDollar = numOfNickels * 0.5;

        //amount of dimes
        System.out.print("How many dimes would you like? ");
        double numOfDimes = scanner.nextDouble();
        double dimesToDollar = numOfDimes * 0.1;

        //amount of pennies
        System.out.print("How many pennies would you like? ");
        double numOfPennies = scanner.nextDouble();
        double pennyToDollar = numOfPennies * 0.01;

        //amount of quarters
        System.out.print("How many quarters would you like? ");
        double numOfQuarters = scanner.nextDouble();
        double quarterToDollar = numOfQuarters * 0.25;
        scanner.close();

        double winningNumber = 1.0;
        double predictedAmount = nickelToDollar + dimesToDollar + pennyToDollar + quarterToDollar;


        if (predictedAmount > winningNumber) {
            double amountAbove = predictedAmount - winningNumber;
            System.out.println("I am sorry, you did not win this time, you were N" + amountAbove + " over");
        }
        else if (predictedAmount < winningNumber) {
            double amountBelow = winningNumber - predictedAmount;
            System.out.println("I am sorry, you did not win this time, you were N" + amountBelow + " under");
        }
        else {
            System.out.println("Congrats, you won");
        }
    }
}
