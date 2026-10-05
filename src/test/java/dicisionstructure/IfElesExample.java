package dicisionstructure;

import java.util.Scanner;

public class IfElesExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pleas guess the number");
        int num = sc.nextInt();

        if(num==7){
            System.out.println("congrate!!! you guess the correct number");
        }else{
            System.out.println("you guess the number is incorrect number");

        }
    }
}
