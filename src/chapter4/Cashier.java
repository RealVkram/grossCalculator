package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {
        //get the number of items
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items would you love to buy? ");
        int numberOfQty = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < numberOfQty; i++){
            System.out.println("enter the price of the items");
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();

        DecimalFormat df = new DecimalFormat("#.00");
        String totalFormat = df.format(total);
        System.out.println("The total cost is N" + totalFormat);
    }
}
