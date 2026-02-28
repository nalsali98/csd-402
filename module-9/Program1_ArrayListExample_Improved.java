/**
 * Program1_ArrayListExample_Improved.java
 *
 * CSD 402 - Module 9.2 - Program 1 (Improved)
 *
 * Requirements satisfied:
 *  - Has a no-argument constructor that initializes all object fields to defaults.
 *  - Uses an ArrayList<String> with 10+ elements.
 *  - Prints the list using a for-each loop.
 *  - Prompts the user for an index and prints the element in a try/catch.
 *  - If index is invalid prints: "Exception has been thrown: Out of Bounds"
 *  - Demonstrates autoboxing/auto-unboxing in a clear, documented way.
 *
 * Author: Noor El-din Alsalihi
 * Date: 2026-02-27
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public final class Program1_ArrayListExample_Improved {

    /** The collection of string items used in the program. */
    private final List<String> items;

    /** Default placeholder shown in UI (not strictly required but useful). */
    private static final String BLANK_PLACEHOLDER = "_____";

    /**
     * No-argument constructor.
     * Initializes the items list with a default set of strings.
     * All fields are set via this constructor to ensure a single controlled initialization path.
     */
    public Program1_ArrayListExample_Improved() {
        this.items = new ArrayList<>();
        initializeDefaultItems();
    }

    /**
     * Populates the items list with at least 10 entries.
     * Extracted to a method to keep the constructor clean and focused.
     */
    private void initializeDefaultItems() {
        // Keep these simple and distinct (easy to grade / test)
        items.add("apple");
        items.add("banana");
        items.add("carrot");
        items.add("dog");
        items.add("elephant");
        items.add("flower");
        items.add("guitar");
        items.add("hotel");
        items.add("island");
        items.add("jacket");
        items.add("kite"); // 11th element - meets "minimum 10"
    }

    /**
     * Prints the items to the console using a for-each loop, with indices.
     */
    private void printItems() {
        System.out.println("ArrayList contents (index : value):");
        int index = 0;
        for (String item : items) {
            System.out.printf("  %2d : %s%n", index, item);
            index++;
        }
    }

    /**
     * Returns the element at the requested index.
     *
     * @param index the requested index
     * @return the element at index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    private String getElementAtIndex(int index) {
        // This will throw IndexOutOfBoundsException for invalid indices,
        // which the caller will catch and then print the required message.
        return items.get(index);
    }

    /**
     * Runs the interactive program: prints list, asks user which index to show, and prints result
     * while handling exceptions according to the assignment spec.
     */
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            printItems();

            System.out.println();
            System.out.printf("Which element index would you like to see again? (enter an integer 0 - %d)%n",
                    items.size() - 1);
            System.out.print("Index: ");
            String userInput = scanner.nextLine();

            // parse user input to primitive int
            int parsedIndex;
            try {
                parsedIndex = Integer.parseInt(userInput.trim());
            } catch (NumberFormatException nfe) {
                // Non-integer input: inform the user
                System.out.println("Invalid input. Please enter a valid integer index.");
                return;
            }

            // Demonstrate autoboxing: store primitive int into Integer
            Integer boxedIndex = parsedIndex; // autoboxing
            // Later, when passing boxedIndex into a method expecting int, auto-unboxing will occur
            // (For clarity we call getElementAtIndex(boxedIndex) which requires an int).
            try {
                // auto-unboxing occurs when boxedIndex is used where int is required
                String element = getElementAtIndex(boxedIndex);
                System.out.printf("Element at index %d is: %s%n", boxedIndex, element);
            } catch (IndexOutOfBoundsException ioobe) {
                // EXACT required message:
                System.out.println("Exception has been thrown: Out of Bounds");
            }
        } // scanner closed automatically by try-with-resources
    }

    /**
     * Program entry point for standalone execution.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Program1_ArrayListExample_Improved program = new Program1_ArrayListExample_Improved();
        program.run();
    }
}