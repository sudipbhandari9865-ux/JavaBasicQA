package assingments;

import java.util.Locale;
import java.util.Scanner;
//Write a Java program that takes a food item name (like "Pizza", "Burger", "Pasta") as input and displays its price using a switch-case statement.

public class SwitchCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter food items: ");
        String food = sc.nextLine();

        switch (food.toLowerCase()){
            case "pizza":
                System.out.println("Enter price: RS1000");
                break;

            case "burger":
                System.out.println("Enter price: RS500");
                break;

            case "pasta":
                System.out.println("Enter price: RS300");
                break;
            default:
                System.out.println("Food item is not available");
        }



    }
}
