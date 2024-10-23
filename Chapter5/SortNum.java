import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking for user input
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Determine if the numbers are in ascending order
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("The numbers are already in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
            // Rearrange and display in descending order
            int temp;
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 < num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            
            System.out.println("Rearranged in descending order: " + num1 + " " + num2 + " " + num3);
        }
        
        scanner.close();
    }
}
