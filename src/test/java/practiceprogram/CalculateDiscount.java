package practiceprogram;

import java.util.Scanner;

public class CalculateDiscount {
    //Ask the user for the original price and discount percentage. Calculate the discount amount and final price.
//    Enter price: 1000
//    Enter discount percentage: 10
//
//    Discount = 100
//    Final Price = 900

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        int price= sc.nextInt();
        System.out.println("Enter the discount percentage");
        double disprecentage = sc.nextDouble()/100;

        int finalprice = (int) (price-(disprecentage*price));
        System.out.println("finalprice: " +finalprice);
    }
}
