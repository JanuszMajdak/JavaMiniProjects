package metodyklasyobject;

//DataStore - klasa przechowuje informacje o notebookach w tablicy. Pozwala na dodanie kolejnego komputera do bazy
// poprzez metodę add() oraz wyświetlenie informacji o wszystkich notebookach. Powinna również istnieć metoda checkAvailability(),
// która jako parametr przyjmuje obiekt klasy Computer i zwraca ilość identycznych komputerów w sklepie.


public class DataStore {
    private final static int MAX_NUMBER_COMPUTERS = 100;
    private int computerNumbers;
    private Computer[] computers = new Computer[MAX_NUMBER_COMPUTERS];

    //konstruktor bezparametrowy
    public DataStore() {

    }

    //konstruktor parametrowy
    public DataStore(int computerNumbers, Computer[] computers) {
        this.computerNumbers = computerNumbers;
        this.computers = computers;
    }

    //gettery i settery
    public int getComputerNumbers() {
        return computerNumbers;
    }

    public void setComputerNumbers(int computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public Computer[] getComputers() {

        Computer[] comps = new Computer[computerNumbers];
        for (int i = 0; i < computerNumbers; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }


    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }


    public void addComputer(Computer computer) {
        if (computerNumbers < MAX_NUMBER_COMPUTERS && computer != null) {
            computers[computerNumbers] = computer;
            computerNumbers++;
        } else {
            System.out.println("We have got the max. quantity of computers");
        }
    }


    public void printComputers() {
        if (computerNumbers == 0) {
            System.out.println("There isn't computers in the shop");
        } else {
            for (int i = 0; i < computerNumbers; i++) {
                computers[i].toString();
            }
        }
    }

    public int checkAvailabiity(Computer find) {
        if (find == null) return 0;


        int count = 0;
        for (int i = 0; i < computerNumbers; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

}


