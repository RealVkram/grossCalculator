package chapter3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String grade = scanner.next();

        String message;

    switch (grade) {
        case "A":
            message = "Excellent job well done";
            break;
        case "B":
            message = "Great job, well done";
            break;
        case "C":
            message = "Good job and well done";
            break;
        case "D":
            message = "not too good job done, you can do better";
            break;
        case "F":
            message = "poor job";
            break;
        default:
            message = "invalid grade";

        }
        System.out.println(message);
    }
}
