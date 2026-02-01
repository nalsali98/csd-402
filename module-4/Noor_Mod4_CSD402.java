/**
 * Title: Module 4.2 – Overloaded Average Methods
 * Author: Noor Al Salihi
 * Course: CSD-402
 * Date:
 *
 * Description:
 * This program demonstrates method overloading by calculating
 * the average of arrays with different numeric data types.
 */

public class Noor_Mod4_CSD402 {

    /**
     * Calculates the average of a short array.
     */
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    /**
     * Calculates the average of an int array.
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Calculates the average of a long array.
     */
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Calculates the average of a double array.
     */
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Main test program.
     */
    public static void main(String[] args) {

        short[] shortArray = {5, 10, 15};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println("=== Module 4.2: Average Calculation ===\n");

        System.out.print("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray) + "\n");

        System.out.print("Int Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray) + "\n");

        System.out.print("Long Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray) + "\n");

        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    /**
     * Displays a short array.
     */
    public static void displayArray(short[] array) {
        for (short value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Displays an int array.
     */
    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Displays a long array.
     */
    public static void displayArray(long[] array) {
        for (long value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Displays a double array.
     */
    public static void displayArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
