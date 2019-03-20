package rekurencja;

public class Silnia {
    public static void main(String[] args) {

        int factArg = 15;
        int result = factorial(factArg);
        System.out.println("Factorial " + factArg + " = " + result);
    }

    public static int factorial(int n) {

        return n>1?n*factorial(n-1):1;
    }
}

