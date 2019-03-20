package wprowadzaniedanych;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Give the first number:");
        Scanner scanner = new Scanner(System.in);
        double firstFigure = scanner.nextDouble();
        System.out.println("You choosen: " + firstFigure);
        scanner.nextLine();

        System.out.println("Choose the action: 1-ADD, 2-MINUS, 3-MULTIPLY, 4-DIVIDE");

        int choosenAction = scanner.nextInt();
        System.out.println("You choosen: " + choosenAction);
        scanner.nextLine();

        System.out.println("Choose the second figure:");
        double secondFigure = scanner.nextDouble();
        System.out.println("You choosen: " + secondFigure);
        scanner.nextLine();


        MathematicalActions mathAction = new MathematicalActions();

        switch (choosenAction) {
            case 1:
                mathAction.add(firstFigure, secondFigure);
                System.out.println("Add result=" + mathAction.addResult);
                break;
            case 2:
                mathAction.minus(firstFigure, secondFigure);
                System.out.println("Deduction result=" + mathAction.minusResult);
                break;
            case 3:
                mathAction.multiply(firstFigure, secondFigure);
                System.out.println("Multiplication result=" + mathAction.multiplyResult);
                break;

            case 4:
                mathAction.division(firstFigure, secondFigure);
                System.out.println("Division result=" + mathAction.divisionResult);
                break;
            default:
                System.out.println("Please choose the numbers between: 1-4");
        }

    }
}
