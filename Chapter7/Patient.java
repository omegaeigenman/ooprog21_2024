public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        idNumber = 0;
        age = 0;
        bloodData = new BloodData(); // Use default BloodData values
    }

    // Overloaded constructor
    public Patient(int newidNumber, int newage, String newbloodType, String newrhFactor) {
        idNumber = newidNumber;
        age = newage;
        bloodData = new BloodData(newbloodType, newrhFactor);
    }

    // Getter for idNumber
    public int getIdNumber() {
        return idNumber;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for bloodData
    public BloodData getBloodData() {
        return bloodData;
    }
}
