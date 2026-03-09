package equals_type_string;

import java.util.Scanner;

public class RoleBasedSystem {
    public static void main(String[] args){
        String adm = "Admin";
        String usr = "User";
        String gst = "Guest";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        if(adm.equals(role)){
            System.out.println("Admin Dashboard Opened.");
            System.out.println("Access: ");
            System.out.println("1. Remove User" + "2. Edit User" + "3. Add Product User");
        }else if(usr.equals(role)){
            System.out.println("Access: ");
            System.out.println("Only Edit Profile.");
        }else if(gst.equals(role)){
            System.out.println("Only Order something.");
        }else {
            System.out.println("Invalid Role.");
        }
        sc.close();
    }
}
