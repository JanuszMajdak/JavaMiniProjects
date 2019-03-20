package dziedziczenie;

public class ExhaustPart extends Part{
    private boolean isPartAccordingToEUStandard;



    public ExhaustPart(int identificationPartNumber, String partProducerName, String partModel, String partSerieNumber, boolean isPartAccordingToEUStandard) {
        super(identificationPartNumber, partProducerName, partModel, partSerieNumber);
        this.isPartAccordingToEUStandard = isPartAccordingToEUStandard;
    }


    public boolean isPartAccordingToEUStandard() {
        return isPartAccordingToEUStandard;
    }

    public void setPartAccordingToEUStandard(boolean partAccordingToEUStandard) {
        isPartAccordingToEUStandard = partAccordingToEUStandard;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "isPartAccordingToEUStandard=" + isPartAccordingToEUStandard +
                '}';
    }
}
