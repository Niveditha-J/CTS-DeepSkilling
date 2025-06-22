package StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876", "Nive"));
        context.payAmount(1200.00);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("nive@example.com"));
        context.payAmount(750.50);
    }
}
