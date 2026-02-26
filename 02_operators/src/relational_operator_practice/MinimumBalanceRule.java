package relational_operator_practice;

import java.util.Scanner;

public class MinimumBalanceRule {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your balance: ");
        int balance = sc.nextInt();

        if(balance >= 1000){
            System.out.println("You bank balance is maintained.");
        } else {
            System.out.println("Your balance is not maintained please deposit at least Rs1000.");
            return;
        }

        System.out.println("Enter Your Withdrawal amount: ");
        int withdraw = sc.nextInt();

        if(withdraw == 0){
            System.out.println("You are not allowed. ");

        } else if(withdraw > balance){
            System.out.println("Insufficient balance. ");
        } else {
            System.out.println("Withdrawel Successfully!");
        }

        sc.close();
    }
}
