package petle;

//Zadanie
//Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb użytkownik chce wprowadzić.
// Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie. W programie wykorzystaj co
// najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic.


import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give how many numbers would you like add:");
        int howManyNumbersAdd = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You would like to add: " + howManyNumbersAdd + " numbers");

        double userNumber;
        double sumOfUserNumbers = 0;

        for (int i = 0; i < howManyNumbersAdd; i++) {
            System.out.println("Give the number: ");
            userNumber = scanner.nextDouble();
            sumOfUserNumbers += userNumber;
            scanner.nextLine();
        }


        //System.out.println("You choosen the following numbers: " + userNumber);
        System.out.println("The sum of choosen numbers by user is: " + sumOfUserNumbers);


    }
}
