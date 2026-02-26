package for_loop_practice;
import java.util.Scanner;
public class FindProduct {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] pro = {101, 102, 103, 104, 105};

        System.out.print("Enter Product ID: ");
        int input = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < pro.length; i++){

            if(input == pro[i]){
               System.out.println("Product Found." + pro[i]);
               found = true;
               break;
            }
    }
         if(!found) {
             System.out.println("Product Not Found");
         }
        sc.close();
    }

}
