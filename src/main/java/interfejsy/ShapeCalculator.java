package interfejsy;

import sun.plugin.dom.css.Rect;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static interfejsy.Shape.RECTANGLE;

public class ShapeCalculator {

    private Scanner scanner = new Scanner(System.in);

    public ShapeCalculator() {
        scanner.useLocale(Locale.US);
    }

    public void closeScanner() {
        scanner.close();
    }


    public Rectangle readRectangleData() throws InputMismatchException {

        System.out.println("Give the information about rectangle:");
        System.out.println("Give the lenght of side A:");
        double a = 0;
        double b = 0;

        try {
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Give the lenght of side B:");
            b = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }
        return new Rectangle(a, b);
    }


    public Circle readCircleData() throws InputMismatchException {
        System.out.println("Give the information about circle:");
        System.out.println("Give the value of the radius:");
        double radius = 0;

        boolean correctCircle = false;

        while (!correctCircle) {
            try {
                radius = scanner.nextDouble();
                scanner.nextLine();
                correctCircle = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                throw e;
            }
        }
        return new Circle(radius);
    }


    public Triangle readTriangleData() throws InputMismatchException {
        System.out.println("Give the information about triangle:");
        System.out.println("Give the lenght of side A:");
        double a = 0;
        double b = 0;
        double c = 0;
        double height = 0;

        try {
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Give the lenght of side B:");
            b = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Give the lenght of side C:");
            c = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Give the height of the traingle:");
            height = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Triangle(height, a, b, c);

    }


    public Shape createShape() throws NoSuchElementException, InputMismatchException {


        try {
            int shapeType = scanner.nextInt();
            scanner.nextLine();

            switch (shapeType) {
                case Shape.RECTANGLE:
                    return readRectangleData();
                case Shape.CIRCLE:
                    return readCircleData();
                case Shape.TRIANGLE:
                    return readTriangleData();
                default:
                    throw new NoSuchElementException();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

    }


}


