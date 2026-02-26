package complex_expression;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("You have license or not: ");
        boolean hasLicense = sc.nextBoolean();

        if(age >= 18){
            if(hasLicense){
                System.out.print("You can drive a car");
            } else {
                System.out.println("You don't have license");
            }
        } else{
            System.out.println("You cannot drive a car");
        }
        sc.close();
    }
}
