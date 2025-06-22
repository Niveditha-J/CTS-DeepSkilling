package AdapterPatternExample;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        payPalProcessor.processPayment(150.75);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(320.40);
    }
}
