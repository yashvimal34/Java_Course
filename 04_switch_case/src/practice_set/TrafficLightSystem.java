package practice_set;

import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number(1-3): ");
        int traffic = sc.nextInt();

        switch (traffic){
            case 1:
                System.out.println("Red -> Stop");
                break;
            case 2:
                System.out.println("Yellow -> Ready");
                break;
            case 3:
                System.out.println("Green -> Go");
                break;
            default:
                System.out.println("Invalid Traffic Number");
        }

        sc.close();
    }
}
