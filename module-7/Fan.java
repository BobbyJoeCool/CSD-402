/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 7.2
    Due Date: February 15th, 2026
 */

public class Fan {
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
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument Constructor.
    public Fan(int speed, double radius, String color) {
        this.setSpeed(speed); // This sets the speed AND the on/off state.
        this.setRadius(radius);
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
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
        return this.on;
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
        return this.radius;
    }

    public void setRadius(double radius) {
        // Validate the radius is a positive number.
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return this.color;
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
            case STOPPED ->
                "Stopped";
            case SLOW ->
                "Slow";
            case MEDIUM ->
                "Medium";
            case FAST ->
                "Fast";
            default ->
                "Broken";
        };

        return "The " + this.color + " fan with a radius of " + this.radius + " is " + onToggle + " at a speed of " + speedState + "."; // Constructs the string with the state of the fan.
    }

}
