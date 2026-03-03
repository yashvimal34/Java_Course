public class TableOfNumber {
    public static void tableOfNum(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }
    }

    public static void main(String[] args){
        tableOfNum(2);
    }
}
