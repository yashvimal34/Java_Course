import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Your Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Total Seats: ");
        int totalSeate = sc.nextInt();

        System.out.print("Is House full (true/false): ");
        boolean isHouseFull = sc.nextBoolean();

        System.out.println("\n...Movie Details...: ");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Total Seats: " + totalSeate);
        System.out.println("Is House Full: " + isHouseFull);

        sc.close();
    }
}
