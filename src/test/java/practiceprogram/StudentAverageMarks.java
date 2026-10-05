package practiceprogram;

import java.util.Scanner;

public class StudentAverageMarks {
//    the user to enter marks for 5 subjects and calculate the total and average.
//    Enter Math marks: 70
//    Enter English marks: 80
//    Enter Science marks: 75
//    Enter Computer marks: 90
//    Enter Nepali marks: 85
//
//    Total = 400
//    Average = 80.0

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter math marks");
        double math = sc.nextDouble();
        System.out.println("Enter English marks");
        double english = sc.nextDouble();
        System.out.println("Enter Science marks");
        double science = sc.nextDouble();
        System.out.println("Enter Computer marks");
        double computer = sc.nextDouble();
        System.out.println("Enter Nepali marks");
        double nepali = sc.nextDouble();

        double totalmarks = math + english + science + computer + nepali;
        double Average = totalmarks/5;
        System.out.println("totalmarks :" +totalmarks);
        System.out.println("Average: " +Average);
    }
}
