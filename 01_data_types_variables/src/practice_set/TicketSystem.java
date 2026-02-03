package practice_set;
import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        double totalCost = ticketPrice * tickets;

        System.out.println("\n...Movie Details...");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Total Cost of Tickets: ₹" + totalCost);

        sc.close();
    }
}
