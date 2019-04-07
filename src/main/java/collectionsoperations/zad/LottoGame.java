package collectionsoperations.zad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        List<Integer> userNumbers = new ArrayList<>();

        System.out.println("Witamy w losowaniu lotto. Podaj swoje typy");
        try (Scanner scanner = new Scanner(System.in);) {
            int numbers = 6;
            while (numbers > 0) {
                System.out.println("Podaj kolejną liczbę:");
                userNumbers.add(scanner.nextInt());
                scanner.nextLine();
                numbers--;
            }

        }

        Lotto lotto=new Lotto();
        lotto.randomize();
        int found=lotto.checkResult(userNumbers);
        System.out.println("Trafione liczby: "+found);
    }
}
