public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;

    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000;
        this.leaseTerm = 12;
    }

    public String getTenantName() {
        return tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    // Setters
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    // Method to add a pet fee
    public void addPetFee() {
        this.monthlyRent += 10;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to your monthly rent.");
        System.out.println("Pets are allowed in the apartment, but tenants are responsible for any damages.");
    }
}
