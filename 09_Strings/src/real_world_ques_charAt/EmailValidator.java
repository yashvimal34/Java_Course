package real_world_ques_charAt;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

       if(Character.isLetter(email.charAt(0))){
           System.out.println("Valid email format");
       }else {
           System.out.println("Invalid");
       }
    }
}
