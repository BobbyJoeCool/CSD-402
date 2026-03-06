/* 
    Breutzmann, Robert
    CSD 402 - Java for Programmers
    Assignment 20.2
    Due Date: March 8th, 2026
 */

/**
 * Represents an international division of a company operating in a specific country.
 * This class extends the abstract Division class and adds country and language
 * information for international operations.
 */
public class InternationalDivision extends Division{
    
    /** The country in which this international division operates */
    private String country;
    
    /** The primary language used in this international division */
    private String language;

    /**
     * Constructs an InternationalDivision with the specified parameters.
     * 
     * @param country the country where this division operates
     * @param language the primary language for this division
     * @param name the name of the division
     * @param accountNumber the account number for this division
     */
    public InternationalDivision(String country, String language, String name, int accountNumber) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    /**
     * Displays the international division's information including its name,
     * account number, country of operation, and primary language.
     */
    @Override
    public void display() {
        System.out.println("International Division: ");
        System.out.println("Division Name: " + this.name);
        System.out.printf("Account Number: %d%n", this.accountNumber);
        System.out.println("Country: " + this.country);
        System.out.println("Language: " + this.language);
        System.out.println();
    }
}
