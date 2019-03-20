package typygeneryczne;

public class GenericTester {
    public static void main(String[] args) {


        Container<Integer> integers = new Container<Integer>();
        integers.setArray(new Integer[5]);
        integers.getArray()[0] = 10;

        Container<String> strings = new Container<String>();
        strings.setArray(new String[15]);
        strings.getArray()[0] = "Ania";
        strings.getArray()[1] = "Michałek";

        Integer num = integers.get(0);
        String str = strings.get(0);

        System.out.println(num);
        System.out.println(str);

    }
}
