package klasy_4.przeliczaniejednostek;

//W kolejnej klasie zdefiniuj metody związane z przeliczaniem czasu:
//
//godzin na minuty
//minut na sekundy
//sekund na milisekundy


public class Time {


int minutesNumber;
int secondsNumber;

    public int hoursForMinutes(int hours) {
        return  minutesNumber=hours * 60;
    }

    public int minutesForSeconds(int minutes){
        return minutesNumber*60;
    }

    public int secondsForMiliseconds(int seconds){
        return minutesNumber*60*100;
    }

}
