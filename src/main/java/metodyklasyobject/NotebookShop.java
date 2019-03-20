package metodyklasyobject;


//NotebookShop - klasa z metodą main. Utwórz w niej co najmniej 5 laptopów i dodaj je do bazy sklepu. Co najmniej 2
// komputery muszą być takie same. Dla powtarzającego się egzemplarza sprawdź działanie metody checkAvailability(),
// a na końcu wyświetl wszystkie notebooki dostępne w sklepie

public class NotebookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addComputer(new Computer("dell", 1));
        dataStore.addComputer(new Computer("dell", 1));
        dataStore.addComputer(new Computer("lenovo",2));
        dataStore.addComputer(new Computer("acer",3));
        dataStore.addComputer(new Computer("hp",7));

        Computer compToFind=new Computer("dell",1);
        int computersFound=dataStore.checkAvailabiity(compToFind);
        System.out.println("Number of computers: "+ compToFind+ ": "+computersFound);


        System.out.println("All available computers: ");

        for(Computer c:dataStore.getComputers()){
            System.out.println(c);
        }

    }
}
