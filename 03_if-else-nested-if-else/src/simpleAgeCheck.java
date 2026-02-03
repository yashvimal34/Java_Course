import java.util.Scanner;

public class simpleAgeCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age to Check if you are eligible to drive a car: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Congratulations! You are eligible to drive a car");
        } else{
            System.out.println("Sorry! You are not eligible to drive a car");
        }
        sc.close();
    }
}
