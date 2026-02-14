/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 7.2
    Due Date: February 15th, 2026
*/

import java.util.ArrayList;
import java.util.List;

public class ClassesAndObjectsPart2 {
    public static void main(String[] args) {
        // Create a list for the fans
        List<Fan> fans = new ArrayList<>();

        // Create 3 instances of Fans
        Fan standingFan = new Fan();                          // default
        Fan boxFan = new Fan(Fan.FAST, 10, "black");          // parameterized
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
}

class Fan{
    // Create the constants for the fan speeds.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Create private variables to control the fan.
    private int speed;
    private boolean on; 
    private double radius;
    private String color;

    // No argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Argument Constructor.
    public Fan(int speed, double radius, String color) {
        setSpeed(speed); // This sets the speed AND the on/off state.
        setRadius(radius); 
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // Validate the speed
        if (speed == STOPPED || speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
            // speed != STOPPED (if STOPPED, this will be false, when ANYTHING else, it will be on)
            this.on = speed != STOPPED;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;

// If the fan is off, set the speed to STOPPED.
        if (!on) {
            this.speed = STOPPED;
// If the fan is on and the speed is STOPPED, move the fan to SLOW.
        } else if (this.speed == STOPPED) { 
            this.speed = SLOW;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        // Validate the radius is a positive number.
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override 
    // Overrides Object.toString() so printing the object uses this string.
    public String toString() {
        // Gets a string for On or Off based on the on switch
        String onToggle = this.on ? "on" : "off";

        String speedState = switch (this.speed) { // Rule switch to set the string for the speed. 
            case STOPPED -> "Stopped";
            case SLOW -> "Slow";
            case MEDIUM -> "Medium";
            case FAST -> "Fast";
            default -> "Broken";
        };
        
        return "The " + this.color + " fan with a radius of " + this.radius + " is " + onToggle + " at a speed of " + speedState + "."; // Constructs the string with the state of the fan.
    }

}

/*
This class will display the status of a fan or a list of fans
Without using the toString() function inside the Fan class.
*/
class UseFans{

    // Method to display a collection of Fan instances
    public static void displayFans(List<Fan> fans) {

        System.out.println("Displaying All Fans:\n");

        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
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