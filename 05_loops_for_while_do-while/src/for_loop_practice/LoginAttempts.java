package for_loop_practice;
import java.util.Scanner;

public class LoginAttempts {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.print("Enter login password");
            int pass = sc.nextInt();
            if(pass == 123){
                System.out.println("Login Successfully");
            }
            else if(i == 3){
                System.out.println("Account Locked");

            }
            System.out.println(i);
        }

        sc.close();
    }
}
