package complex_expression;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks >= 40){
            System.out.println("Pass");
        } else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
