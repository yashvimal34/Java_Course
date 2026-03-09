package charAt_type_string;

import java.util.Scanner;

public class UserToPrintChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));

        sc.close();
    }
}