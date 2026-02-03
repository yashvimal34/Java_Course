package practice_set;
import java.util.Scanner;

public class GradeDescriptionSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade To Check Feedback: ");
        char grade = sc.next().charAt(0);

        switch (Character.toUpperCase(grade)){
            case 'A':
                System.out.println("A -> Excellent");
                break;
            case 'B':
                System.out.println("B -> Good");
                break;
            case 'C':
                System.out.println("C -> Average");
                break;
            case 'D':
                System.out.println("D -> Poor");
                break;
            case 'E':
                System.out.println("F -> Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        sc.close();
    }

}
