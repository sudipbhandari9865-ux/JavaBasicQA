package assingments;

import java.util.Scanner;

public class IfElseExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sales: ");
        int sales = sc.nextInt();

        if (sales>=10){
            System.out.println("congratulation!");
        }else {
            int shortsales = 10 - sales;
            System.out.println("you ware short by" +shortsales + "sales.");
        }
    }
}
