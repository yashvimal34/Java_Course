package practice_set;
import java.util.Scanner;

public class CalculatorTypeSelection {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition with Integer");
        System.out.println("2. Addition with Decimal");

        System.out.print("Enter Choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter First Integer: ");
                int int1 = sc.nextInt();

                System.out.print("Enter Second Integer: ");
                int int2 = sc.nextInt();

                System.out.println("Result: " + (int1 + int2));
                break;

            case 2:
                System.out.print("Enter First Decimal: ");
                double d1 = sc.nextDouble();

                System.out.print("Enter Second Decimal: ");
                double d2 = sc.nextDouble();

                System.out.println("Result: " + (d1 + d2));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
