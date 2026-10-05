package looppractice;

import java.util.Scanner;

public class ElseIfTemputure {
    static void main(String[] args) {
        /*
        Question: Take temperature from the user.

Above 35 → Very Hot
25–35 → Hot
15–24 → Normal
Below 15 → Cold
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a temperature: ");
        double temp = sc.nextDouble();
        if (temp > 35){
            System.out.println(" temperature is very hot");
        } else if (temp>=25) {
            System.out.println(" temperature is hot");
        } else if (temp>=15) {
            System.out.println(" temperature is normal");
        }else {
            System.out.println(" temperature is cold");
        }
    }
}
