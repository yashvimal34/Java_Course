package real_world_ques_length;

import java.util.Scanner;

public class OTPValidationSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter OTP sent to your Gmail: ");
        String otp = sc.nextLine();

        if(otp.length() == 6){
            System.out.println("OTP accepted");
        }else {
            System.out.println("OTP is not valid or expired");
        }
        sc.close();
    }
}
