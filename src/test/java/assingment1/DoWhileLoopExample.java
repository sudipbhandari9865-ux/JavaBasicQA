package assingment1;

import java.util.Scanner;

public class DoWhileLoopExample {
   public static void main(String[] args) {
//        Q8. Write a program that allows a user to enter two numbers, and then sums up the two numbers.
//        The user should be able to repeat this action until they indicate they are done.

       Scanner sc = new Scanner(System.in);
       String wishes;
       do{
           System.out.println("Enter first number: ");
           int num1 = sc.nextInt();
           System.out.println("Enter second number: ");
           int num2 = sc.nextInt();

           System.out.println("The sum is: "+(num1+num2));
           System.out.println("\n");

           System.out.println("Do you want to continue: press 'y' else press anything...");
            wishes = sc.next();
       }while(wishes.equalsIgnoreCase("y"));

    }
}
