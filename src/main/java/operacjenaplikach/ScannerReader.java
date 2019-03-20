package operacjenaplikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scanner=new Scanner(file);

        int lines=0;

        while(scanner.hasNextLine()){
            String name=scanner.nextLine();
            System.out.println(name);
            lines++;
        }

        System.out.println("The number of rows int the "+fileName+ " is "+lines);
        scanner.close();

    }
}
