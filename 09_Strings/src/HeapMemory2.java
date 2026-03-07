public class HeapMemory2 {
    public static void main(String[] args){
        String name = new String("Yash");
        String sameName = new String("Yash");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(name == sameName);
    }
}
// It gives false because we are creating new string, i.e. it uses more memory to save these strings.