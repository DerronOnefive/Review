import java.util.Scanner;

public class FinanceManagement {

    final static double MONTHLY_RATE = 0.05 / 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount:");
        double monthlySaving = scanner.nextDouble();

        computeSavingValues(monthlySaving, 6, MONTHLY_RATE);
    }

    private static void computeSavingValues(double monthlySaving, int months, double monthlyRate) {
        double currentBalance = 0;

        for (int i = 1; i <= months; i++) {
            currentBalance = (currentBalance + monthlySaving) * (1 + monthlyRate);
            System.out.printf("Month %d: %.2f%n", i, currentBalance);
        }
    }
}