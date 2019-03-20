package typygeneryczne.zad;

public class PairTest {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Ania", 1978);
        Pair<Double, Double> p2 = new Pair<>(23.1, 34.8);
        Pair<String, String> p3 = new Pair<>("Karol", "Piasecki");

        printPair(p1);
        printPair(p2);
        printPair(p3);

    }

    static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("--" + pair.getT() + " ; " + pair.getV() + "--");
    }


}
