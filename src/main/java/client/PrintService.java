package client;


//konaj takich zmian w kodzie, aby ukryć logikę związaną z prezentacją wyników użytkownikowi w osobnej klasie i metodzie. Dodaj także funkcjonalność polegającą na tym, że jeżeli w kliencie nie będzie ustawionego pola firstName lub lastName to wyświetlone zostanie powitanie w jednej z poniższych w postaci:
//
//"Witaj Jan" - gdy pole lastName jest nullem,
//"Witaj Jan Kowalski" - gdy zarówno firstName i lastName są różne od null,
//"Dzień dobry panie/pani Kowalski" - jeśli pole firstName jest nullem,
//"Witaj nieznajomy" - jeśli zarówno firstName jak i lastName będą nullami.

public class PrintService {

    public void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessage(client);
        printPricesMessage(originalPrice,discountPrice);
    }


    public void printWelcomeMessage(Client client) {

        String firstName = client.getFirstName();
        String lastName = client.getLastName();

        if (lastName == null) {
            System.out.println("Witaj " + firstName);
        } else if ((firstName != null) && (lastName != null)) {
            System.out.println("Witaj " + firstName + " " + lastName);
        } else if (firstName == null) {
            System.out.println("Dzień dobry Pani/Panie " + lastName);
        } else System.out.println("Witaj nieznajomy");

    }


    public void printPricesMessage(double originalPrice, double discountPrice){
        System.out.println("Price before discount: "+originalPrice);
        System.out.println("Price after discount: "+discountPrice);
    }

}
