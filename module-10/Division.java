/**
 * Name: Noor Alsalihi
 * Course: CSD402
 * Assignment: Module 10.2
 *
 * Description:
 * Abstract Division class that stores a division name and account number.
 */
public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // No-argument constructor
    public Division() {
        divisionName = "Not Assigned";
        accountNumber = 0;
    }

    // Constructor requiring both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method
    public abstract void display();
}