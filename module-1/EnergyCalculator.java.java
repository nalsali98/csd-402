import java.util.Scanner;

public class EnergyCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for water mass
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt user for final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy in joules
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.println("The energy needed to heat the water is " + energy + " joules.");

        input.close();
    }
}

