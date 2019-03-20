package wyjątkikalkulator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                System.out.println("Give the first number:");
                a = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Give the mathemathical operator: +, -, *, /");
                operator = scanner.nextLine();

                System.out.println("Give the second number:");
                b = scanner.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("You put incorrect data, please start since the beginning.");
                scanner.nextLine();
            }
        }

        Calculator calc = new Calculator();
        double result = 0;
        boolean calculationComplete = false;

        try {
            result = calc.calculate(a, b, operator);
            calculationComplete = true;
        } catch (ArithmeticException | UnknownOperatorException e) {
            System.out.println(e.getMessage());
        }

        if (calculationComplete) {
            System.out.println(a + operator + b + " = " + result);
        } else {
            System.out.println("There is not possible to calculate the result of expression: " + a + operator + b);
        }
    }
}
