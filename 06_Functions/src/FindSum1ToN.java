public class FindSum1ToN {
    public static int sum1ToN(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = sum1ToN(10);
        System.out.println(result);
    }
}
