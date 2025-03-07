public class Employee {
    private int empNumber;
    private String firstName;
    private String lastName;
    private String department;
    private String designation;

    public Employee(int number, String fName, String lName, String dept, String desig) {
        empNumber = number;
        firstName = fName;
        lastName = lName;
        department = dept;
        designation = desig;
    }

    
    public void setEmpNumber(int number) {
        empNumber = number;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setDepartment(String dept) {
        department = dept;
    }

    public void setDesignation(String desig) {
        designation = desig;
    }

    
    public int getEmpNumber() {
        return empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    
    public void displayEmployee() {
        System.out.println("Emp No: " + empNumber + ", Name: " + firstName + " " + lastName +
                ", Department: " + department + ", Designation: " + designation);
    }
}
