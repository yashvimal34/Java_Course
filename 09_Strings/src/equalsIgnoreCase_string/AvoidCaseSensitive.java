package equalsIgnoreCase_string;

import java.util.Scanner;

public class AvoidCaseSensitive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String yes1 = "Yes";
        System.out.print("Enter Yes to Save: ");
        String yes = sc.nextLine();

        System.out.println(yes1.equals(yes));
    }
}
