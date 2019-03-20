package klasaarrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        String[] names = {"Basia", "Kasia", "Wojtek", "Ania", "Michałek"};
        Integer[] numbers = {34, 1, 23, 76, 2, 55, 1, 2, 893};

        System.out.println("Names:  ");

        printArray(names);
        System.out.println();

        //sortowwanie
        System.out.println("Arrays.sort(numbers):");
        Arrays.sort(numbers);
        printArray(numbers);

        System.out.println("Arrays.sort(names):");
        Arrays.sort(names);
        printArray(names);
        System.out.println();


        //copyOf
        System.out.println("Numbers2, Arrays.copyOf()");
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        printArray(numbers);
        System.out.println();

        //equals-porównuje adresy
        System.out.println("Arrays.equals(numbers, numbers2):");
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println();


        //deepEquals-porównuje wartości
        System.out.println("Arrays.deepEquals(numbers, numbers2):");
        System.out.println(Arrays.deepEquals(numbers, numbers2));
        System.out.println();

        //fill
        System.out.println("Arrays.fill()");
        String[] strings = new String[5];
        Arrays.fill(strings, "Michałek");
        printArray(strings);


    }


    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
