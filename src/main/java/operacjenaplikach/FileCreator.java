package operacjenaplikach;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {

        String fileName="testFile.txt";
        File file=new File(fileName);

        boolean fileExists= file.exists();
        if(!fileExists){
            try {
                fileExists=file.createNewFile();
            } catch (IOException e) {
                System.out.println("It was not possible to create a file");;
            }
        }

        if(fileExists){
            System.out.println("File "+ fileName+ " exists or has already been created.");
        }





    }
}
