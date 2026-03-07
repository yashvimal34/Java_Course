package classes_hard_ques;

public class SumOfEven {

    static void sumOfEven(int n){

        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        sumOfEven(10);
    }
}
