package practice_set;
import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int balance = 10000;


        System.out.println("Please select an Option give below: ");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");

        System.out.print("Please select an Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("You Balance is: " + balance);
                break;

            case 2:

                System.out.println("Enter Amount to Withdraw: ");
                int withdraw = sc.nextInt();

                if(withdraw <= 0){
                    System.out.println("Invalid Withdrawal Amount");
                    return;
                }


                if(withdraw > balance){
                    System.out.println("Withdrawal Aamount cannot exceed the limit");
                    return;
                }

                balance = balance - withdraw;
                System.out.println("Updated Balance: " + balance);
                break;

            case 3:
                System.out.println("Exit");
                System.out.println("Last Transaction was cancelled");
                System.out.println("Thank You!");
                return;

            default:
                System.out.println("Invalid Option");
        }

sc.close();


    }
}
