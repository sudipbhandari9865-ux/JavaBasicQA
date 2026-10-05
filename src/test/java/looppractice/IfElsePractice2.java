package looppractice;

import java.util.Scanner;

public class IfElsePractice2 {
    static void main(String[] args) {
        //. Even or Odd
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        double num = sc.nextDouble();

        if (num%2==0){
            System.out.println("please enter the even number");
        }else{
            System.out.println("please enter the odd number");
        }
    }
}
