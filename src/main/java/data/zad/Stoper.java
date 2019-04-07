package data.zad;
//Zadanie
//Napisz prosty stoper.
//
//Wyświetl na ekranie komunikat o tym, że w celu rozpoczęcia pomiaru należy wcisnąć Enter.
// Następnie na ekranie pojawia się podobny komunikat, że w celu zatrzymania pomiaru należy ponownie wcisnąć Enter.
//
//Na końcu wyświetl czas jaki udało Ci się zmierzyć w sekundach.

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Wciśnij ENTER, żeby rozpocząć pomiar");
            scanner.nextLine();
            Instant i1 = Instant.now();

            System.out.println("Wciśniej ENTER, żeby zatrzymać pomiar");
            scanner.nextLine();
            Instant i2 = Instant.now();

            Duration time = Duration.between(i1, i2);
            System.out.println("Czas, który upłynął: " +time.getSeconds());
        }
    }
}
