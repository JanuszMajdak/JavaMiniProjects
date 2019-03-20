package typy;//Zadanie
//Napisz program, który wyświetli o tobie kilka informacji w postaci takiej jak przedstawiono poniżej.
//
//-Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
//-true
//-Czy Twoje inicjały to J K?
//-Tak, true
//
//W zadaniu wykorzystaj nie tylko napisy zapisane w cudzysłowie, ale również podane java.typy danych:
//
//liczby (int),
//znaki (char),
//typ logiczny (boolean).


public class DataType {

    private int age;
    private boolean learnProgramming;
    private char nameInitial;
    private char surnameInitial;
    private boolean correctInitials;


    public static void printInformationAboutYou(int age, boolean learnProgramming, char nameInitial, char surnameInitial, boolean correctInitials) {
        System.out.println("-Cześć Jan, słyszałem, że masz: " + age + " i uczysz się programowania. Czy to prawda?\n -" + learnProgramming + "\n" + " -Czy " +
                "Twoje inicjały to: " + nameInitial + " " + surnameInitial + "?" + "\n"+"-Tak," + correctInitials);


    }


    public static void main(String[] args) {
        printInformationAboutYou(42,true,'J','M',true);

    }
}
