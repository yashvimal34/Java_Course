public class PrintEven {
    public static void even(){
        for(int i = 1; i <= 20; i+=2) {
                System.out.println(i);
        }
    }
    public static void main(String[] args){
        System.out.println("Even Numbers from (1-20) are: ");
        even();
    }
}