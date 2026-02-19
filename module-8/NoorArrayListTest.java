/*
 * NoorArrayListTest.java
 * Module 8.2 Programming Assignment
 * CSD402 Java for Programmers
 *
 * Program accepts integers from the user until 0 is entered.
 * The values are stored in an ArrayList and sent to a method
 * that returns the largest value in the list.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NoorArrayListTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        Integer value;

        System.out.println("Enter integers (0 to stop):");

        // Accept user input (0 must be included in list)
        do {
            System.out.print("Enter number: ");
            value = input.nextInt();
            numbers.add(value);
        } while (value != 0);

        // Call method
        Integer largest = max(numbers);

        // Display result
        System.out.println("\nLargest value in the ArrayList: " + largest);

        input.close();
    }


    /*
     * Method: max
     * Receives an ArrayList and returns the largest value.
     * If the list is empty, returns 0.
     */
    public static Integer max(ArrayList list) {

        if (list == null || list.size() == 0)
            return 0;

        Integer largest = (Integer) list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }
}
