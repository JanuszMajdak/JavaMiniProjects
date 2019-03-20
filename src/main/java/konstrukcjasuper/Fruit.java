package konstrukcjasuper;


//Zadanie
//Napisz prosty program, w którym stworzysz prostą hierarchię klas reprezentujących owoce w sklepie.
// Powinny istnieć co najmniej dwie klasy:
//
//Fruit (klasa nadrzędna) posiadająca konstruktor domyślny oraz metodę printInfo(), która wyświetli informację o kategorii produktu, czyli "Owoc"
//Apple (klasa reprezentująca jabłko, dziedzicząca po klasie Fruit). Posiada pole przechowujące informację o odmianie, konstruktor z
// jednym parametrem pozwalający zainicjować to pole oraz nadpisuje metodę printInfo(), która wyświetla informację z klasy nadrzędnej,
// a także o tym, że jest jabłkiem konkretnej odmiany. Wykorzystaj w tej klasie co najmniej raz instrukcję super.
//W klasie GroceryShop (sklep spożywczy) utwórz obiekt klasy Apple i wyświetl informacje o nim za pomocą metody printInfo().
//
//Przykładowe wyjście programu:
//
//"Owoc: Jabłko Szampion"
public class Fruit {

    public void printInfo() {
        String info = "The product category of the product is Fruit.";
        System.out.println(info);
    }

    public Fruit(){
        System.out.println("Konstruktor bezparametrowy z klasy Fruit");
    }


}
