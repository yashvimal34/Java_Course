public class HeapMemory {
    public static void main(String[] args){
        String name = "Yash";
        String sameName = "Yash";

        System.out.println(name == sameName);
    }
}
// These two are same, so that it does store in same memory, it does not take another memory to save.