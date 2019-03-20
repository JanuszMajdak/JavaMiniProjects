package wielkieliczby;

//zwraca sumę liczb z pliku: numbers.txt, który to plik utworzyłem wcześniej w głównym katalogu projektu

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {

        String fileName = "numbers.txt";

        int a = 0;
        int b = 0;
        int c = 0;

        BigInteger aBig = null;
        BigInteger bBig = null;

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
        ) {
            a = Integer.valueOf(br.readLine());
            b = Integer.valueOf(br.readLine());
            c = Integer.valueOf(br.readLine());

            aBig = new BigInteger(br.readLine());
            bBig = new BigInteger(br.readLine());

            System.out.println("a+b+c = " + (a + b + c));
            System.out.println("aBig + bBig =" + (aBig.add(bBig)));
        } catch (FileNotFoundException e) {
            System.out.println("The file wasn't found");
        } catch (IOException e) {
            System.out.println("The reading data file error");
        }
    }

}
