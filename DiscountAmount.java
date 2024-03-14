public class DiscountAmount {
    public static void main(String[] args) {
        int price = 3000;
        int qty = 34;

        int amount = price * qty;

        double discount_amount = amount * 0.05;
        double finalPay = amount + discount_amount;

        System.out.printf("Discount amount is %.2f actual pay is %.2f ", discount_amount, finalPay);
    }
}
