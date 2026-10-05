package basicprogram;

import java.util.Scanner;

public class PayCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("get the number of hours worked");
        int hours = sc.nextInt();
        System.out.println("get the hourly pay rate");
        int payrate = sc.nextInt();

        int Totalpay = hours * payrate;

        System.out.println("Totalpay: " +Totalpay);
    }
}

//Input hours
//      ↓
//Input pay rate
//      ↓
//totalPay = hours × rate
//      ↓
//Display totalPay