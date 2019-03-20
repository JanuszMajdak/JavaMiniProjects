package klasy_4.calculator;

//Zadanie
//Napisz program-Calculator operujący na liczbach zmiennoprzecinkowych typu double , który będzie składał się z dwóch klas
// w osobnych plikach:
//
//Calculator.java - Klasa tu zdefiniowana powinna zawierać metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie,
// odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty powinny przyjmować oraz wartość jakiego typu powinny zwracać
//Calculate.java - tutaj umieść klasę testową z metodą main(). Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double,
// utwórz obiekt klasy Calculator i za jego pomocą oblicz wynik różnych działań matematycznych.
//Wszystkie wyniki działań wyświetl na ekranie.


public class Calculator {



    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply (double x, double y){
        return x*y;
    }
    public double divide (double x, double y){
        return x/y;
    }

}
