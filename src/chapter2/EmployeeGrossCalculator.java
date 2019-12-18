package chapter2;

import java.util.Scanner;

public class EmployeeGrossCalculator {
    public static void main(String args[]){
         //1. get the number of hours worked
        System.out.println("Enter the number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//        2. get the hourly rate
        System.out.println("Enter the hourly rate of the employee");
        double rate = scanner.nextDouble();
        scanner.close();
       // 3. calculate the gross pay
        double grossPay = hours * rate;
//4. display the result
        System.out.println("the gross pay is N" + grossPay);
    }
}
