package klasy_4.calculatorprzeciazeniemetod;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();


        System.out.println(calculator.add(2,7));
        System.out.println(calculator.add(12.0,1.0));
        System.out.println(calculator.add(3,5,8));
    }

}
