package dziedziczenie;

public class Test {
    public static void main(String[] args) {

        Tire tire1 = new Tire(123, "gefco", "xd-12", "889899D", 23, 240);
        Wheels wheels1=new Wheels(34,"yokomo","p-3240", "2002K", 25,340);
        ExhaustPart exhaustPart1=new ExhaustPart(345,"Mufler", "23K", "23423", true);

        System.out.println(tire1.getIdentificationPartNumber()+", "+tire1.getPartProducerName()+", "+tire1.getPartModel()+","+tire1.getPartSerieNumber()+", "+tire1.getTireSize()+", "+tire1.getTireWidth());
        System.out.println(wheels1.getIdentificationPartNumber()+", "+wheels1.getPartProducerName()+", "+wheels1.getPartModel()+", "+wheels1.getPartSerieNumber()+", "+wheels1.getWheelSize()+wheels1.getWheelWidth());
        System.out.println(exhaustPart1.getIdentificationPartNumber()+", "+exhaustPart1.getPartProducerName()+", "+exhaustPart1.getPartModel()+", "+exhaustPart1.getPartSerieNumber()+", "+exhaustPart1.isPartAccordingToEUStandard());



    }
}
