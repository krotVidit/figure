package ru.figure.protject.Figure;

public class Triangle {
    double width;
    double sideOne;
    double sideTwo;

    public Triangle(double width, double sideOne, double sideTwo) {
        this.width = width;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSquareTriangle() {
        double pp = (width + sideOne + sideTwo) / 2.0;
        double area = Math.sqrt(pp * (pp - sideOne) * (pp - sideTwo) * (pp - width));
        System.out.println("\nThe area of the triangle: ");
        return area;
    }

    public double getPerimeter() {
        double perimeter = width + sideOne + sideOne;
        System.out.println("\nTriangle perimeter: ");
        return perimeter;
    }
}
