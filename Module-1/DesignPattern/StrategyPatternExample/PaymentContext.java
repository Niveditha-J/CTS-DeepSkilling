package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment method not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
