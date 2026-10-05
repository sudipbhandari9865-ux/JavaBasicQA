package dicisionstructure;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number between 1 to 7");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("sunday");
                break;
            case  2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wonsday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("satday");
               break;
               default:
                System.out.println("please enter the valid number from 1 to 7");

    }
}
}
