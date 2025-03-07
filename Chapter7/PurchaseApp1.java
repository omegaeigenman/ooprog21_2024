import java.util.Scanner;

public class PurchaseApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5];

        for (int i = 0; i < purchases.length; i++) {
            int invNumber;
            double saleAmount;

            // Validate invoice number (must be between 1000 and 8000)
            while (true) {
                System.out.print("Enter invoice number (1000-8000) for Purchase " + (i + 1) + ": ");
                invNumber = scanner.nextInt();
                if (invNumber >= 1000 && invNumber <= 8000) {
                    break;
                }
                System.out.println("Invalid input. Invoice number must be between 1000 and 8000.");
            }

            // Validate sale amount (must be non-negative)
            while (true) {
                System.out.print("Enter amount of sale (non-negative) for Purchase " + (i + 1) + ": ");
                saleAmount = scanner.nextDouble();
                if (saleAmount >= 0) {
                    break;
                }
                System.out.println("Invalid input. Sale amount must be non-negative.");
            }

            purchases[i] = new Purchase(invNumber, saleAmount);
        }

        System.out.println("\nPurchase Details:");
        for (Purchase purchase : purchases) {
            purchase.display();
        }

        scanner.close();
    }
}
