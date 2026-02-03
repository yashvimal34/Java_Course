package practice_set;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Marks in Eng: ");
        int engMarks = sc.nextInt();

        System.out.print("Enter Marks in Maths: ");
        int mathsMarks = sc.nextInt();

        System.out.print("Enter Marks in Science: ");
        int scienceMarks = sc.nextInt();

        int totalMarks = engMarks + mathsMarks + scienceMarks;

        double percent = (totalMarks / 300.0) * 100;

        System.out.println("Student Name: " + studentName);
        System.out.println("English Marks: " + engMarks);
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Total Percentage: %.2f%%", percent);

        sc.close();
    }
}