import java.util.Scanner;

public class Practice_Operator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int differ = num1 - num2;
        int pro = num1 * num2;
        int divide = num1 / num2;
        int remain = num1 % num2;

        System.out.println("Sum of Num1 and Num2 is: " + sum);
        System.out.println("Difference of Num1 and Num2 is: " + differ);
        System.out.println("Product of Num1 and Num2 is: " + pro);
        System.out.println("Division of Num1 and Num2 is: " + divide);
        System.out.println("Remainder of Num1 and Num2: " + remain);

        sc.close();
    }
}