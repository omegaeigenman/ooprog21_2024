import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {

        System.out.println("*****************************************");
        System.out.println("*   Carly's makes the food that makes  *");
        System.out.println("*               it a party.             *");
        System.out.println("*****************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();

        double pricePerGuest = 35;
        double totalPrice = numGuests * pricePerGuest;

        System.out.println("\nNumber of Guests: " + numGuests);
        System.out.println("Price per Guest: $" + pricePerGuest);
        System.out.println("Total Price: $" + totalPrice);

        boolean isLargeEvent = numGuests >= 50;
        System.out.println("Large Event: " + isLargeEvent);
    }
}