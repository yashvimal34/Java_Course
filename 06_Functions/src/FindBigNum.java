public class FindBigNum {
    public static int BigNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args){
        int result = BigNum(20, 40);
        System.out.println(result);
    }
}
