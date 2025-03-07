import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Display All Employees in Reverse");
            System.out.println("0. Exit/Terminate Program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                addNewEmployee();
            } else if (choice == 2) {
                displayAllEmployees();
            } else if (choice == 3) {
                displayAllEmployeesReverse();
            } else if (choice == 0) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addNewEmployee() {
        if (employees.size() >= 100) {
            System.out.println("Employee list is full!");
            return;
        }

        System.out.print("Enter Employee Number: ");
        int empNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        Employee newEmployee = new Employee(empNumber, firstName, lastName, department, designation);
        employees.add(newEmployee);
        System.out.println("Employee added successfully.");
    }

    private static void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\nEmployee Records:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    private static void displayAllEmployeesReverse() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\nEmployee Records (Reverse Order):");
        for (int i = employees.size() - 1; i >= 0; i--) {
            employees.get(i).displayEmployee();
        }
    }
}
   