public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Default constructor
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    // Overloaded constructor
    public BloodData(String newbloodType, String newrhFactor) {
        bloodType = newbloodType;
        rhFactor = newrhFactor;
    }

    // Getter for bloodType
    public String getBloodType() {
        return bloodType;
    }

    // Setter for bloodType
    public void setBloodType(String newbloodType) {
        bloodType = newbloodType;
    }

    // Getter for rhFactor
    public String getRhFactor() {
        return rhFactor;
    }

    // Setter for rhFactor
    public void setRhFactor(String newrhFactor) {
        rhFactor = newrhFactor;
    }

    // Method to display blood type and Rh factor
    public void displayBloodData() {
        System.out.println("Blood Type: " + bloodType + ", Rh Factor: " + rhFactor);
    }
}
