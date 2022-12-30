package ru.figure.protject;

import ru.figure.protject.Figure.Circle;
import ru.figure.protject.Figure.RectangleAndSquare;
import ru.figure.protject.Figure.Triangle;

import java.util.Scanner;

public class InputAndOutputFigure {
    public void outputs_rectangle_calculations() {
        Scanner scanner = new Scanner(System.in);
        double oldCalculations = 0;

        System.out.println("To stop the program, enter \"stop\"");
        do {
            System.out.println("\nEnter the length");
            String stop = scanner.next();
            if (stop.equals("stop")) {
                System.out.println("go to the menu...");
                break;
            } else {

                double length = Double.parseDouble(stop);
                System.out.println("Enter the width");
                double width = scanner.nextDouble();
                if (width == length) {
                    System.out.println("A square has been introduced");
                    outputs_rectangle_calculations();
                    break;
                } else {
                    RectangleAndSquare rectangle = new RectangleAndSquare(length, width);
                    double currentCalculations = rectangle.getAreaRectangleAndSquare();
                    System.out.println(currentCalculations);
                    System.out.println(rectangle.getPerimeterRectangleAndSquare());
                    if (currentCalculations > oldCalculations) {
                        System.out.println("\nCurrent calculations are more: " + currentCalculations);
                    } else if (currentCalculations == oldCalculations) {
                        System.out.println("\nCalculations are even");
                    } else {
                        System.out.println("\nThe old calculations is larger: " + oldCalculations);
                    }
                    oldCalculations = currentCalculations;
                }
            }
        } while (true);
    }

    public void outputs_triangle_calculations() {
        Scanner scanner = new Scanner(System.in);
        double oldCalculations = 0;
        System.out.println("To stop the program, enter \"stop\"");
        do {
            System.out.println("\nEnter the side one ");
            String stop = scanner.next();
            if (stop.equals("stop")) {
                System.out.println("go to the menu...");
                break;
            } else {

                double sideOne = Double.parseDouble(stop);
                System.out.println("Enter the side two ");
                double sideTwo = scanner.nextDouble();
                System.out.println("Enter the width ");
                double width = scanner.nextDouble();
                Triangle triangle = new Triangle(width, sideOne, sideTwo);
                double currentCalculations = triangle.getSquareTriangle();
                System.out.println(currentCalculations);
                System.out.println(triangle.getPerimeter());
                if (currentCalculations > oldCalculations) {
                    System.out.println("\nCurrent calculations are more: " + currentCalculations);
                } else if (currentCalculations == oldCalculations) {
                    System.out.println("\nCalculations are even");
                } else {
                    System.out.println("\nThe old calculations is larger: " + oldCalculations);
                }
                oldCalculations = currentCalculations;
            }
        } while (true);
    }

    public void outputs_circle_calculations() {
        Scanner scanner = new Scanner(System.in);
        double oldCalculations = 0;

        System.out.println("To stop the program, enter \"stop\"");
        do {
            System.out.println("\nEnter the radius ");
            String stop = scanner.next();
            if (stop.equals("stop")) {
                System.out.println("go to the menu...");
                break;
            } else {

                double radius = Double.parseDouble(stop);
                Circle circle = new Circle(radius);
                double currentCalculations = circle.getSquareCircle();
                System.out.println(currentCalculations);
                System.out.println(circle.getPerimeterCircle());
                if (currentCalculations > oldCalculations) {
                    System.out.println("\nCurrent calculations are more: " + currentCalculations);
                } else if (currentCalculations == oldCalculations) {
                    System.out.println("\nCalculations are even");
                } else {
                    System.out.println("\nThe old calculations is larger: " + oldCalculations);
                }
                oldCalculations = currentCalculations;
            }
        } while (true);
    }

    public void outputs_square_calculations() {
        Scanner scanner = new Scanner(System.in);
        double oldCalculations = 0;

        System.out.println("To stop the program, enter \"stop\"");
        do {
            System.out.println("\nEnter the length ");
            String stop = scanner.next();
            if (stop.equals("stop")) {
                System.out.println("go to the menu...");
                break;
            } else {

                double length = Double.parseDouble(stop);
                System.out.println("Enter the width ");
                double width = scanner.nextDouble();
                if (width == length) {
                    RectangleAndSquare rectangle = new RectangleAndSquare(length, width);
                    double currentCalculations = rectangle.getAreaRectangleAndSquare();
                    System.out.println(currentCalculations);
                    System.out.println(rectangle.getPerimeterRectangleAndSquare());
                    if (currentCalculations > oldCalculations) {
                        System.out.println("\nCurrent calculations are more: " + currentCalculations);
                    } else if (currentCalculations == oldCalculations) {
                        System.out.println("\nCalculations are even");
                    } else {
                        System.out.println("\nThe old calculations is larger: " + oldCalculations);
                    }
                    oldCalculations = currentCalculations;

                } else {
                    System.out.println("A rectangle is entered");
                    outputs_square_calculations();
                    break;
                }
            }
        } while (true);
    }
}
