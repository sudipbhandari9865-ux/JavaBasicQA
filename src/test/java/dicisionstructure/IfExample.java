package dicisionstructure;

import java.util.Scanner;

public class IfExample {
    /*
                if(condition){
                //statement
                }
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number");
        int num1 = sc.nextInt();

        if(num1==7){
            System.out.println("congrate!!! you guess the correct number");
        }

        }
    }

