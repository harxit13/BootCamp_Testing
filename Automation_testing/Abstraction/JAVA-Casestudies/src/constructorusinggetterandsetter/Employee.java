package constructorusinggetterandsetter;

// Write a Java program using Constructor, Setter and Getter method
// for Employee having ID, Name and Salary

class Employee1 {

    // Private data members
    private int id;
    private String name;
    private float salary;
    private String ssn;

    // Constructor
    public Employee1(int id, String name, float salary, String ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Salary
    public float getSalary() {
        return salary;
    }

    // Setter for Salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Getter for SSN
    public String getSsn() {
        return ssn;
    }

    // Setter for SSN
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class Employee {

    public static void main(String[] args) {

        // Creating object using constructor
        Employee1 harshit = new Employee1(123, "Harshit Chaudhary", 1234000.500f, "5634524234");

        // Displaying employee details using getter methods
        System.out.println("Employee ID:\t\t" + harshit.getId());
        System.out.println("Employee Name:\t\t" + harshit.getName());
        System.out.println("Employee Salary:\t" + harshit.getSalary());
        System.out.println("Employee SSN:\t\t" + harshit.getSsn());
    }
}