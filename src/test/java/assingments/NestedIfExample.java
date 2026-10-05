package assingments;

import java.util.Scanner;

public class NestedIfExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your annual salary: $");
       double salary = sc.nextDouble();

        System.out.println("Enter number of years at current job:");
        double yearsJob = sc.nextDouble();

        if (salary>=3000){
            if (yearsJob >=2){
                System.out.println("Eligible for loan");
            }else {
                System.out.println("You do not Eligible: less than 2 years at current job.");
            }
        }else {
            System.out.println("Not eligible: salary too low");
        }
    }
}
