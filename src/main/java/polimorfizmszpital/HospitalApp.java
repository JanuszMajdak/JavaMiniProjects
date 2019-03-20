package polimorfizmszpital;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital=new Hospital();

            hospital.add(new Doctor("Jurek", "Nowak", 7900.0, 8900));
            hospital.add(new Nurse("Agata", "Snopek",2300,120));
            hospital.add(new Nurse("Karolina", "Dłużycka",2400,340));

        System.out.println("The employees of the hospital:");
        System.out.println(hospital);
    }
}
