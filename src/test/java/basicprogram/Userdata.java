package basicprogram;

import java.util.Scanner;

public class Userdata {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int number2 = sc.nextInt();

        int result = number1*number2;
        System.out.println(result);

    }
}
