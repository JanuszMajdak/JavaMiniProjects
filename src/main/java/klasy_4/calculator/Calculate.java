package klasy_4.calculator;

public class Calculate {
    public static void main(String[] args) {

        double x=10.0;
        double y=12.0;


        Calculator calculator=new Calculator();


        System.out.println("Sum"+calculator.add(x,y));
        System.out.println(calculator.divide(x,y));
        System.out.println(calculator.multiply(x,y));
        System.out.println(calculator.subtract(x,y));


    }
}
