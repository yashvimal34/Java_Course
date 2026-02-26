package for_loop_practice;
import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] emails = {
                "yash@gmail.com",
                "sarthak@gmail.com",
                "ayansh@gmail.com"
        };

        System.out.println("Enter Email: ");
        String email = sc.nextLine();

            if(!email.contains("@")){
                System.out.println("Invalid Email");
            } else {
                boolean found = false;

                for(int i = 0; i < emails.length; i++){
                    if(email.equals(emails[i])){
                        found = true;
                        break;
                    }
                }

                if(found) {
                    System.out.println("Valid Email. User Exists.");
                } else {
                    System.out.println("Valid Email but user not registered.");
                }
            }
        sc.close();
    }
}
