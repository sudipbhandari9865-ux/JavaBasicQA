package dicisionstructure;

import java.util.Scanner;

public class ElesIfExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please entre the number of the day");
        int num = sc.nextInt();

        if(num== 1){
            System.out.println("Today is sunday");

        } else if (num== 2) {
            System.out.println("Today is monday");

        } else if (num == 3) {
            System.out.println("Today is tuesday");
        } else if (num ==4 ) {
            System.out.println("Today is wensday");
        } else if (num == 5) {
            System.out.println("Today is thusday");
        } else if (num== 6) {
            System.out.println("Today is friday");
        } else if (num==7) {
            System.out.println("Today is satday");
        }else{
            System.out.println("please enter the day 1 to7");
        }
    }
}
