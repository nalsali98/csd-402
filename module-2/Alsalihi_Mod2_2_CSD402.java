import java.util.Random;
import java.util.Scanner;

/**
 * Name: Noor Alsalihi
 * Course: CSD402 Java for Programmers
 * Module: 2.2
 * Description:
 * This program simulates the Rock-Paper-Scissors game.
 * The computer randomly selects Rock, Paper, or Scissors,
 * and the user makes a selection. The program then
 * displays the results.
 */
public class Alsalihi_Mod2_2_CSD402 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Computer choice (1–3)
        int computerChoice = random.nextInt(3) + 1;

        // User input
        System.out.println("Rock-Paper-Scissors Game");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");

        int userChoice = input.nextInt();

        // Convert choices to words
        String computerMove = getMoveName(computerChoice);
        String userMove = getMoveName(userChoice);

        // Display selections
        System.out.println("\nComputer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine winner
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) ||
                        (userChoice == 2 && computerChoice == 1) ||
                        (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }

    // Helper method
    private static String getMoveName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
