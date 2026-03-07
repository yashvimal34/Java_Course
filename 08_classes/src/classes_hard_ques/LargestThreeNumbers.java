package classes_hard_ques;

public class LargestThreeNumbers {
    static void largestNumber(int a, int b, int c){
        if(a > b  && a > c){
            System.out.println(a + " is greater");
        } else if (b > c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
    }

    public static void main(String[] args){
        largestNumber(93, 76, 904);
    }
}