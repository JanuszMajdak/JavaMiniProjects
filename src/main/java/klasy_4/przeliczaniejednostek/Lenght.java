package klasy_4.przeliczaniejednostek;

//Stwórz aplikację, która będzie służyła do przeliczania jednostek. Zdefiniuj klasę, która będzie posiadała metody do
// przeliczania jednostek metrycznych:
//
//metrów na centymetry
//metrów na milimetry
//centymetrów na metry
//milimetrów na metry


public class Lenght {

    public double metersForCentimetres(double meters) {
        return meters * 100;
    }


    public double metersForMilimeters(double meters) {
        return meters * 1000;
    }


    public double centimetresForMeters(double centimetres) {
        return centimetres / 100;
    }

    public double millimetresForMeters(double millimeters) {
        return millimeters / 1000;
    }


}
