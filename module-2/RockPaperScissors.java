/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 2.2
    Due Date: January 25th, 2026
*/

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors: "); 
        int userChoice = input.nextInt();

        // Validate User Input
        if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
            System.out.println("Invalid Input.");
            System.exit(0);
        }

        int cpuChoice = (int)(Math.random() * 3) + 1;

        System.out.println("You selected " + choiceName(userChoice) + ".");
        System.out.println("The CPU selected " + choiceName(cpuChoice) + ".");

        String winner;

        // Figure out the winner and put them in a String using a Nested Rule Switch
        winner = switch (userChoice) {
            case 1 -> // User: Rock
                switch (cpuChoice) {
                    case 2 -> // CPU: Paper
                        "CPU";
                    case 3 -> // CPU: Scissors
                        "User";
                    default -> // CPU: Rock
                        "Tie";
                };
        
            case 2 -> // User: Paper
                switch (cpuChoice) {
                    case 3 -> // CPU: Scissors
                        "CPU";
                    case 1 -> // CPU: Rock
                        "User";
                    default -> // CPU: Paper
                        "Tie";
                };
        
            case 3 -> // User: Scissors
                switch (cpuChoice) {
                    case 1 -> // CPU: Rock
                        "CPU";
                    case 2 -> // CPU: Paper
                        "User";
                    default -> // CPU: Scissors
                        "Tie";
                };
        
            default ->
                "Invalid";
        };

        if (!winner.equals("Tie")) {
            System.out.println(winner + " is the winner!");
        } else {
            System.out.println("It's a tie!");
        }

        input.close();
    }

    public static String choiceName(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid choice";
        };
    }
}