package strumienie.zad2;
//Zadanie
//W załączniku znajduje się plik z tekstem lorem ipsum. Wczytaj wszystkie słowa osobno do listy słów,
// a następnie wykorzystując strumienie:
//
//usuń wszystkie przecinki i kropki doklejone do słów,
//wyświetl liczbę słów rozpoczynających się literą "s" oraz ile słów składa się z 5 znaków.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {
    public static void main(String[] args) throws IOException {

        final String FILE_NAME = "loremipsum-129.txt";
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        List<String> words = new ArrayList<>();
        String tmp = null;

        while ((tmp = reader.readLine()) != null) {
            words.addAll(Arrays.asList(tmp.split(" ")));
        }

        words = words.stream()
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream()
                .filter((s -> s.startsWith("s")))
                .peek(s -> System.out.println(s + " "))
                .count();
        System.out.println();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.println(s + " "))
                .count();
        System.out.println();

        long numberOfWors=words.stream()
                .count();

        System.out.println("Liczba wyrazów na 's':" + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);
        System.out.println("Liczba wszystkich słów: "+numberOfWors);
        reader.close();
    }
}
