package chapter5;

import java.util.Scanner;

public class Greetings {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //get the name of the greeter
        String userName = getName();
        scanner.close();

        //say hello to the greeter
        greetUser(userName);
    }

    public static String getName(){
        System.out.println("Kindly enter your name");
        String name = scanner.next();
        return name;
    }

    public static void greetUser(String names) {
        System.out.println("Hello there " + names);
    }
}
