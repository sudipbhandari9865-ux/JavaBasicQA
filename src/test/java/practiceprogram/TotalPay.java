package practiceprogram;

import java.util.Scanner;

public class TotalPay {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the number of hours worked
//        System.out.println("Enter hours worked: ");
//        int hourse = sc.nextInt();
        // Get the hourly pay rate
//        System.out.println("Enter hourly pay rate ");
//        int payrate = sc.nextInt();

//        int Totalpay = hourse * payrate;
//
//        System.out.println("Totalpay: " +Totalpay);

        //Get the number of hours worked
        System.out.println("Enter hours worked: ");
        double hourse = sc.nextDouble();
        // Get the hourly pay rate
        System.out.println("Enter hourly pay rate ");
        double payrate = sc.nextDouble();

        double Totalpay = hourse * payrate;

        System.out.println("Totalpay: " +Totalpay);
    }
}
