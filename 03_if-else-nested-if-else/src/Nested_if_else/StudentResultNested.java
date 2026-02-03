package Nested_if_else;
import java.util.Scanner;

public class StudentResultNested {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        } else if (marks >= 40) {
            if(marks >= 75){
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Failed");
        }

        sc.close();
    }
}
