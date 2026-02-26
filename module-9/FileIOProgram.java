/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 9.2
    Due Date: March 1st, 2026
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileIOProgram {
    public static void main(String[] args) {
        //create a new file titled data.file, if the file does not exist.
        File file = new File("data.file");

        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Creates an Array with 10 random numbers.
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(1000));
        }

        /*
        Then write to the new file, adding 10 randomly generated numbers
        or append 10 randomly generated numbers to a previous file.
        Each integer is to be separated by a space.
        Close the file (accomplished using "try-with resources")
        */
        try (FileWriter writer = new FileWriter(file, true)) {
            if (file.length() > 0) {
                writer.write(System.lineSeparator()); // This line starts the appending process of numbers on a new line.
            }
            for (Integer integer : numbers) {
                writer.write(integer + " ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } // File automatically closes when try block completes.

        // reopen the file, read the data, and display it.
        try (Scanner reader = new Scanner(file)) {
            int count = 0;
            while (reader.hasNextInt()) {
                System.out.print(reader.nextInt() + " ");
                count++;
                // Starts a new line every 10 numbers.
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }   
}
