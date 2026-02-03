/*
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 5.2
    Due Date: February 8th, 2026
*/

import java.util.Arrays;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int[][] intMatrix = {
            {12, 7, 19, 3, 25},
            {4, 16, 9, 21, 1},
            {18, 5, 23, 8, 14},
            {6, 20, 11, 2, 17},
            {22, 10, 24, 15, 13}
        };

        double[][] doubleMatrix = {
            {1.5, 22.8, 13.4, 7.9, 18.2},
            {9.1, 3.6, 25.7, 14.0, 6.3},
            {17.5, 11.2, 4.8, 20.9, 2.1},
            {24.6, 8.4, 16.7, 5.0, 10.3},
            {12.9, 19.6, 21.4, 15.8, 23.1}
        };

        System.out.println("int largest at " + Arrays.toString(locateLargest(intMatrix)));
        System.out.println("int smallest at " + Arrays.toString(locateSmallest(intMatrix)));

        System.out.println("double largest at " + Arrays.toString(locateLargest(doubleMatrix)));
        System.out.println("double smallest at " + Arrays.toString(locateSmallest(doubleMatrix)));

    }

    public static int[] locateLargest(double[][] matrix) {
        // Initalize the variable to track max value, start with the first value.
        double max = matrix[0][0];
        // Initalize the array for the location of the max value
        int[] maxLocation = {0, 0};

        for (int row = 0; row < matrix.length; row++) { //Go through rows
            for (int col = 0; col < matrix[row].length; col++) { //Go through columns
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    maxLocation[0] = row;
                    maxLocation[1] = col;
                }
            }
        }
        return maxLocation;
    }

    public static int[] locateLargest(int[][] matrix) {
        int max = matrix[0][0];
        int[] maxLocation = {0, 0};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    maxLocation[0] = row;
                    maxLocation[1] = col;
                }
            }
        }
        return maxLocation;
    }

    public static int[] locateSmallest(double[][] matrix) {
        double min = matrix[0][0];
        int[] minLocation = {0, 0};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    minLocation[0] = row;
                    minLocation[1] = col;
                }
            }
        }
        return minLocation;
    }

    public static int[] locateSmallest(int[][] matrix) {
        int min = matrix[0][0];
        int[] minLocation = {0, 0};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    minLocation[0] = row;
                    minLocation[1] = col;
                }
            }
        }
        return minLocation;
    }
}
