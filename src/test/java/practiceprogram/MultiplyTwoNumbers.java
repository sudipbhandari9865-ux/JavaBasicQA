package practiceprogram;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int nuum1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int Totalmultipication = num2 *nuum1;
        System.out.println("Totalmultipication: " +Totalmultipication);
    }
}
