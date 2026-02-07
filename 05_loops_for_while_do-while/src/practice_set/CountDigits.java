package practice_set;

public class CountDigits {
    public static void main(String[] args){

        int digit = 456782346;
        int count = 0;

        for(; digit != 0; digit = digit / 10){
            count++;
        }

        System.out.println("Number of Digits: " + count);

    }
}
