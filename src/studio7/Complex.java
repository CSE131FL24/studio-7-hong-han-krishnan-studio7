package studio7;

/**
 * Represents a complex number with real and imaginary parts.
 * Supports addition and multiplication of complex numbers.
 */
public class Complex {
    private double real;
    private double imag;
    
    /**
     * Constructs a complex number with given real and imaginary parts.
     * 
     * @param realPart the real part of the complex number
     * @param imagPart the imaginary part of the complex number
     */
    public Complex(double realPart, double imagPart) {
        real = realPart;
        imag = imagPart;
    }
    
    /**
     * Adds this complex number to another complex number.
     * 
     * @param other the complex number to add
     * @return a new complex number representing the sum
     */
    public Complex add(Complex other) {
        double newReal = real + other.real;
        double newImag = imag + other.imag;
        return new Complex(newReal, newImag);
    }
    
    /**
     * Multiplies this complex number by another complex number.
     * For (a+bi)×(c+di), result is (ac−bd)+(ad+bc)i
     * 
     * @param other the complex number to multiply by
     * @return a new complex number representing the product
     */
    public Complex multiply(Complex other) {
        double newReal = (real * other.real) - (imag * other.imag);
        double newImag = (real * other.imag) + (imag * other.real);
        return new Complex(newReal, newImag);
    }
    
    /**
     * Returns a string representation of the complex number.
     * 
     * @return string in the form "a + bi" or "a - bi"
     */
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
    
    /**
     * Main method to test the Complex class functionality.
     */
    public static void main(String[] args) {
        // Create some test complex numbers
        Complex c1 = new Complex(3, 2);    // 3 + 2i
        Complex c2 = new Complex(1, 4);    // 1 + 4i
        
        // Test addition
        Complex sum = c1.add(c2);
        System.out.println("(" + c1 + ") + (" + c2 + ") = " + sum);
        
        // Test multiplication
        Complex product = c1.multiply(c2);
        System.out.println("(" + c1 + ") × (" + c2 + ") = " + product);
        
        // Test with negative numbers
        Complex c3 = new Complex(2, -3);   // 2 - 3i
        System.out.println("\nTesting with negative imaginary part:");
        System.out.println(c3);
        
        // More tests
        Complex sum2 = c1.add(c3);
        Complex product2 = c1.multiply(c3);
        System.out.println("(" + c1 + ") + (" + c3 + ") = " + sum2);
        System.out.println("(" + c1 + ") × (" + c3 + ") = " + product2);
    }
}