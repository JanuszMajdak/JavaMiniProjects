package referencjedometod.zad;
//Zadanie
//Stwórz listę 5 imion w losowej kolejności. Korzystając z metody Collections.sort() oraz referencji do
// metody String.compareToIgnoreCase() posortuj ją w porządku rosnącym, a następnie wyświetl wynik na ekranie.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Ola", "Darek", "Beata");

/*        Collections.sort(names, String::compareToIgnoreCase);

        for(String name:names){
            System.out.println(name);
        }*/

        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

    }
}
