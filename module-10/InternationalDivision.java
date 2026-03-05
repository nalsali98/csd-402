/**
 * Name: Noor Alsalihi
 * Course: CSD402
 * Assignment: Module 10.2
 *
 * Description:
 * Represents an international division of the company.
 */
public class InternationalDivision extends Division {

    private String country;
    private String language;

    // No-argument constructor
    public InternationalDivision() {
        super();
        country = "Not Assigned";
        language = "Not Assigned";
    }

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {

        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {

        System.out.println("=== International Division ===");
        System.out.println("Division Name  : " + divisionName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Country        : " + country);
        System.out.println("Language       : " + language);
        System.out.println();
    }
}