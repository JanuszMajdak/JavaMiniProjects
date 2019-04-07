package kolekcje.arraylist.zad;

//Napisz program, który pozwoli zsumować dowolną ilość liczb od użytkownika.
// Aplikacja powinna przerwać wczytywanie liczb, gdy użytkownik wprowadzi polecenie "exit".
//
//Po wczytaniu liczb wyświetl je na ekranie oraz podaj wynik ich sumowania
// w postaci "a + b + c + ... + N = wynik". Do wczytywania danych napisz odpowiednią metodę rekurencyjną.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {

    public final static String EXIT = "exit";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);

    }


    static void fillList(List<Double> list) {
        System.out.println("Give the next figure/or put \"exit:\"");

        String input = scanner.nextLine();
        if (input.equals(SumNumbers.EXIT)) {
            return;
        }
        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch (NumberFormatException e) {
            System.out.println("The figure format is incorrect.");
        }

        fillList(list);
    }

    static void printData(List<Double>list){
        StringBuilder sb=new StringBuilder();
        double sum=0;
        for(double d:list){
            sb.append(d);
            sb.append('+');
            sum+=d;
        }
        sb.replace(sb.length()-1,sb.length(),"=");
        sb.append(sum);
        System.out.println(sb.toString());
    }

}
