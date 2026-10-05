package practiceprogram;

import java.util.Scanner;

public class practice {
//    Enter price: 250
//    Enter quantity: 3
//    Total Bill = 750
static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the price");
    int price = sc.nextInt();
    System.out.println("Enter the quantity");
    int quantity = sc.nextInt();

    int totalbill = price * quantity;

    System.out.println("totalbill: " +totalbill);
}
}
