package klasaarrays.zad;

public class PersonManager {
    public static void main(String[] args) {

        PersonDatabase pdb = new PersonDatabase();

        pdb.add(new Person("Ania", "Lipa", "12232313"));
        pdb.add(new Person("Karol", "Gort", "123999393"));
        pdb.add(new Person("Michał", "Kominek", "348934893"));

        System.out.println(pdb);
        pdb.remove(new Person("Karol", "Gort", "123999393"));
        System.out.println();
        System.out.println(pdb);
    }
}
