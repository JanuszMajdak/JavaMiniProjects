package interfejsycomparablecomparator.comparator.zad;

//  Zadanie
//Napisz program, w którym utworzysz tablicę 20 dowolnych liczb całkowitych, a następnie
// posortujesz tablicę w porządku rosnącym i malejącym, za każdym razem wyświetlając wynik posortowania na ekranie.
// Wykorzystaj interfejs Comparator i anonimowe klasy wewnętrzne.


import libraryproject.model.Magazine;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class NumberComparator {
    public static void main(String[] args) {


        Random random = new Random();

        Integer[] numbers = new Integer[50];
        //before sorting
        System.out.println("The numbers before sorting:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(random.nextInt(220));
            System.out.print(numbers[i] + ";");
        }

        System.out.println();
        System.out.println("The display of the table before sorting:");
        ;
        System.out.println(Arrays.toString(numbers));

//after sorting
        Arrays.sort(numbers);
        System.out.println("The numbers after increasing sorting:");
        System.out.println(Arrays.toString(numbers));


        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return-(o1.compareTo(o2));
            }


        });
        System.out.println("The numbers after decreasing sorting:");
        System.out.println(Arrays.toString(numbers));
    }
}