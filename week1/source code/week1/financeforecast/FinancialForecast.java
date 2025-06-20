package week1.financeforecast;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double initialValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return initialValue;
        }

        // Recursive case
        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate / 100);
    }


    public static void main(String[] args) {
        double initial = 10000;  // ₹10,000
        double rate = 5;         // 5% annual growth
        int years = 10;

        double futureValue = FinancialForecast.forecast(initial, rate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, futureValue);
    }
}
