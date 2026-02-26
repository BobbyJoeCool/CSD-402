/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 9.2
    Due Date: March 1st, 2026
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TryExceptProgram {
    public static void main(String[] args) {

        //uses an ArrayList filled with a minimum of 10 Strings.
        ArrayList<String> countries = new ArrayList<>(
            Arrays.asList(
                "United States",
                "Canada",
                "Mexico",
                "Brazil",
                "United Kingdom",
                "France",
                "Germany",
                "India",
                "China",
                "Japan"
            )
        );

        // Use a ‘for-each’ loop to print the ArrayList collection.
        for (String countryString : countries) {
            System.out.println(countryString);
        }

        Scanner input = new Scanner(System.in);

        while (true) { //While loop to try again until successful input.
            // Then ask a user which element they would like to see again. 
            System.out.print("Which element would you like to see again (enter an integer)? ");
            String requestedIndex = input.nextLine();

            /*
            Then, attempt to print the element in a try/catch format, which will result in the element being displayed. 
            If the element value received is invalid, display a message that an Exception has been thrown, displaying “Out of Bounds”.
            */
            try {
                //include the use of Autoboxing/Auto-Unboxing, working with a user's String input
                Integer requestedIndexInt = Integer.parseInt(requestedIndex);
                String requestedString = countries.get(requestedIndexInt);
                System.out.println(requestedString);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Exception Thrown: Entry not a valid integer.");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Exception Thrown: Index Out of Bounds");
            }

        }

        input.close();
    }
}
