import java.util.Scanner;

public class studentResult {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks to get Grade according to that:- Marks: ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("Grade A+");
        } else if (marks >= 80){
            System.out.println("Grade A");
        } else if(marks >= 70){
            System.out.println("Grade B+");
        } else if(marks >= 60){
            System.out.println("Grade B");
        } else if(marks >= 50){
            System.out.println("Grade C");
        } else if(marks >= 40) {
            System.out.println("Grade D");
        } else{
            System.out.println("Failed - Demoted");
        }

        sc.close();
    }
}
