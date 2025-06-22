public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000; // Example: ₹10,000
        double rate = 0.05;          // 5% growth rate
        int years = 5;               // Forecast for 5 years

        double futureValue = calculateFutureValue(presentValue, rate, years);
        System.out.printf("Future Value after %d years = ₹%.2f%n", years, futureValue);
    }
}
