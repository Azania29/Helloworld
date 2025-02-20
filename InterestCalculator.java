import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter net balance: ");
        double netBalance = scanner.nextDouble();

        System.out.print("Enter payment made: ");
        double payment = scanner.nextDouble();

        System.out.print("Enter number of days in billing cycle (d1): ");
        int d1 = scanner.nextInt();

        System.out.print("Enter number of days before billing cycle (d2): ");
        int d2 = scanner.nextInt();

        System.out.print("Enter monthly interest rate (e.g., 0.0152 for 1.52%): ");
        double interestRate = scanner.nextDouble();

        double averageDailyBalance = ((netBalance * d1) - (payment * d2)) / d1;

        double interest = averageDailyBalance * interestRate;

        System.out.printf("Average Daily Balance: %.2f%n", averageDailyBalance);
        System.out.printf("Interest on Unpaid Balance: %.2f%n", interest);

        scanner.close();
    }
}
