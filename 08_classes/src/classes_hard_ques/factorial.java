package classes_hard_ques;

public class factorial {
    static void findFactorial(int number){
        int fact = 1;

        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void main(String[] args){
        findFactorial(5);

    }
}
