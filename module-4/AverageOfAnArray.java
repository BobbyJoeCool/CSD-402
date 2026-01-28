/*
  Breutzmann, Robert
  CSD 402 - Java for Programmers
  Assignment 4.2
  Due Date: February 1st, 2026
*/

import java.util.Arrays;

public class AverageOfAnArray {
    public static void main(String[] args) {
        short[] shorts = {1,2,3,4,5,6,7,8};
        int[] integers = {2,4,6,8,10};
        long[] longs = {10000, 20000, 30000, 40000, 50000, 1000000000};
        double[] doubles = {.01, .08, .00001, .984};

        System.out.println("Shorts:");
        System.out.println("Original List:" + Arrays.toString(shorts));
        System.out.println("Average: " + average(shorts));
        System.out.println();

        System.out.println("Integers:");
        System.out.println("Original List:" + Arrays.toString(integers));
        System.out.println("Average: " + average(integers));
        System.out.println();

        System.out.println("Longs:");
        System.out.println("Original List:" + Arrays.toString(longs));
        System.out.println("Average: " + average(longs));
        System.out.println();

        System.out.println("Doubles:");
        System.out.println("Original List:" + Arrays.toString(doubles));
        System.out.println("Average: " + average(doubles));
    }

    public static short average(short[] array) {
        int sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return (long) (sum / array.length);
    }

    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return (double) (sum / array.length);
    }
}