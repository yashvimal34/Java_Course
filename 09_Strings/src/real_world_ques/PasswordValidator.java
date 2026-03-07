package real_world_ques;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password to register: ");
        String pass = sc.nextLine();

        if(pass.length() >= 8){
            System.out.println("Password saved and you logged in");
        } else {
            System.out.println("Weak Password");
        }
        sc.close();
    }
}
