package assingment1;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        // Write a cashier program that will scan a given number of items and tally the cost.
        //Hint: We need to enter the quantity and we have to calculate the sum of each quantity by taking
        // the price of each quantity and then print the sum.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of quantity: ");
        int quantity = sc.nextInt();

        int sum = 0;
        for (int i=1; i<=quantity; i++){
            System.out.println("Please enter price for quantity-"+i);
            int price = sc.nextInt();
            sum+=price;
        }
        System.out.println("The total cost is: "+sum);

    }
}
