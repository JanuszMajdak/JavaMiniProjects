package wyjątkikalkulator;
//Zadanie
//Napisz kalkulator operujący na liczbach zmiennoprzecinkowych, który będzie pobierał dane od użytkownika i będzie pozwalał
// obliczyć wyniki dodawania, odejmowania, mnożenia i dzielenia. Program powinien być odporny na błędnie wprowadzane dane i
// prosić użytkownika o korektę. Zwróć także uwagę na fakt, że w przypadku dzielenia przez 0 zostanie wygenerowany wyjątek ArithmeticException,
// który również należy obsłużyć i wyświetlić odpowiedni komunikat użytkownikowi.
//
//Zdefiniuj również klasę wyjątku UnknownOperatorException, który będzie generowany w przypadku, gdy użytkownik wprowadzi operator
// arytmetyczny inny niż +, -, * lub /.


public class Calculator {

    private final static String PLUS = "+";
    private final static String MINUS = "-";
    private final static String MULTIPLY = "*";
    private final static String DIVIDE = "/";

    public double calculate(double a, double b, String operator) {

        double result = 0;

        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("You can't divide by zero");
                }
                result = a / b;
                break;
            default:
                throw new UnknownOperatorException("You use not defined mathematical operator");
        }
        return result;
    }

}
