package for_loop_practice;

public class SendEmail {
    public static void main(String[] args){
        String[] users = {"yash@gmail.com", "anil@gmail.com", "rakesh@gmail.com"};

        for (String user : users) {
            System.out.println("Email sent to: " + user);
        }
    }
}
