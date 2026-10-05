package practiceprogram;

import java.util.Scanner;

public class FindRemainder {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//
//        int totalremender = a%b;
//        System.out.println("totalremender: " +totalremender);

//        System.out.println("Enter the first number");
//        float a = sc.nextFloat();
//        System.out.println("Enter the second number");
//        float b = sc.nextFloat();
//
//        float totalremender = a%b;
//        System.out.println("totalremender: " +totalremender);

        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();

        double totalremender = a%b;
        System.out.println("totalremender: " +totalremender);
    }
}
