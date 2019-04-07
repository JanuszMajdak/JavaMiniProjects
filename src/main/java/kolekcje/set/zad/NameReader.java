package kolekcje.set.zad;

//W załączonym pliku namespl.txt znajduje się lista imiona, każde w nowej linii. Problem w tym, że imiona
// się powtarzają, a my w programie będziemy potrzebowali jedynie unikalnej listy dostępnych imion.
// Dodatkowo chcielibyśmy, aby imiona były automatycznie posortowane w kolejności odwrotnej niż alfabetyczna.
//
//Po wybraniu odpowiedniego zbioru danych wyświetl na ekranie ilość imion w zbiorze, a także pierwszy i ostatni element.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try (Scanner scanner = new Scanner(new File("namespl.txt"))) {
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("The quanity of names in the set: " + names.size());
        System.out.println("The first name is: " + names.first());
        System.out.println("The last name is: " + names.last());

    }


}
