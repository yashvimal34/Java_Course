public class EvenCheck {
    static int number = 6;

    public static void even() {
        if (number % 2 == 0) {
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        }
    }
    public static void main(String[] args){
        even();
    }
}
