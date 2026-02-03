import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter Your Choice (1-5): ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Cannot divided by zero");
                    return; // This stop program
                }
                System.out.println("Result: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Thank You!!");

        sc.close();
    }
}