/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 20.2
    Due Date: March 8th, 2026
 */

/**
 * Abstract base class representing a company division.
 * This class serves as the parent class for different types of divisions
 * (domestic and international) and defines the common properties and
 * abstract methods that all divisions must implement.
 */
abstract class Division {

    /** The name of the division */
    protected String name;
    
    /** The account number associated with this division */
    protected int accountNumber;

    /**
     * Abstract method that must be implemented by subclasses
     * to display the division's information.
     */
    public abstract void display();

    /**
     * Constructs a Division with the specified name and account number.
     * 
     * @param name the name of the division
     * @param accountNumber the account number for this division
     */
    public Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}
