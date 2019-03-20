package petle;

import java.util.Scanner;

public class EvenNumber {

    public void isNumberEven(double figure) {
        if (figure % 2 == 0) {
            System.out.println("The number: " + figure + " is even(czyli parzysta).");

        } else {
            System.out.println("The number: " + figure + " is odd(czyli nieparzysta)");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Give the number: ");
            double figure = scanner.nextDouble();

            scanner.nextLine();


            EvenNumber evenNumber = new EvenNumber();
            evenNumber.isNumberEven(figure);
        }

        int[]numbers={3,6,7,8,9,11,12};
        for(int tmp:numbers){
            System.out.print(tmp+",");
        }



    }
}
