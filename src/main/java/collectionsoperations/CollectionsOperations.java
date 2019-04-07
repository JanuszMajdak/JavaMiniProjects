package collectionsoperations;

import java.util.*;

public class CollectionsOperations {
    public static void main(String[] args) {
        String sentence = "Tak wygląda super życie na tej planecie, na , na , na a jak!";

        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista orginalna: ");
        printCollection(words);

        //wymieszanie
        Collections.shuffle(words);
        System.out.println("Lista shuffle");
        printCollection(words);


        //sortowanie
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista sortowana");
        printCollection(words);

        //wyszukiwanie binarne
        int position = Collections.binarySearch(words, "na");
        System.out.println("Słowo\"na\"występuje na liście na miejscu: " + position);
        //ilość wystąpień
        int freq = Collections.frequency(words, "na");
        System.out.println("Słowo\"na\" występuje na liście "+freq +" razy.");

        //najmniejszy element w liście
        System.out.println("Najmniejszy element w liście to: "+Collections.min(words));
    }


    private static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + ";");
        }
        System.out.println();
    }


}

