package practiceprogram;

import java.util.Scanner;

public class DivideTwoNumbers {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the first number ");
//        double num1 = sc.nextInt();
//        System.out.println("Enter the second number");
//        int num2 = sc.nextInt();
//
//        int totaldivide = num1/num2;
//        System.out.println("toataldivide: " +totaldivide);

        System.out.println("Enter the first number ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();

        double totaldivide = num1/num2;
        System.out.println("toataldivide: " +totaldivide);
    }
}
