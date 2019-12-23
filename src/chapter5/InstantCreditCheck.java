package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        double customerSalary = getSalary();
        int customerCreditScore = getCreditScore();
        scanner.close();

        //check if user is qualified
        boolean qualified = isCustomerQualified(customerSalary, customerCreditScore);

        //display result
        displayResult(qualified);

    }

    public static double getSalary() {
       System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isCustomerQualified(double salary, int creditScore ){
        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }
    public static void displayResult(boolean isQualified){
        if(isQualified){
            System.out.println("Congratulations, You qualify for the loan");
        }
        else{
            System.out.println("Sorry, You are not eligible for the loan");
        }
    }
}
