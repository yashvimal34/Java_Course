package practice_set;
import java.util.Scanner;

public class SimpleMenuSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Menu Number(1-3): ");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("View Profile");
                break;
            case 2:
                System.out.println("Update Profile");
                break;
            case 3:
                System.out.println("Logout");
                break;
            default:
                System.out.println("Invalid menu");
        }

        sc.close();
    }
}
