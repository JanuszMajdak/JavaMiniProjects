package dziedziczenie;

public class Wheels extends Part{
    private int wheelSize;
    private int wheelWidth;


    public Wheels(int wheelSize, int wheelWidth) {
        this.wheelSize = wheelSize;
        this.wheelWidth = wheelWidth;
    }

    public Wheels(int identificationPartNumber, String partProducerName, String partModel, String partSerieNumber, int wheelSize, int wheelWidth) {
        super(identificationPartNumber, partProducerName, partModel, partSerieNumber);
        this.wheelSize = wheelSize;
        this.wheelWidth = wheelWidth;
    }


    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getWheelWidth() {
        return wheelWidth;
    }

    public void setWheelWidth(int wheelWidth) {
        this.wheelWidth = wheelWidth;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelSize=" + wheelSize +
                ", wheelWidth=" + wheelWidth +
                '}';
    }
}
