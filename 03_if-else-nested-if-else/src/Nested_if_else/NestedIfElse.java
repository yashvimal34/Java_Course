package Nested_if_else;
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Country Name: ");
        String country = sc.nextLine();

        if(age >= 18){
            if (country.equals("India")){
                System.out.println("You are eligible");
            } else {
                System.out.println("Country not eligible");
            }
        } else {
            System.out.println("Age not eligible");
        }

        sc.close();
    }
}
