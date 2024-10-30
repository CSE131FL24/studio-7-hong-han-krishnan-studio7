package studio7;

/**
 * Represents a fraction with numerator and denominator.
 * Provides basic fraction operations like addition, multiplication,
 * reciprocal, and simplification.
 */
public class Fraction {
    private int num;
    private int den;
    
    /**
     * Constructs a fraction with the specified numerator and denominator.
     * 
     * @param numerator the numerator of the fraction
     * @param denominator the denominator of the fraction
     */
    public Fraction(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }
    
    /**
     * Adds this fraction to another fraction.
     * 
     * @param other the fraction to add
     * @return a new fraction representing the sum
     */
    public Fraction add(Fraction other) {
        int newNum = (num * other.den) + (other.num * den);
        int newDen = den * other.den;
        return new Fraction(newNum, newDen);
    }
    
    /**
     * Multiplies this fraction by another fraction.
     * 
     * @param other the fraction to multiply by
     * @return a new fraction representing the product
     */
    public Fraction multiply(Fraction other) {
        int newNum = num * other.num;
        int newDen = den * other.den;
        return new Fraction(newNum, newDen);
    }
    
    /**
     * Creates the reciprocal of this fraction.
     * 
     * @return a new fraction that is the reciprocal
     */
    public Fraction reciprocal() {
        return new Fraction(den, num);
    }
    
    /**
     * Simplifies this fraction by dividing both numerator and denominator
     * by their greatest common divisor.
     * 
     * @return a new fraction that is simplified
     */
    public Fraction simplify() {
        int gcd = findGCD(Math.abs(num), Math.abs(den));
        return new Fraction(num/gcd, den/gcd);
    }
    
    /**
     * Finds the greatest common divisor of two numbers.
     * 
     * @param a first number
     * @param b second number
     * @return the greatest common divisor
     */
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    
    /**
     * Returns a string representation of the fraction.
     * 
     * @return string showing the fraction as numerator/denominator
     */
    public String toString() {
        return num + "/" + den;
    }
    
    /**
     * Main method to test the Fraction class functionality.
     */
    public static void main(String[] args) {
        // Create some test fractions
        Fraction f1 = new Fraction(1, 2);  // 1/2
        Fraction f2 = new Fraction(2, 3);  // 2/3
        
        // Test addition
        Fraction sum = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sum);
        System.out.println("Simplified: " + sum.simplify());
        
        // Test multiplication
        Fraction product = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + product);
        System.out.println("Simplified: " + product.simplify());
        
        // Test reciprocal
        Fraction r1 = f1.reciprocal();
        System.out.println("Reciprocal of " + f1 + " = " + r1);
        
        // Test with some fractions that need simplification
        Fraction f3 = new Fraction(4, 6);  // 4/6 should simplify to 2/3
        System.out.println(f3 + " simplified = " + f3.simplify());
    }
}