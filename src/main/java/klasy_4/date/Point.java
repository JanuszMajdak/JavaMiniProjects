package klasy_4.date;

//Punkt reprezentowany przez klasę Point powinien zawierać dwa pola reprezentujące współrzędną X oraz Y.
// Reprezentacja współrzędnych powinna być całkowitoliczbowa. Klasa powinna być zgodna ze specyfikacją JavaBeans.
// Klasa powinna posiadać konstruktor bezparametrowy oraz drugi, pozwalający ustawić odpowiednie współrzędne w trakcie tworzenia obiektu.
//
//Klasa PointController posiada cztery metody, które pozwalają manipulować położeniem punktu:
//
//-addX() - zwiększa zmienną x o 1,
//
//-minusX() - zmniejsza zmienną x o 1,
//
//-addY() - zwiększa zmienną y o 1,
//
//-minusY() - zmniejsza zmienną y o 1.
//
//Każda z metod przyjmuje jako parametr obiekt typu Point i zmienia jego pola x oraz y.
//
//Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane w trzeciej klasie o nazwie PointApplication.
public class Point {
    private int x;
    private int y;


    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
