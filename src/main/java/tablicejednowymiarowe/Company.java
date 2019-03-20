package tablicejednowymiarowe;

public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[20];

        employees[0] = new Employee("Jan", "Wedo", 1200);
        employees[1] = new Employee("Marek", "Gola", 4500);
        employees[2] = new Employee("Ola", "Kadala", 3900);


        System.out.println(employees.length);
        System.out.println(employees[1].getFirstName());
    }
}
