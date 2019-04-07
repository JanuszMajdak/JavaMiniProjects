package kolekcje.map.zad;

import kolekcje.map.Employee;

import java.util.HashMap;
//Napisz prostą aplikację składającą się z trzech klas:
//
//Employee - przechowuje informacje o pracowniku (imię, nazwisko, wypłata),
//Company - przechowuje informacje o pracownikach w postaci map,
//CompanyApp - pozwala wczytywać dane od użytkownika.
//Aplikacja powinna posiadać 3 opcje:
//
//Dodanie nowego pracownika,
//wyszukanie informacji o pracowniku na podstawie imienia i nazwiska po czym wyświetlenie danych pracownika na ekranie (imię, nazwisko, wypłata),
//wyjście z programu.

public class Company {

    private HashMap<String, Employee> employees = new HashMap<>();

    public boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + "" + employee.getLastName();
        if (employees.get(key) != null) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }

    }

    public Employee getEmployee(String firstName, String lastName) {
        String key = firstName + "" + lastName;
        return employees.get(key);
    }


}
