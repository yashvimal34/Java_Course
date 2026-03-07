package classes_hard_ques;

public class PrimeNumberCheck {
    static void prime(int number){
    boolean isPrime = true;

    for(int i = 2; i < number; i++) {
        if(number % 2 == 0){
            isPrime = false;
            break;
        }
    }

    if(isPrime && number > 1){
        System.out.println("Prime Number");
    } else{
        System.out.println("Not Prime");
    }
    }

    public static void main(String[] args){
        prime(4);
    }
}
