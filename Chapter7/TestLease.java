import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lease lease1 = getData(input);
        Lease lease2 = getData(input);
        Lease lease3 = getData(input);
        Lease lease4 = new Lease(); 
        showValues(lease1);

        lease1.addPetFee();
        showValues(lease1);

        showValues(lease2);
        showValues(lease3);
        showValues(lease4);

        input.close();
    }

    public static Lease getData(Scanner input) {
        Lease lease = new Lease();
        System.out.print("Enter tenant name: ");
        lease.setTenantName(input.nextLine());
        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(input.nextInt());
        System.out.print("Enter monthly rent: ");
        lease.setMonthlyRent(input.nextDouble());
        System.out.print("Enter lease term (months): ");
        lease.setLeaseTerm(input.nextInt());
        input.nextLine();        return lease;
    }

    public static void showValues(Lease lease) {
        System.out.println("\nLease Information:");
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}
