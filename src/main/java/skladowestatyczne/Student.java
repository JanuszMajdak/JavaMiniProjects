package skladowestatyczne;
//Zadanie
//Utwórz program składający się z dwóch klas:
//
//Student - pozwala przechowywać informację o imieniu, nazwisku i numerze indeksu studenta
//University - klasa z metodą main, w której utworzysz kilku (co najmniej 2 studentów)
//W klasie Student zdefiniuj pole statyczne, która wraz z tworzeniem nowego obiektu tej
// klasy będzie zwiększane o 1, a tym samym pozwoli śledzić ilość studentów na uczelni.
//
//Po utworzeniu co najmniej dwóch studentów w klasie university, wyświetl liczbę studentów na uczelni.


public class Student {
    private static int studentNumber = 0;

    private String firstName;
    private String lastName;
    private int studentIndex;

    public Student(String firstName, String lastName, int studentIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndex = studentIndex;
        studentNumber++;
    }


    public static int getStudentNumber(){
        return studentNumber;
    }



    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
