/**
 * Program2_FileRandomNumbers_Improved.java
 *
 * CSD 340 - Module 9.2 - Program 2 (Improved)
 *
 * Requirements satisfied:
 *  - Uses a no-argument constructor to set the file name and any defaults.
 *  - Creates data.file if absent and appends 10 random integers separated by spaces.
 *  - Closes resources properly (try-with-resources).
 *  - Reopens the file, reads and displays content.
 *
 * Author: Noor El-din Alsalihi
 * Date: 2026-02-27
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.StringJoiner;

public final class Program2_FileRandomNumbers_Improved {

    /** Default file name used by the program. */
    private final File dataFile;

    /** Number of random integers to write each run. */
    private static final int NUM_RANDOMS = 10;

    /** Random generator (SecureRandom for slightly better randomness). */
    private final SecureRandom random;

    /**
     * No-argument constructor sets defaults for all fields.
     * Data file default name: data.file (in working directory)
     */
    public Program2_FileRandomNumbers_Improved() {
        this.dataFile = new File("data.file");
        this.random = new SecureRandom();
    }

    /**
     * Ensures the file exists. If it does not, attempts to create it.
     *
     * @throws IOException if file cannot be created
     */
    private void ensureFileExists() throws IOException {
        if (!dataFile.exists()) {
            boolean created = dataFile.createNewFile();
            if (!created) {
                throw new IOException("Failed to create file: " + dataFile.getAbsolutePath());
            }
        }
    }

    /**
     * Appends NUM_RANDOMS random integers (1..100) separated by spaces to the data file,
     * followed by a newline. Uses try-with-resources to ensure writer is closed.
     *
     * @throws IOException if an I/O error occurs while writing
     */
    public void appendRandomNumbersToFile() throws IOException {
        ensureFileExists();

        // Build a single line of NUM_RANDOMS integers separated by space
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < NUM_RANDOMS; i++) {
            int n = random.nextInt(100) + 1; // 1..100 inclusive
            joiner.add(Integer.toString(n));
        }
        String lineToWrite = joiner.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile, true))) {
            writer.write(lineToWrite);
            writer.newLine();
        }
    }

    /**
     * Reads and prints the entire contents of the data file to the console.
     *
     * @throws IOException if an I/O error occurs while reading
     */
    public void readAndPrintFileContents() throws IOException {
        ensureFileExists();

        try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
            System.out.println("Contents of " + dataFile.getName() + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * Runs the write-then-read sequence with clear console messages and error handling.
     */
    public void run() {
        try {
            appendRandomNumbersToFile();
            System.out.println("Successfully wrote " + NUM_RANDOMS + " random integers to " + dataFile.getName());
            readAndPrintFileContents();
        } catch (IOException ioe) {
            System.err.println("I/O Error: " + ioe.getMessage());
        }
    }

    /**
     * Program entry point for standalone execution.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Program2_FileRandomNumbers_Improved program = new Program2_FileRandomNumbers_Improved();
        program.run();
    }
}