/*
  Breutzmann, Robert
  CSD 402 - Java for Programmers
  Assignment 3.2
  Due Date: January 25th, 2026
*/

public class Pyramid {
  public static void main(String[] args) {

    // Define variables
    int rows = 7;
    int maxLength = 0;

    String r1 = "", r2 = "", r3 = "", r4 = "", r5 = "", r6 = "", r7 = "";

    for (int i = 1; i <= rows; i++) {

        String line = "";

        // Leading spaces
        for (int s = 0; s < (rows - i); s++) {
            line += "    ";
        }

        // Ascending numbers
        int value = 1;
        for (int j = 1; j <= i; j++) {
            line += String.format("%4d", value);
            value *= 2;
        }

        // Descending numbers
        value /= 4;
        for (int j = 1; j < i; j++) {
            line += String.format("%4d", value);
            value /= 2;
        }

        // Store the line
        if (i == 1) r1 = line;
        if (i == 2) r2 = line;
        if (i == 3) r3 = line;
        if (i == 4) r4 = line;
        if (i == 5) r5 = line;
        if (i == 6) r6 = line;
        if (i == 7) r7 = line;

        // Track max length
        if (line.length() > maxLength) {
            maxLength = line.length();
        }
    }

    // Print each line padded to max length with @ using a method
    printLine(r1, maxLength);
    printLine(r2, maxLength);
    printLine(r3, maxLength);
    printLine(r4, maxLength);
    printLine(r5, maxLength);
    printLine(r6, maxLength);
    printLine(r7, maxLength);
  }

  static void printLine(String line, int maxLength) {

    while (line.length() < maxLength) {
        line += " ";
    }

    System.out.println(line + " @");
  }
}
