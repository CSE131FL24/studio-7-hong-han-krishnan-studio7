package studio7;

/**
 * Represents a die with n sides that can be thrown to generate random numbers.
 */
public class Die {
    private int numSides;
    
    /**
     * Constructs a die with the specified number of sides.
     * 
     * @param n the number of sides on the die
     */
    public Die(int n) {
        numSides = n;
    }
    
    /**
     * Throws the die and returns a random number between 1 and the number of sides.
     * 
     * @return random integer in range [1..n]
     */
    public int throwDie() {
        return (int)(Math.random() * numSides) + 1;
    }
    
    /**
     * Returns a string representation of the die.
     * 
     * @return string showing the number of sides of the die
     */
    public String toString() {
        return "Die[sides=" + numSides + "]";
    }
    
    /**
     * Main method to test the Die class functionality.
     */
    public static void main(String[] args) {
        // Create a standard 6-sided die
        Die d6 = new Die(6);
        System.out.println("Created: " + d6);
        
        // Test by throwing it several times
        System.out.println("Five throws of a 6-sided die:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Throw " + (i+1) + ": " + d6.throwDie());
        }
        
        // Test with a different number of sides
        Die d20 = new Die(20);
        System.out.println("\nCreated: " + d20);
        
        // Test by throwing it several times
        System.out.println("Five throws of a 20-sided die:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Throw " + (i+1) + ": " + d20.throwDie());
        }
    }
}