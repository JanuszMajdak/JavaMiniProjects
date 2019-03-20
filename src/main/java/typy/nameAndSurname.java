package typy;//Napisz program, który wyświetli na ekranie Twoje imię i nazwisko.

public class nameAndSurname {
    private String name;
    private String surname;

    public static void printNameAndSurname(String name, String surname){
        System.out.println("My name is: "+name);
        System.out.println("my name surname is: "+surname);
    }


    public static void main(String [] args){
        printNameAndSurname("Janusz", "Majdak");
         }
}
