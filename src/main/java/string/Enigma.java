package string;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the number of words:");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();


        String[] words = new String[wordsNumber];

        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("Give the word:");
            words[i] = scanner.nextLine();
        }


        StringBuilder build = new StringBuilder();

        for (int i = 0; i < wordsNumber; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("The new word is:" + build.toString());

    }

}
