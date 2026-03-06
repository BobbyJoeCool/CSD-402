/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 20.2
    Due Date: March 8th, 2026
 */

/**
 * Represents a domestic division of a company operating within a specific state.
 * This class extends the abstract Division class and adds state-specific
 * information for domestic operations.
 */
public class DomesticDivision extends Division {

    /** The state in which this domestic division operates */
    private String state;

    /**
     * Constructs a DomesticDivision with the specified parameters.
     * 
     * @param state the state where this division operates
     * @param name the name of the division
     * @param accountNumber the account number for this division
     */
    public DomesticDivision(String state, String name, int accountNumber) {
        super(name, accountNumber);
        this.state = state;
    }

    /**
     * Displays the domestic division's information including its name,
     * account number, and state of operation.
     */
    @Override
    public void display() {
        System.out.println("Domestic Division: ");
        System.out.println("Division Name: " + this.name);
        System.out.printf("Account Number: %d%n", this.accountNumber);
        System.out.println("State: " + this.state);
        System.out.println();
    }
}
