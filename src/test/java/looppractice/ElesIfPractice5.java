package looppractice;

import java.util.Scanner;

public class ElesIfPractice5 {
    static void main(String[] args) {
        /*
        Age Category

Question: Take age from the user.

0–12 → Child
13–19 → Teenager
20–59 → Adult
60 or above → Senior
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the you age category");
        int age = sc.nextInt();

        if (age<=12){
            System.out.println(" your age is child");
        } else if (age<19) {
            System.out.println(" your age is teenageer");
        } else if (age<=59) {
            System.out.println(" your age is adult");
        }else {
            System.out.println(" your age is senior");
        }

    }
}
