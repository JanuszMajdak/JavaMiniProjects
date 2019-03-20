package planowaniewizytwszpitalu;

import java.util.Scanner;

public class Hospital {

    int maxNumberOfPatients = 10;
    int currentNumberOfPatient = 0;


    Patient[] listOfPatients = new Patient[maxNumberOfPatients];
    Scanner scanner = new Scanner(System.in);

    public void addPatient(Patient patient) {
        if (currentNumberOfPatient < maxNumberOfPatients) {
            listOfPatients[currentNumberOfPatient] = patient;
            currentNumberOfPatient++;
        } else {
            System.out.println("There is no more places today. Please come tomorrow.");
        }
    }

    public void showPatientsList(Patient[] listOfPatients) {
        for (int i = 0; i < currentNumberOfPatient; i++) {
            System.out.println(listOfPatients[i].getFirstName() + listOfPatients[i].getLastName() + listOfPatients[i].getPesel());

        }
    }


    public void choosenAction() {

        int choosenFigure=0;


        while (choosenFigure!=1){
            System.out.println("Choosen the one of the figures: " +
                    "1-exit from programme\n 2-add patient to the list\n3-show the patient list");

            choosenFigure = scanner.nextInt();
            scanner.nextLine();

            switch (choosenFigure) {
                case 1:
                    System.out.println("You choosen option 1");
                    break;
                case 2:
                    System.out.println("You choosen option 2");
                    Patient patient = new Patient();

                    System.out.println("Give the name:");
                    String firstName = scanner.nextLine();
                    patient.setFirstName(firstName);

                    System.out.println("Give the last name:");
                    String lastName = scanner.nextLine();
                    patient.setLastName(lastName);

                    System.out.println("Give the pesel:");
                    String pesel = scanner.nextLine();
                    patient.setPesel(pesel);

                    addPatient(patient);


                    break;
                case 3:
                    System.out.println("You choosen option 3");
                    showPatientsList(listOfPatients);
                    break;
                default:
                    System.out.println("Please choose option: 1-3");
            }
        }
    }

}
