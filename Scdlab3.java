package scdlab3;

import java.util.Scanner;

class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    // Constructor with default values
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with specified values
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter for Length
    public double getLength() {
        return length;
    }

    // Setter for Length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    // Getter for Width
    public double getWidth() {
        return width;
    }

    // Setter for Width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    // Method to calculate Perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate Area
    public double calculateArea() {
        return length * width;
    }
}

public class Scdlab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println("Area: " + rect1.calculateArea());
        
        // Test constructor with parameters
        System.out.println("\nCustom Rectangle:");
        Rectangle rect2 = new Rectangle(5.5, 10.0);
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println("Area: " + rect2.calculateArea());

        // Test setting new values
        System.out.println("\nUpdating Rectangle Dimensions:");
        rect2.setLength(7.0);
        rect2.setWidth(3.5);
        System.out.println("Updated Length: " + rect2.getLength());
        System.out.println("Updated Width: " + rect2.getWidth());
        System.out.println("Updated Perimeter: " + rect2.calculatePerimeter());
        System.out.println("Updated Area: " + rect2.calculateArea());

        // Test invalid values
        try {
            rect2.setLength(21.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nException: " + e.getMessage());
        }

        try {
            rect2.setWidth(-2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
