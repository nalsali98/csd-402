/**
 * Name: Noor Alsalihi
 * Course: CSD402
 * Assignment: Module 10.2
 *
 * Description:
 * Represents a domestic division of the company.
 */
public class DomesticDivision extends Division {

    private String state;

    // No-argument constructor
    public DomesticDivision() {
        super();
        state = "Not Assigned";
    }

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {

        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {

        System.out.println("=== Domestic Division ===");
        System.out.println("Division Name  : " + divisionName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("State          : " + state);
        System.out.println();
    }
}