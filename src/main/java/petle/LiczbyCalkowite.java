package petle;

public class LiczbyCalkowite {
    public static void main(String[] args) {
        int[] figures = new int[10];
//uzupełnianie tablicy

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i + 1;
        }

        //wyświetlanie tablicy

        for(int i=0; i<figures.length;i++){
            System.out.print(figures[i]+",");

        }


    }
}
