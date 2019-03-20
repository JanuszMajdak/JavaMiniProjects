package klasy_4;

public class HelloName {
    public static void main(String[] args) {
         final String name1 = "Marek";
         final String name2 = "Ola";

        String name = "Ola";

        switch (name) {
            case name1:
                System.out.println("Hello Marek. How are you?");
                break;
            case name2:
                System.out.println("hello Ola. Where did you spend your last holiday?");
                break;

                default:
                    System.out.println("nie znam Cię");


        }


    }
}
