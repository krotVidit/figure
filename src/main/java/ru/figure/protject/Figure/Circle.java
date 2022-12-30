package ru.figure.protject.Figure;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquareCircle() {
        double area = Math.PI * radius * radius;
        System.out.println("\nArea of the circle: ");
        return area;
    }

    public double getPerimeterCircle() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("\nPerimeter of the circle: ");
        return perimeter;
    }
}
