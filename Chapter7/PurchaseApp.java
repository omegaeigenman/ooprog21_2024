import java.util.Scanner;

class Purchase {
    private int invoiceNumber;
    private double amountOfSale;
    private double salesTax;
    private static final double TAX_RATE = 0.05; // Assuming 5% sales tax

    public Purchase(int invNumber, double saleAmount) {
        invoiceNumber = invNumber;
        amountOfSale = saleAmount;
        salesTax = saleAmount * TAX_RATE;
    }

    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount of Sale: $" + amountOfSale);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("------------------------");
    }
}

