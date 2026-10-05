package assingment1;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        //Q.7 (Algorithm) Repetition Structures (WHILE LOOP):
        //Each store employee makes $15 an hour. Write a program that allows a manager to enter
        // the number of weekly hours worked for each employee, and calculate their pay.
        // Do not allow for overtime(the employee should not exceed 40hr per week).
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of employees: ");
        int employees = sc.nextInt();
        int i = 1;
        while(i<=employees){
            System.out.println("Please enter number of hours per week for employee-"+i+": ");
            int empHours = sc.nextInt();

            if(empHours>0 && empHours<=40){
                System.out.println("The amount you need to pay is: $"+empHours*15+"\n");
                i++;
            }else{
                System.out.println("Employee should be greater then 0hrs and not exceed to 40hrs");
                break;
            }

        }
    }
}
