import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun.   S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes the equipment was rented: ");
        int totalMinutes = input.nextInt();

        int hours = totalMinutes / 60;
        int extraMinutes = totalMinutes % 60;

        int rentalCost = (hours * 40) + extraMinutes;

        System.out.println("Hours rented: " + hours);
        System.out.println("Extra minutes rented: " + extraMinutes);
        System.out.println("Total price: $" + rentalCost);
    }
}