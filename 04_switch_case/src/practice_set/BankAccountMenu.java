package practice_set;
import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 153000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw\n");

        System.out.print("Enter Menu To Check account details (1-3): ");
        int accMenu = sc.nextInt();

        switch (accMenu){
            case 1:
                System.out.println("Your Bank Balance is: " + balance);
                break;
            case 2:
                System.out.println("Enter Amount to Deposit: ");
                int money = sc.nextInt();

                if(money <= 0){
                    System.out.println("Invalid Deposit Amount: ");
                    return;
                }

                balance = balance + money;

                System.out.println("Deposit Successfully!");
                System.out.println("Your Total Balance is: " + balance);
                break;

            case 3:
                System.out.println("Enter Amount to Withdraw: ");
                int withdraw = sc.nextInt();

                if(withdraw <= 0){
                    System.out.println("Invalid Withdraw Amount");
                    return;
                }

                if(withdraw > balance){
                    System.out.println("Insufficient Balance");
                    return;
                }

                balance = balance - withdraw;
                System.out.println("You have Withdrawn: Rs" + withdraw + " Amount");
                System.out.println("Your Updated balance:  " + balance);
                break;
            case 4:
                System.out.println("Thank You!!");
            default:
                System.out.println("Invalid Account Menu");
        }

        sc.close();
    }
}
