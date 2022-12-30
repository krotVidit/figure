package ru.figure.protject;

import java.util.Scanner;

public class Menu {
    private int showsMenuFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ________________
                Select an action
                ________________""");
        System.out.println("1.Triangle\n2.Circle\n3.Square\n4.Rectangle\n5.Stop program");
        return scanner.nextInt();
    }

    public int getShowsMenuFigure() {
        return this.showsMenuFigure();
    }

    public void implementsMenu() {
        switch (getShowsMenuFigure()) {
            case 1:
                new InputAndOutputFigure().outputs_triangle_calculations();
                new Menu().implementsMenu();
                break;
            case 2:
                new InputAndOutputFigure().outputs_circle_calculations();
                new Menu().implementsMenu();
                break;
            case 3:
                new InputAndOutputFigure().outputs_square_calculations();
                new Menu().implementsMenu();
                break;
            case 4:
                new InputAndOutputFigure().outputs_rectangle_calculations();
                new Menu().implementsMenu();
            case 5:
                break;
            default:
                System.out.println("\nEntered an incorrect number, enter a number from the menu\n");
                new Menu().implementsMenu();
                break;


        }
    }
}
