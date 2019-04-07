package kolekcje.arraylist;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }

        System.out.println("ints.get(50)= " + ints.get(50));
        System.out.println("The quantity of elements in the list: "+ints.size());
        System.out.println("I clear the table");
        ints.clear();
        System.out.println("The quantiy of elements in the list: "+ints.size());
    }
}
