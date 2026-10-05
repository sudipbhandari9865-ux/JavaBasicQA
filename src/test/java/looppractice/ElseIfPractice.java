package looppractice;

import java.util.Scanner;

public class ElseIfPractice {
    static void main(String[] args) {
        /*
        Take marks from the user and display the grade.

80 or above → A
60–79 → B
40–59 → C
Below 40 → Fail
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the your marks please");
        double marks = sc.nextDouble();

        if (marks>=80){
            System.out.println(" Your marks is grade A");
        } else if (marks>=60) {
            System.out.println(" your marks is grade B");
        } else if (marks>=40) {
            System.out.println(" your marks is grade C");
        }else {
            System.out.println(" you are fail");
        }
    }
}
/*
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}
 */