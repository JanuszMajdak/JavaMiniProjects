package dziedziczenie;

//Zadanie
//Stwórz projekt, w którym wykorzystując dziedziczenie stworzysz prostą hierarchię klas
// odwzorowujących części w hurtowni motoryzacyjnej zgodnie z poniższą specyfikacją:
//
//Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, przechowuje nazwę producenta, model i serię produktu
//Części takie jak Opony (Tire) i Felgi (Wheel) posiadają dodatkowo informację o rozmiarze i szerokości
//Części (ExhaustPart) układu wydechowego posiadają dodatkową informację, czy jest ona zgodna z europejskim standardem emisji spalin
//Dopisz krótką klasę testową, w której utworzysz kilka obiektów reprezentujących części i wyświetl informacje o nich.


public class Part {
    private int identificationPartNumber;
    private String partProducerName;
    private String partModel;
    private String partSerieNumber;

    public Part(){

    }



    public Part(int identificationPartNumber, String partProducerName, String partModel, String partSerieNumber) {
        this.identificationPartNumber = identificationPartNumber;
        this.partProducerName = partProducerName;
        this.partModel = partModel;
        this.partSerieNumber = partSerieNumber;
    }

    public int getIdentificationPartNumber() {
        return identificationPartNumber;
    }

    public void setIdentificationPartNumber(int identificationPartNumber) {
        this.identificationPartNumber = identificationPartNumber;
    }

    public String getPartProducerName() {
        return partProducerName;
    }

    public void setPartProducerName(String partProducerName) {
        this.partProducerName = partProducerName;
    }

    public String getPartModel() {
        return partModel;
    }

    public void setPartModel(String partModel) {
        this.partModel = partModel;
    }

    public String getPartSerieNumber() {
        return partSerieNumber;
    }

    public void setPartSerieNumber(String partSerieNumber) {
        this.partSerieNumber = partSerieNumber;
    }

    @Override
    public String toString() {
        return "Part{" +
                "identificationPartNumber=" + identificationPartNumber +
                ", partProducerName='" + partProducerName + '\'' +
                ", partModel='" + partModel + '\'' +
                ", partSerieNumber='" + partSerieNumber + '\'' +
                '}';
    }
}
