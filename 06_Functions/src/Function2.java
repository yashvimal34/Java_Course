public class Function2 {
    public static void check(int n){
        if(n < 0){
            System.out.println("Negative");
            return;
        }
        System.out.println("Postive");
    }

    public static void main(String[] args){
        check(-4);
    }
}

