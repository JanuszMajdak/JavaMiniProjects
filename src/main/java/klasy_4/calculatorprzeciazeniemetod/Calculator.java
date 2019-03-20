package klasy_4.calculatorprzeciazeniemetod;


//Zadanie
//Napisz program - kalkulator, który będzie składał się z dwóch klas:
//
//Calculator,
//CalcTest.
//W klasie Calculator zdefiniuj metody add (dodaj) i subtract (odejmij) w kilku przeciążonych wersjach,
// aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
//
//W klasie CalcTest przetestuj działanie klasy Calculator.

public class Calculator {


    public double add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double add(int a, int b, int c){
        return a+b+c;
    }


}
