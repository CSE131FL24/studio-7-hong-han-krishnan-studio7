package studio7;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Represents a rectangle with length and width dimensions.
 * Provides functionality to calculate area, perimeter, compare sizes,
 * and determine if the rectangle is a square.
 */
public class Rectangle {
    private double len;
    private double wid;
    
    /**
     * Constructs a rectangle with the specified length and width.
     * 
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double length, double width) {
        len = length;
        wid = width;
    }
    
    /**
     * Calculates the area of the rectangle.
     * 
     * @return the area of the rectangle
     */
    public double getArea() {
        return len * wid;
    }
    
    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (len + wid);
    }
    
    /**
     * Determines if this rectangle is smaller than another rectangle based on area.
     * 
     * @param other the rectangle to compare with
     * @return true if this rectangle's area is smaller than the other rectangle's area
     */
    public boolean isSmallerThan(Rectangle other) {
        return getArea() < other.getArea();
    }
    
    /**
     * Determines if this rectangle is a square.
     * 
     * @return true if the length equals the width
     */
    public boolean isSquare() {
        return len == wid;
    }
    
    /**
     * Draws the rectangle using StdDraw library.
     * Assumes the rectangle is drawn from the center.
     * 
     * @param x the x-coordinate of the center
     * @param y the y-coordinate of the center
     */
    public void draw(double x, double y) {
        StdDraw.rectangle(x, y, len/2, wid/2);
    }
    
    /**
     * Returns a string representation of the rectangle.
     * 
     * @return a string containing the rectangle's dimensions, area, and perimeter
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + len + ", width=" + wid + 
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + 
               ", isSquare=" + isSquare() + "]";
    }
    
    
    /**
     * Main method to test the Rectangle class functionality.
     */
    public static void main(String[] args) {
        // Test case 1: Regular rectangle
        Rectangle rect1 = new Rectangle(5, 3);
        System.out.println("Rectangle 1: " + rect1);
        
        // Test case 2: Square
        Rectangle rect2 = new Rectangle(4, 4);
        System.out.println("Rectangle 2: " + rect2);
        
        // Test comparison
        System.out.println("Is Rectangle 1 smaller than Rectangle 2? " + rect1.isSmallerThan(rect2));
        
        // Test drawing
        StdDraw.setScale(-10, 10);
        rect1.draw(0, 0);  // Draw first rectangle at center
        rect2.draw(0, 5);  // Draw second rectangle above the first
    }
}