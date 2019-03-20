package libraryproject.app;

public enum Option {

    EXIT(0, "Exit from programme"),
    ADD_BOOK(1, "Adding a book"),
    ADD_MAGAZINE(2, "Adding magazine/newspaper"),
    PRINT_BOOKS(3, "Displaying the available books"),
    PRINT_MAGAZINES(4, "Displaying the available magazines/newspapers");

    private int value;
    private String description;


    private Option(int value, String description) {
        this.value = value;
        this.description = description;
    }


    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

//przekształca inta  na wartość enuma Option

    //Istotna jest także metoda createFromInt(int option), która pozwala przekształcić wartość typu int
    // na odpowiednią wartość typu Option. Wykorzystujemy tutaj metodę values(), która zwraca tablicę wszystkich wartości,
    // a ponieważ kolejne naszej opcje numerujemy od 0, to zwracamy po prostu odpowiedni element tej tablicy.

    static Option createFromInt(int option) {
        return Option.values()[option];
    }

}
