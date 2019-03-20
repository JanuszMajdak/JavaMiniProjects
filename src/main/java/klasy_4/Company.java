package klasy_4;

public class Company {

    public static void main(String[] args) {

        Employee employee1=new Employee();

        employee1.name="Marek";
        employee1.surname="Gromek";
        employee1.birthdayYear=1988;
        employee1.experienceYears=23;


        System.out.println(employee1.name+" "+employee1.surname+" ,"+employee1.birthdayYear+ " , "+employee1.experienceYears);

    }


}
