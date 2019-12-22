package chapter4;

import java.util.Scanner;

public class ExamScores {
    public static void main(String args[]){
            int numberOfStudents = 10;
            int numberOfExams = 4;
            Scanner scanner = new Scanner(System.in);


            for(int i = 0; i < numberOfStudents; ++i) {
                System.out.println("Compute the exam score for student #" + (i + 1));
                double total = 0.0D;

                for(int j = 0; j < numberOfExams; ++j) {
                    System.out.println("Enter the exam scores for exam #" + (j + 1));
                    double examScore = scanner.nextDouble();
                    total += examScore;
                }

                double averageExamScore = total / (double)numberOfExams;
                System.out.println("The exam average for student #" + (i + 1) + " is " + averageExamScore);
                //System.out.println("Compute the exam score for student #" + (i + 2));
            }

            scanner.close();
    }
}
