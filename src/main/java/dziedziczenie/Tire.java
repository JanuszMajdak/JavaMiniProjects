package dziedziczenie;

public class Tire extends Part {

    private int tireSize;
    private int tireWidth;


    public Tire(int identificationPartNumber, String partProducerName, String partModel, String partSerieNumber) {
        super(identificationPartNumber, partProducerName, partModel, partSerieNumber);
    }


    public Tire(int identificationPartNumber, String partProducerName, String partModel, String partSerieNumber, int tireSize, int tireWidth) {
        super(identificationPartNumber, partProducerName, partModel, partSerieNumber);
        this.tireSize = tireSize;
        this.tireWidth = tireWidth;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "tireSize=" + tireSize +
                ", tireWidth=" + tireWidth +
                '}';
    }
}
