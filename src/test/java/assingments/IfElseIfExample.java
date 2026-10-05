package assingments;

import java.util.Scanner;

public class IfElseIfExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the exam score");
        int score = sc.nextInt();

        if(score<0 || score>100){
            System.out.println("Please enter valid marks betwwen 0 - 100: ");
            return;
        }

        if (score>=90){
            System.out.println("grade: A+");
        } else if (score >=80) {
            System.out.println("grade: A");
        } else if (score >=70) {
            System.out.println("grade: B+");
        } else if (score >=60) {
            System.out.println("grade: B");
        } else if (score >=50) {
            System.out.println("grade: c+");
        } else if (score >=40) {
            System.out.println("grade: c");
        } else if (score >=30) {
            System.out.println("grade: D+");
        }else {
            System.out.println("fail");
        }
    }
}
