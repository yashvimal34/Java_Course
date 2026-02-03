import java.util.Scanner;

public class Even_odd_if_else {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("It is Even Number");
        } else {
            System.out.println("It is Odd Number");
        }

        sc.close();
    }
}
