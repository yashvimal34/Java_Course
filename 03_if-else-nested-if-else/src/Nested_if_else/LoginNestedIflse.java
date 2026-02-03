package Nested_if_else;
import java.util.Scanner;

public class LoginNestedIflse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(username.equals("Admin")){
            if(pass.equals("admin123")){
                System.out.print("Login successfully!");
            } else {
                System.out.print("Password must be correct");
            }
        } else {
            System.out.print("User not found");
        }

        sc.close();
    }
}
