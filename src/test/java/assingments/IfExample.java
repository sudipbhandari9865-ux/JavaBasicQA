package assingments;

import java.util.Scanner;

public class IfExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sales");
        int sales = sc.nextInt();

        int payments = 1000;

        if (sales > 10){
            payments = payments+250;
        }
        System.out.println("Total payment: $" +payments);
    }
}
