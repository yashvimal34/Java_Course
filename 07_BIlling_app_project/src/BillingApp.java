import java.util.Scanner;

public class BillingApp {
    public static void main(String[] args){

        String[] products = {"1. Phone", "2. Laptop", "3. Computer", "4. Keyboard"};
        double[] prices = {12000.0, 65000.0, 55000.0, 1200.0};

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Smart Billing System: ");
        for(int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }

        System.out.println("\nPrice of Each Item: ");
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }

        System.out.print("Enter Food Number: ");
        int productNumber = sc.nextInt();

        int index = productNumber - 1; // Convert to array index

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double SubTotal = prices[index] * quantity;

        System.out.println("\nSubtotal: " + SubTotal);

        if(quantity > 4){
            double onlyDiscount = SubTotal * 0.10;
            double discount = SubTotal - (SubTotal * 0.10);
            System.out.println("Congratulations you get a 10% discount on purchasing items above 4");
            System.out.println("Discount: " + onlyDiscount);
            System.out.println("Total Amount Payable: " + discount);

        } else if (quantity <= 3) {
            double onlyTax = SubTotal * 0.18;
            double tax = SubTotal + (SubTotal * 0.18);
            System.out.println("You have to pay 18% tax.");
            System.out.println("Tax: " + onlyTax);
            System.out.println("Total Amount Payable: " + tax);
        } else {
            return;
        }

        System.out.println("Select Payment Method: ");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");

        System.out.print("Enter Payment Method (1-3): ");
        int payment = sc.nextInt();

        switch (payment){
            case 1:
                System.out.println("Payment Method: Cash");
                System.out.println("Please pay cash when you will receive you order.");
                break;
            case 2:
                System.out.println("Payment Method: UPI");
                System.out.print("Enter UPI ID: ");
                sc.nextLine();

                String upi;
                do{
                    System.out.println("Enter UPI ID: ");
                    upi = sc.nextLine();
                } while(upi.isEmpty());
                System.out.println("Payment Successfully Completed!! ");
                System.out.println("UPI ID: " + upi);
                break;
            case 3:
                System.out.println("Payment Method: Card");
                sc.nextLine();
                long cardNo;
                String cardName;

                // Card Number
                System.out.println("Enter Card Number: ");
                cardNo = sc.nextLong();

                sc.nextLine();

                // Card name
                do{
                    System.out.println("Enter Name as per card: ");
                    cardName = sc.nextLine();
                } while (cardName.isEmpty());

                System.out.println("Payment Successfully Completed!!");
                System.out.println("Card Holder: " + cardName);
                System.out.println("Card Number: **** **** **** " + (cardNo % 10000));
            default:
                char repeat;
                do{
                    // Order again
                    System.out.println("Order Placed Successfully!!\n");
                    System.out.println("Do you want to Order again? (Y/N): ");
                    repeat = sc.next().charAt(0);
                } while(repeat == 'y' || repeat == 'Y');
                System.out.println("Thank You for ordering!");
        }
        sc.close();
    }
}
