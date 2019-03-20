package metodyklasyobject;


//Computer - klasa posiada pola producer i model - czyli informacje o producencie i modelu laptopa,
// przy czym model jest reprezentowany za pomocą liczby całkowitej. Zdefiniuj w niej metodę equals(),
// która pozwoli na zweryfikowanie, czy jest to jedyny taki egzemplarz w sklepie. Przesłoń także metodę toString(),
// która pozwoli uzyskać czytelną informację o danym egzemplarzu.

import java.util.Objects;

public class Computer {
    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return model == computer.model &&
                Objects.equals(producer, computer.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }
}
