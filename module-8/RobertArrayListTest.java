/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 8.2
    Due Date: February 22th, 2026
 */

/*
Create a class [yourName]ArrayListTest. Examples:

TomArrayListTest
SueArrayListTest
CindyArrayListTest
Etc.
This class is to contain:

A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
The ArrayList is then to be sent to the method.
The method is then to return the largest value in the ArrayList.
If the ArrayList is sent in empty, the method will then return 0.
The method signature is to be public static Integer max (ArrayList list).
Write additional code for testing your method.
The method will return the largest value that is displayed to the user.
*/

import java.util.ArrayList;
import java.util.Scanner;
public class RobertArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        // Initialize the ArrayList object with Integer as the variable type.
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        // Do/WHile Loop to get input from the user for the loop until a 0 is entered.
        do {
            System.out.print("Enter an Integer.  Enter 0 to finish: ");    
            number = input.nextInt();
            numberList.add(number);
        } while (number != 0);

        input.close();

        int highestValue;
        highestValue = max(numberList);

        System.out.printf("The Highest Value entered is %d.", highestValue);
    }

    public static Integer max(ArrayList list) {
        /**
         * This method finds the maximum value in an array.
         * 
         * @param list an ArrayList<Integer> of numbers entered by the user
         * @return the highest value in the Array
         */

        if (list.isEmpty()) {
            return 0; // If the list is empty, returns a value of 0.
        }
        // starts with the first value in the list.
        Integer max = (Integer)list.get(0);

        // for loop to cycle through the array and find the highest value.
        for (Object obj: list) {
            Integer num = (Integer)obj;  
            // For Each loop in an array needed to be parsed to Integer, so unpacked it as an Object first.
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

}
