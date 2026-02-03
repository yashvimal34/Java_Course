import java.util.Scanner;

public class posNeg {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        if(num1 > 0){
            System.out.println("It is Positive Number");
        } else if(num1 < 0){
            System.out.println("It is Negative Number");
        } else{
            System.out.println("It is zero");
        }

        sc.close();
    }
}
