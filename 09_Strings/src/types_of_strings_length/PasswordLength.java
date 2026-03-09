package types_of_strings_length;

import java.util.Scanner;

public class PasswordLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = sc.nextLine();

        if(pass.length() >= 6){
            System.out.println("You are logged in");
        } else {
            System.out.println("password length is too short");
        }

        sc.close();
    }
}
