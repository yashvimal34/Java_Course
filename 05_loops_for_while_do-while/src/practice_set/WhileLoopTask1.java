package practice_set;

import java.util.Scanner;

public class WhileLoopTask1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = -1;

        while(num != 0){
            num = sc.nextInt();
            System.out.println("You entered: " + num);
        }

    }
}
