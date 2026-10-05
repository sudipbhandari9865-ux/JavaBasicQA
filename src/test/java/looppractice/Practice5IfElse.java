package looppractice;

import java.util.Scanner;

public class Practice5IfElse {
    static void main(String[] args) {
        //Take a number. Check whether it is divisible by 5.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        double num = sc.nextInt();

        if (num % 5==0){
            System.out.println("Divisible by 5");
        }else {
            System.out.println(" not divisible by 5");
        }
    }
}

/*
if (condition) {
    // true
} else {
    // false
}
 */
