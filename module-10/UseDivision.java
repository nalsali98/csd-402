/**
 * Name: Noor Alsalihi
 * Course: CSD402
 * Assignment: Module 10.2
 *
 * Description:
 * Creates and displays two InternationalDivision objects
 * and two DomesticDivision objects.
 */
public class UseDivision {

    public static void main(String[] args) {

        Division[] divisions = new Division[4];

        divisions[0] = new InternationalDivision(
                "Global Sales", 1001, "Germany", "German");

        divisions[1] = new InternationalDivision(
                "Asia Marketing", 1002, "Japan", "Japanese");

        divisions[2] = new DomesticDivision(
                "West Coast Operations", 2001, "California");

        divisions[3] = new DomesticDivision(
                "East Coast Operations", 2002, "New York");

        for (Division d : divisions) {
            d.display();
        }
    }
}