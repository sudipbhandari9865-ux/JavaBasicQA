package looppractice;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive and negative number");
        int num = sc.nextInt();

        if (num>=0){
            System.out.println("please the enter positive number");
        }else{
            System.out.println("Enter the negative number");
        }
    }
}
