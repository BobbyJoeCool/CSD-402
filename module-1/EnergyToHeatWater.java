/*
Breutzmann, Robert
CSD 402 - Java for Programmers
Assignment 1.3
Due Date: January 18, 2026

Write a program that calculates the energy needed to heat water
from an initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kg
and the initial and final temperatures of the water.
Q = M * (Tf - Ti) * 4184
Where M is the mass of the water and Q is the energy in Joules. 
*/

import java.util.Scanner;

public class EnergyToHeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of water in kilograms: ");
        double mass = input.nextDouble();

        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter final temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        double energy = mass * (finalTemp - initialTemp) * 4184;

        System.out.printf("The energy needed is %.0f joules.", energy);

        input.close();
    }
}
