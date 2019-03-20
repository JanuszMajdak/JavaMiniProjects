package klasy_4.przeliczaniejednostek;

public class Test {
    public static void main(String[] args) {

        System.out.println("Length calculation:");
        Lenght lenght=new Lenght();

        double meters=15;

        System.out.println(meters+"m="+lenght.metersForCentimetres(meters)+" cm="+lenght.metersForMilimeters(meters)+ "mm");





        System.out.println("Time calculation:");
        Time time=new Time();
        int hours=2;
        int minutes;

        System.out.println(hours+"hr="+time.hoursForMinutes(hours)+"min="+time.minutesForSeconds(hours)+"sec="+time.secondsForMiliseconds(hours)+"miliseconds");
    }
}
