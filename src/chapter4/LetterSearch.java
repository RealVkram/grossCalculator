package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word you want to search for the letter 'A' ");
        String word = scanner.next();
        scanner.close();

        Boolean letterFound = false;


        for(int i=0; i < word.length(); i++){
            char searchedLetter = word.charAt(i);
            if(searchedLetter == 'A' || searchedLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("this word contains the letter 'A'");
        }
        else {
            System.out.println("this word does not contain the letter 'A'");
        }
    }
}
