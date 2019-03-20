package interfejsy;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("You put the data in wrong format. Please try again.");
            } catch (NoSuchElementException e) {
                System.out.println("Chosen shape identifier is not correct (out of range). Please try again");
            }

        }
        System.out.println(shape);
        shapeCalc.closeScanner();

    }

    private static void printOptions() {
        System.out.println("Choose the figure, which area and perimiter you would like to calculate:");
        System.out.println(Shape.RECTANGLE + " - rectangle");
        System.out.println(Shape.CIRCLE + " - circle");
        System.out.println(Shape.TRIANGLE + " -triangle");
    }


}
