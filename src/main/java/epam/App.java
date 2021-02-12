package epam;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter the numbers:");
        float num1 = entry.nextFloat();
        float num2 = entry.nextFloat();
        System.out.println("Enter 1 to add , 2 to subtract, 3 to multiply, 4 to divide");
        int choice = entry.nextInt();
        if (choice == 1) {
            c.add(num1 , num2);
        }
        else if (choice == 2) {
            c.sub(num1, num2);
        }
        else if (choice == 3) {
            c.mul(num1 , num2);
        }
        else if (choice == 4) {
            c.div(num1 , num2);
        }
        else {
            System.out.println("Invalid Entry, Please Try Again...");
        }

    }

}

