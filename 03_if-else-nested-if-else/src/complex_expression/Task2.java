package complex_expression;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        if(temp <= 0){
            System.out.println("Freezing");
        } else if ((temp > 0) && (temp <= 15)) {
            System.out.println("Cold");
        } else if ((temp > 15) && (temp <= 30)) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
        sc.close();
    }
}
