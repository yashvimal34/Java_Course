package real_world_ques_length;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if(username.length() >= 5 && username.length() <= 15){
            System.out.println("Username is setup");
        }else {
            System.out.println("Username is must be between 5 and 15");
        }
        sc.close();
    }
}
