package AdapterPatternExample;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Stripe.");
    }
}

