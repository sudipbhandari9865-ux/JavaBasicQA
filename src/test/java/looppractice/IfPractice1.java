package looppractice;

import java.util.Scanner;

public class IfPractice1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("positive number");
        }
    }
}
