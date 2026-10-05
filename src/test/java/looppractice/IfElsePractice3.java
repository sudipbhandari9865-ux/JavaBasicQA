package looppractice;

import java.util.Scanner;

public class IfElsePractice3 {
    static void main(String[] args) {
        //Take marks from the user. If marks are 40 or above, print Pass; otherwise Fail.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a marks");
        double marks = sc.nextDouble();

        if (marks>=40){
            System.out.println("you pass in the exam: ");
        }else{
            System.out.println("you fail in the exam: ");
        }
    }
}
