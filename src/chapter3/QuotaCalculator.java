package chapter3;

import java.util.Scanner;

/*
all sales people are expected to make at least 10 sales each week
for those who do, they receive a congratulatory message
for those who don't, they are informed of how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String arg[]) {
    // initialize the known values
        int salesQuota = 10;

    //get the unknown value i.e amount of sales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sales made this week? ");
        int sales = scanner.nextInt();
        scanner.close();

    //show the ones who made the cut and those who did not.
        if ( sales >= salesQuota) {
            System.out.println("Congrats, you met your target");
        }
        else{
            int salesShort = salesQuota - sales;
            System.out.println("Sorry, you did not make the cut; you were " + salesShort + " sales short");
        }
    }
}
