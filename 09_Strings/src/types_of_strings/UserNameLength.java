package types_of_strings;

import java.util.Scanner;

public class UserNameLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String user = sc.nextLine();

        System.out.println(user + " characters length is "  + user.length());

    }
}
