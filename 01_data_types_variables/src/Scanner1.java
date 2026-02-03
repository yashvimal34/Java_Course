import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Name: ");
        int age = sc.nextInt();

        System.out.print("Enter Your Percentage: ");
        double percent = sc.nextDouble();

        System.out.print("Enter Your Grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Are You Active (true/false): ");
        boolean active = sc.nextBoolean();

        System.out.println("/n...User Details...");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your percentage is: " + percent);
        System.out.println("Your grade is: " + grade);
        System.out.println("Active: " + active);

        sc.close();
    }
}
