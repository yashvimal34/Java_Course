package charAt_type_string;

public class EveryCharacter {
    public static void main(String[] args){
        String name = "java";

        for(int i = 0; i <= name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
