package while_practice;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = 10000;

        while(salary > 0){
            System.out.println("\n Current Balance " + salary);
            System.out.print("Enter Withdrew amount: ");
            int amount = sc.nextInt();

            if(amount > salary){
                System.out.println("Insufficient Balance");
            } else if(amount <= 0){
                System.out.println("Invalid Amount");
            }else {
                System.out.println("Withdrawel Successful!1");
                return;
            }
        }

        System.out.println("Your balance is 0. Transaction ended.");
    }
}
