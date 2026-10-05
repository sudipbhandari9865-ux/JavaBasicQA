package dicisionstructure;

import java.util.Scanner;

public class ClassWork {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the even or odd number");
        double num = sc.nextDouble();

        if(num%2 ==0){
            System.out.println("even number");
        }else{
            System.out.println("number is odd");
        }
    }
}
