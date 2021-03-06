package libraryproject.model;

//tytuł, autora, rok wydania, ilość stron, nazwę wydawcy i numer isbn

import java.util.Objects;

public class Book extends Publication {

    private String author;
    private int pagesNumber;
    private String isbn;

    //konstruktor

    public Book(String title, String author, int year, int pagesNumber, String publisher, String isbn) {

        super(year, title, publisher);
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{"+super.toString() +
                "author='" + author + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber &&
                author.equals(book.author) &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pagesNumber, isbn);
    }
}
