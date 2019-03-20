package enumprzyklad;

//Zadanie
//Napisz prostą aplikację, która będzie symulowała pizzerię. Stwórz dwie klasy:
//
//Z definicją typu enum o nazwie Pizza, który może przyjmować wartość:
// MARGHERITA (sos pomidorowy + ser),
// CAPRICIOSA (sos pomidorowy + ser + pieczarki)
// lub PROSCIUTTO (sos pomidorowy + ser + szynka).

// Typ Pizza powinien przechowywać informacje o każdym składniku osobno, pozwalać odczytać informację
// o każdym składniku, a także przesłania metodę toString()

//Klasę Pizzeria, w której wyświetlisz użytkownikowi możliwe do wyboru pizze, wczytasz od niego tę pizzę,
// którą chce, a na końcu potwierdzisz zamówienie.

//Wykorzystaj w programie jak najwięcej funkcjonalności jakie daje wykorzystanie typu enum.


public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;


    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    @Override
    public String toString() {
        String result = this.name() + "(";
        if (tomatoSauce) {
            result = result + " tomato sauce";
        }
        if (cheese) {
            result = result + ", cheese";
        }

        if (mushrooms) {
            result = result + ", mushrooms";
        }
        if (ham) {
            result = result + ", ham";
        }
        result = result + ")";

        return result;
    }
}
