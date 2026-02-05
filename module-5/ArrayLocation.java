/**
 * Name: Noor Al Salihi
 * Course: CSD402 – Java Programming
 * Module: 5.2 Programming Assignment
 *
 * Description:
 * This program provides methods that locate the largest and smallest
 * elements in two-dimensional arrays (int[][] and double[][]).
 * Each method returns the position (row, column) as a one-dimensional int array.
 */

public class ArrayLocation {

    /**
     * Returns the location of the largest value in a 2D double array.
     *
     * @param arrayParam the 2D double array
     * @return an int array containing {row, column} of the largest value
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] position = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Returns the location of the largest value in a 2D int array.
     *
     * @param arrayParam the 2D int array
     * @return an int array containing {row, column} of the largest value
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] position = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Returns the location of the smallest value in a 2D double array.
     *
     * @param arrayParam the 2D double array
     * @return an int array containing {row, column} of the smallest value
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] position = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Returns the location of the smallest value in a 2D int array.
     *
     * @param arrayParam the 2D int array
     * @return an int array containing {row, column} of the smallest value
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] position = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Simple test driver so the program can run in IntelliJ.
     * (Not required by the assignment, but helps verify your methods work.)
     */
    public static void main(String[] args) {

        int[][] intArray = {
                {3, 5, 1},
                {9, 2, 7}
        };

        double[][] doubleArray = {
                {1.5, 2.2, 0.0},
                {9.9, -3.4, 4.4}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int location: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int location: [" + smallestInt[0] + ", " + smallestInt[1] + "]");

        System.out.println("Largest double location: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double location: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}
