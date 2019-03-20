package polimorfizmszpital;

public class Hospital {


    private static final int MAX_NUMBER_OF_HOSPITAL_EMPLOYEES = 100;

    private Person[] employees = new Person[MAX_NUMBER_OF_HOSPITAL_EMPLOYEES];
    private int employeesNumber;


    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }


    public void add(Person person) {
        if (employeesNumber < MAX_NUMBER_OF_HOSPITAL_EMPLOYEES) {
            getEmployees()[getEmployeesNumber()] = person;
            setEmployeesNumber(getEmployeesNumber() + 1);
        }

    }

    @Override
    public String toString() {
        String result="";

        for(int i=0; i<employeesNumber;i++){
            result=result+employees[i]+ "\n";
        }
        return result;
    }
}



