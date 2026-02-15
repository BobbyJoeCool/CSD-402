/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 7.2
    Due Date: February 15th, 2026
 */

import java.util.ArrayList;
import java.util.List;

public class UseFans {
    public static void main(String[] args) {
        // Create a list for the fans
        List<Fan> fans = new ArrayList<>();

        // Create 3 instances of Fans
        Fan standingFan = new Fan();
        Fan boxFan = new Fan(Fan.FAST, 10, "black");
        Fan deskFan = new Fan(Fan.MEDIUM, 8, "blue");  

        // Add the fans to the list.
        fans.add(standingFan);
        fans.add(boxFan);
        fans.add(deskFan);

        System.out.println("Printing From the List Function:");
        UseFans.displayFans(fans);

        System.out.println("\nPrinting one at a time:");
        for (Fan fan : fans) {
            UseFans.displayFan(fan);
        }
    }

    // Method to display a collection of Fan instances
    public static void displayFans(List<Fan> fans) {

        System.out.println("Displaying All Fans:\n");

        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Method to display a single Fan instance
    public static void displayFan(Fan fan) {

        // Is the fan on?
        String onToggle = fan.isOn() ? "On" : "Off";

        // What Speed is it going?
        String speedState = switch (fan.getSpeed()) {
            case Fan.STOPPED -> "Stopped";
            case Fan.SLOW -> "Slow";
            case Fan.MEDIUM -> "Medium";
            case Fan.FAST ->"Fast";
            default ->"Unknown";
        };

        System.out.println("Fan Details:");
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Power: " + onToggle);
        System.out.println("Speed: " + speedState);
        System.out.println(); //BlankLine
    }
}
