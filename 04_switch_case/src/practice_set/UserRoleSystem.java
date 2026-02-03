package practice_set;
import java.util.Scanner;

public class UserRoleSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Login According to Role Based: ");
        System.out.println("1. Admin");
        System.out.println("2. Manager");
        System.out.println("3. User");

        System.out.println("Please Login according to Role Based (1-3): ");
        int role = sc.nextInt();

        switch (role){
            case 1:
                System.out.println("Role: Admin");
                System.out.println("Access: ");
                System.out.println("- Create Users. ");
                System.out.println("- Delete Users. ");
                System.out.println("- View Reports. ");
                break;

            case 2:
                System.out.println("Role: Manager");
                System.out.println("Access: ");
                System.out.println("- View Reports. ");
                System.out.println("- Manager Team. ");
                break;

            case 3:
                System.out.println("Role: User ");
                System.out.println("Access: ");
                System.out.println("- View Profile ");
                break;

            default:
                System.out.println("Invalid Role Access.");
        }
        sc.close();

    }
}
