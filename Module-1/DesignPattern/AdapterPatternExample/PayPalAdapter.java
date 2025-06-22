package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;

    public PayPalAdapter() {
        this.payPal = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}
