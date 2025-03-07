import java.util.ArrayList;
import java.util.Scanner;
public class PhoneDirectoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Preload 10 entries
        for (int i = 1; i <= 10; i++) {
            phoneDirectory.addContact("Person" + i, "123-456-789" + i);
        }

        while (true) {
            System.out.print("Enter a name (or type 'quit' to exit): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            String phoneNumber = phoneDirectory.getPhoneNumber(name);
            if (phoneNumber != null) {
                System.out.println("Phone number: " + phoneNumber);
            } else {
                if (phoneDirectory.isFull()) {
                    System.out.println("Directory is full. Cannot add new entries.");
                    break;
                }
                System.out.print("Name not found. Enter phone number to add: ");
                String newPhoneNumber = scanner.nextLine().trim();
                phoneDirectory.addContact(name, newPhoneNumber);
                System.out.println("Contact added.");
            }
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
