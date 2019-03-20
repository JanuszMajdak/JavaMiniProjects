package libraryproject.io;

import libraryproject.model.Book;
import libraryproject.model.Magazine;

import java.util.Scanner;

public class DataReader {
    Scanner scanner = new Scanner(System.in);

    //metoda getInt()
    public int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }


    public Book readAndCreateBook() {
        System.out.println("Title:");
        String title = scanner.nextLine();

        System.out.println("Author:");
        String author = scanner.nextLine();

        System.out.println("Release date:");
        int releaseDate = getInt();


        System.out.println("Pages number:");
        int pagesNumber = getInt();

        System.out.println("The publisher name:");
        String publisherName = scanner.nextLine();

        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();


        return new Book(title, author, releaseDate, pagesNumber, publisherName, isbn);
    }


    public Magazine readAndCreateMagazine() {
        System.out.println("Title:");
        String title = scanner.nextLine();

        System.out.println("Publisher:");
        String publisher = scanner.nextLine();

        System.out.println("Language:");
        String language = scanner.nextLine();

        System.out.println("Release year:");
        int year = getInt();

        System.out.println("Release month:");
        int month = getInt();

        System.out.println("Release day:");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }


}


