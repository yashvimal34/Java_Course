public class CheckPosNegZero {
    public static int PosNegZero(int num){
        if(num == 0){
            System.out.println("It is Zero");
        } else if(num > 0){
            System.out.println("It is Positive Number");
        } else {
            System.out.println("It is Negative Number");
        }

        return num;
    }

    public static void main(String[] args){
        int result = PosNegZero(0);
        System.out.println(result);
    }
}
