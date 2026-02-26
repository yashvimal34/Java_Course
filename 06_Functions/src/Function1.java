public class Function1 {
    static double calculateFinalBill(double cartTotal){
        double tax = cartTotal * 0.18; // 18% GST
        double finalAmount = cartTotal + tax;
        return finalAmount;
    }

    public static void main(String[] args){
        double cartTotal = 29000.0;
        double payableAmount = calculateFinalBill(cartTotal);
        System.out.println("Final Amount to pay: " + payableAmount );
    }
}
