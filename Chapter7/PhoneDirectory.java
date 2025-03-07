import java.util.ArrayList;
import java.util.Scanner;

class PhoneDirectory {
    private ArrayList<String> names;
    private ArrayList<String> phoneNumbers;
    private static final int MAX_ENTRIES = 30;

    public PhoneDirectory() {
        names = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    // Method to add a contact
    public boolean addContact(String name, String phoneNumber) {
        if (names.size() < MAX_ENTRIES) {
            names.add(name);
            phoneNumbers.add(phoneNumber);
            return true;
        }
        return false; // Directory full
    }

    // Method to get phone number by name
    public String getPhoneNumber(String name) {
        int index = names.indexOf(name);
        if (index != -1) {
            return phoneNumbers.get(index);
        }
        return null; // Name not found
    }

    // Method to check if directory is full
    public boolean isFull() {
        return names.size() >= MAX_ENTRIES;
    }
}

