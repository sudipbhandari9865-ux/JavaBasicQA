package looppractice;

import java.util.Scanner;

public class IfElsePractice5 {
    static void main(String[] args) {
        //Take two numbers. Find which number is greater.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println(num1+"is greater");
        }else {
            System.out.println(num2+"is greater");
        }
    }
}
