import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Patient 1: Using default constructor
        Patient patient1 = new Patient();
        System.out.println("Patient 1 (Default Values):");
        patient1.displayPatientInfo();
        System.out.println();

        // Patient 2: Prompting the user for values
        System.out.println("Enter details for Patient 2:");
        System.out.print("Enter ID Number: ");
        int idNumber2 = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character
        System.out.print("Enter Blood Type: ");
        String bloodType2 = scanner.nextLine();
        System.out.print("Enter Rh Factor: ");
        String rhFactor2 = scanner.nextLine();

        Patient patient2 = new Patient(idNumber2, age2, bloodType2, rhFactor2);
        System.out.println("Patient 2 (User Input):");
        patient2.displayPatientInfo();
        System.out.println();

        // Patient 3: Prompting user for ID and age, but using default BloodData
        System.out.println("Enter details for Patient 3 (default BloodData):");
        System.out.print("Enter ID Number: ");
        int idNumber3 = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age3 = scanner.nextInt();

        Patient patient3 = new Patient(idNumber3, age3, "O", "+");
        System.out.println("Patient 3 (User Input for ID and Age, Default BloodData):");
        patient3.displayPatientInfo();

        scanner.close();
    }
}
