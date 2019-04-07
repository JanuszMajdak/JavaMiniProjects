package kolekcje.map.zad;


import kolekcje.map.Employee;

import java.util.Scanner;

public class CompanyApp {
    public static final int ADD_EMPLOYEE = 0;
    public static final int FIND_EMPLOYEE = 1;
    public static final int EXIT = 2;

    private static Company company = new Company();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userOption;

        do {
            printOptions();
            userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case CompanyApp.ADD_EMPLOYEE:
                    addEmployee(scanner);
                    break;
                case CompanyApp.FIND_EMPLOYEE:
                    findAndPrintEmployee(scanner);
                    break;
                case CompanyApp.EXIT:
                    break;
            }


        }
        while (userOption != CompanyApp.EXIT);

    }

    private static void printOptions() {
        System.out.println("0-adding employee");
        System.out.println("1-searching employee");
        System.out.println("2-exit from programme");
    }

    private static void addEmployee(Scanner scanner) {

        Employee employee = new Employee();

        System.out.println("Adding employee: ");
        System.out.println("Name: ");
        employee.setFirstName(scanner.nextLine());
        System.out.println("Surname: ");
        employee.setLastName(scanner.nextLine());
        System.out.println("Salary: ");
        employee.setSalary(scanner.nextDouble());
        scanner.nextLine();

        company.addEmployee(employee);
    }


    private static void findAndPrintEmployee(Scanner scanner) {
        System.out.println("Searching the employee: ");
        System.out.println("Give the name: ");
        String firstName = scanner.nextLine();
        System.out.println("Give the surname: ");
        String lastName = scanner.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        System.out.println(employee);

    }


}
