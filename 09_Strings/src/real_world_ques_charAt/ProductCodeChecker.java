package real_world_ques_charAt;

import java.util.Scanner;

public class ProductCodeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Code: ");
        String product = sc.nextLine();

        if(product.charAt(0) == 'P'){
            System.out.println("Valid Product Code.");
        }else {
            System.out.println("Invalid Product code.");
        }
        sc.close();
    }
}
