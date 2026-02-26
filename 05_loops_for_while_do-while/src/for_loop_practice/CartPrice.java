package for_loop_practice;

public class CartPrice {
    public static void main(String[] args){

        double[] prices = {1000.0, 2345.65, 5465.43, 4577.45};

        double total = 0;

        for(int i = 0; i < prices.length; i++){
            total = total + prices[i];
        }
            System.out.println("The total price of items is" + total);

    }
}
