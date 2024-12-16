package xyz.ivan.skills.oop.medium._03;

// Task: Design an inheritance hierarchy for shapes
// Description:
// Create an abstract class Shape with methods get_area() and get_perimeter(), which must be implemented by subclasses.
// Create two subclasses:
// Rectangle: requires width and height
// Circle: requires radius
// Implement methods to calculate their respective areas and perimeters.
// Ensure all methods are called in Main.

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.get_area());
        System.out.println("Rectangle Perimeter: " + rectangle.get_perimeter());

        Shape circle = new Circle(7);
        System.out.println("Circle Area: " + circle.get_area());
        System.out.println("Circle Perimeter: " + circle.get_perimeter());
    }
}

abstract class Shape {
    abstract double get_area();
    abstract double get_perimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double get_area() {
        return width * height;
    }

    @Override
    double get_perimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double get_area() {
        return Math.PI * radius * radius;
    }

    @Override
    double get_perimeter() {
        return 2 * Math.PI * radius;
    }
}
