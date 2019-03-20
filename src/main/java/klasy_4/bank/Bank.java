
//Zadanie
//Do przykładu z kontem bankowym i kredytem, który przedstawiliśmy w lekcji dodaj informacje o adresie (ulica, numer domu,
// numer mieszkania, miejscowość, kod pocztowy). Osoba ubiegająca się o konto lub kredyt w naszym banku powinna mieć teraz
// także przypisany adres zameldowania i zamieszkania. Oba te adresy mogą być różne lub takie same.
//
//Stwórz konto bankowe dla osoby, która ma identyczny adres zamieszkania i zameldowania oraz drugie konto dla osoby, która
// mieszka w innym miejscu niż jest zameldowana. Obie osoby mieszkają pod tym samym adresem.
//
//Wyświetl informację o imieniu, nazwisku i miejscowości zamieszkania każdej osoby oraz o ilości środków na koncie każdej z tych osób.
//
//Na kartce lub w dowolnym programie graficznym narysuj także uproszczony model pamięci uwzględniający wszystkie referencje i
// obiekty w twojej aplikacji.


package klasy_4.bank;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "John";
        person1.surname = "Nowak";
        person1.pesel = "192893940";
        //1-adres
        Address livingAddress1 = new Address();
        livingAddress1.streetName = "Warszawska";
        livingAddress1.houseNumber = "12";
        livingAddress1.city = "Warszawa";
        livingAddress1.zipCode = "34-450";

        Address registerAddress1 = new Address();
        registerAddress1.streetName = "Głowaczowska";
        registerAddress1.houseNumber = "49";
        registerAddress1.city = "Warszawa";
        registerAddress1.zipCode = "45-273";


        person1.livingAddress = livingAddress1;
        person1.registerAddress = registerAddress1;


        Person person2 = new Person();
        person2.name = "Cezary";
        person2.surname = "Freg";
        person2.pesel = "2345678";

        //2 -adres

        Address livingAddress2 = new Address();
        livingAddress2.streetName = "Koledowska";
        livingAddress2.houseNumber = "2";
        livingAddress2.city = "Warszawa";
        livingAddress2.zipCode = "23-738";

        Address registerAddress2 = new Address();
        registerAddress2.streetName = "Focha";
        registerAddress2.houseNumber = "4";
        registerAddress2.city = "Okinawa";
        registerAddress2.zipCode = "34-230";

        person2.registerAddress = registerAddress2;
        person2.livingAddress = livingAddress2;


        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = person1;
        bankAccount1.balance = 200;


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.owner = person2;
        bankAccount2.balance=12900;



        Credit credit = new Credit();
        credit.borrower = person1;
        credit.cashBorrowed = 2000;
        credit.cashReturned = 100;
        credit.interestRate = 0.05;
        credit.termMonths = 12;


        System.out.println("Osoba:");
        System.out.println(person1.name + " " + person1.surname + " pesel numer: " + person1.pesel + ", " + person1.livingAddress.city + ", " + person1.registerAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + bankAccount1.balance);
        System.out.println("oraz posiada kredyt w wysokości " + credit.cashBorrowed);


    }
}
