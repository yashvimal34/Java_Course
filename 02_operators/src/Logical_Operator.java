public class Logical_Operator {
    public static void main(String[] args){

        int age = 25;

        System.out.println(age > 18 && age < 60); // True
        System.out.println(age > 18 || age < 10); // false
        System.out.println(!(age > 18)); // false
    }
}
