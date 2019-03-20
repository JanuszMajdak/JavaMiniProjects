package klasy_4.controller;
import klasy_4.date.Point;

//Klasa PointController posiada cztery metody, które pozwalają manipulować położeniem punktu:
////
////-addX() - zwiększa zmienną x o 1,
////
////-minusX() - zmniejsza zmienną x o 1,
////
////-addY() - zwiększa zmienną y o 1,
////
////-minusY() - zmniejsza zmienną y o 1.
////
////Każda z metod przyjmuje jako parametr obiekt typu Point i zmienia jego pola x oraz y.
////
////Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane w trzeciej klasie o nazwie PointApplication.



public class PointController {

    public void addX(Point p) {
        p.setX(p.getX() + 1);
    }

    public void minusX(Point p) {
        p.setX(p.getX() - 1);
    }

    public void addY(Point p) {
        p.setY(p.getY() + 1);
    }

    public void minusY(Point p) {
        p.setY(p.getY() - 1);
    }


}



