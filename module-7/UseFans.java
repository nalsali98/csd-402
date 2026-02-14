import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * UseFans
 * - Creates a collection of Fan instances
 * - Displays a collection of Fans without using toString()
 * - Displays a single Fan without using toString()
 * - Tests all functionality using a collection
 *
 * @author Noor
 * @version 1.0
 */
public class UseFans {

    /**
     * Display a collection of Fan objects (no toString()).
     */
    public static void displayFans(Collection<Fan> fans) {
        if (fans == null || fans.isEmpty()) {
            System.out.println("No fans to display.");
            return;
        }

        int i = 1;
        for (Fan fan : fans) {
            System.out.println("Fan #" + i);
            displayFan(fan);
            System.out.println("--------------------------------");
            i++;
        }
    }

    /**
     * Display one Fan object (no toString()).
     */
    public static void displayFan(Fan fan) {
        if (fan == null) {
            System.out.println("Fan: null");
            return;
        }

        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + fan.getSpeedLabel());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /**
     * Test code: create a collection of Fans and display them all.
     */
    public static void main(String[] args) {

        List<Fan> fans = new ArrayList<>();

        // Create Fan instances
        Fan fan1 = new Fan(Fan.FAST, true, 10.0, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5.0, "blue");
        Fan fan3 = new Fan(); // default values
        Fan fan4 = new Fan(7, true, 8.5, "black"); // custom speed example

        // Add to collection
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // Display all fans
        displayFans(fans);

        // Also test single fan display method
        System.out.println("\nSingle fan display test:");
        displayFan(fan1);
    }
}
