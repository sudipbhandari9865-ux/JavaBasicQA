package dicisionstructure;

import java.util.Scanner;

public class NestedExample {
    static void main(String[] args) {
        /*
        if(condition){
             if(condition){
             //code enter
             }
             }

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total present percentage");
        double percentage = sc.nextDouble();

        if(percentage>=90){

            System.out.println("Did the student subnit the project?(Enter the true or false input only)");
            boolean projectsubmit = sc.nextBoolean();

            if(projectsubmit == true){
                System.out.println("you can get the certification ");
            }else{
                System.out.println("you are not eligible for the certicication");
            }
        }else{
            System.out.println("you are not eligiable for the certification");
        }

    }


}
