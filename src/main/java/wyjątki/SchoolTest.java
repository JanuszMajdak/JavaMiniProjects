package wyjątki;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School(3);

        try {
            school.add(new Student("Jan", "Nowak", 140));
            school.add(new Student("Marek", "Baka", 167));
            school.add(new Student("Remik", "Bodo", 345));
            school.add(new Student("Marek", "Bak", 167));
            school.add(new Student("Remik", "Bod", 345));
        } catch (NoMoreSpaceException e) {
            System.out.println("There is no possibillity to add so many students");
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(school.find("Remik", "Bodo"));
            System.out.println(school.find("Marek", "Kowalik"));
        } catch (NoElementFoundException e) {
            System.out.println("This person wasn't found.");
            System.out.println(e.getMessage());
        }

    }

}
