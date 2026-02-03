import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        if(num1 > num2 ){
            System.out.println(num1 + " is greatest");
        } else if(num1 == num2) {
            System.out.println("Both are equal");
        } else {
            System.out.println(num2 + " is greatest");
        }

        sc.close();
    }
}