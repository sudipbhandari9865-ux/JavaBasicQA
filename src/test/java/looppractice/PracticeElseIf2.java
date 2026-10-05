package looppractice;

import java.util.Scanner;

public class PracticeElseIf2 {
    static void main(String[] args) {
        //Take a number and check whether it is positive, negative, or zero.
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("positive number");
        } else if (num<0) {
            System.out.println("negative number");
        } else {
            System.out.println("Zero numbers");
        }

    }
}
