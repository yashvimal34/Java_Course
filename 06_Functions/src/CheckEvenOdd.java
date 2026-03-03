public class CheckEvenOdd {
    public static int evenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Is is Even Number");
        } else {
            System.out.println("It is Odd number");
        }
        return num;
    }
    public static void main(String[] args){
        int result = evenOdd(2);
        System.out.println(result);
    }
}
