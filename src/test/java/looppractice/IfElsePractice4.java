package looppractice;

import java.util.Scanner;

public class IfElsePractice4 {
    static void main(String[] args) {
        //Take age from the user. If age is 18 or above, print eligible; otherwise not eligible
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println(" you are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
    }
}
