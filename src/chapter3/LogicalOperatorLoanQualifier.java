package chapter3;

import java.util.Scanner;

/*
***to qualify, you must be making about $30,000 / year
* must have worked about 2 or more years
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {
        //initialize the known
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // get the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        //get the number of years worked
        System.out.print("How many years have you been in your recent employment ");
        double yearsEmployed = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary && yearsEmployed >= requiredYearsEmployed) {
            System.out.println("Congrats, You qualify for the loan");
            }
        else {
            System.out.println("I am sorry, You need to be in your recent employment for about " + requiredYearsEmployed + " or more years " +
            "and make about N" + requiredSalary + " or more in order to qualify");;
        }

    }
}
