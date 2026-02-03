import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 0 || age > 120){
            System.out.println("Invalid age");
        } else if(age >= 18 && age <= 60){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible.");
        }

        sc.close();
    }
}