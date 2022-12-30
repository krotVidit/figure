package ru.figure.protject.Figure;

public class RectangleAndSquare {

    double length;
    double width;

    public RectangleAndSquare(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getAreaRectangleAndSquare() {
        double area = length * width;
        System.out.println("\nArea Rectangle: ");
        return area;
    }

    public double getPerimeterRectangleAndSquare() {
        double perimeter = (length * 2) + (width * 2);
        System.out.println("\nPerimeter Rectangle:");
        return perimeter;
    }

}
