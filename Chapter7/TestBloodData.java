import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        // Create an object with the default constructor
        BloodData defaultBloodData = new BloodData();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for blood type and Rh factor
        System.out.print("Enter your blood type (O, A, B, AB): ");
        String bloodType = scanner.nextLine();
        
        System.out.print("Enter your Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();
        
        // Create an object with user input via the overloaded constructor
        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        
        // Display the details of both objects
        System.out.println("\nDisplaying details of both blood data objects:");
        System.out.println("Default Object:");
        defaultBloodData.displayBloodData();
        System.out.println("User Input Object:");
        userBloodData.displayBloodData();
        
        // Now update the default object with user's values
        defaultBloodData.setBloodType(bloodType);
        defaultBloodData.setRhFactor(rhFactor);
        
        // Display the updated default object
        System.out.println("\nUpdated Default Object with user's values:");
        defaultBloodData.displayBloodData();
        
        // Close the scanner
        scanner.close();
    }
}
