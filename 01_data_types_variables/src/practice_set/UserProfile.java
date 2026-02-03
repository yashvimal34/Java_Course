package practice_set;
import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Email: ");
        String email = sc.nextLine();

        System.out.print("Is Active User (true/false): ");
        boolean isActiveUser = sc.nextBoolean();

        System.out.println("\n...User Details...");
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My email is: " + email);
        System.out.println("Active: " + isActiveUser);

        sc.close();
    }
}
