package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {

        // get the test results
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();
        scanner.close();

        //check the result to determine the grade
        char grade;
        if (score < 60) {
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your test grade is " + grade);
    }

}
