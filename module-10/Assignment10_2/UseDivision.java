/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 20.2
    Due Date: March 8th, 2026
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Main program that creates 4 Objects using the Division Abstract Class
 * Two InternationalDivision and Two DomesticDivision,
 * Then uses the display() method to display the information to the console.
 */
public class UseDivision {
    
    /**
     * Main method that creates and displays a list of company divisions.
     * An ArrayList list is used to store the created division so that they
     * can be easily be iterated through for display.
     */
    public static void main(String[] args) {
        List<Division> divisions = new ArrayList<>();

        divisions.add(new InternationalDivision("Germany", "German", "Division of Fire", 5309));
        divisions.add(new InternationalDivision("Franch", "French", "Division of Water", 1701));
        divisions.add(new DomesticDivision("Iowa", "Division of Earth", 1984));
        divisions.add(new DomesticDivision("Nebraska", "Division of Air", 1138));

        for (Division division : divisions) {
            division.display();
        }
    }

}
