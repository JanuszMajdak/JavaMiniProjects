package tablicejednowymiarowe;
//Zadanie
//Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego. Każda z nich powinna przechowywać
// po 3 dowolne liczby typu int. Program powinien wyświetlić sumę wszystkich liczb z obu tablic.


public class TableSum {
    public static void main(String[] args) {
        int[] table1 = new int[3];
        table1[0] = 2;
        table1[1] = 9;
        table1[2] = 45;
        int sumTable1 = 0;

        for (int i = 0; i < table1.length; i++) {
            sumTable1 += table1[i];
        }
        System.out.println("Sum table1=" + sumTable1);

        int sumTable2 = 0;
        int[] table2 = {5, 6, 7};
        for (int i = 0; i < table2.length; i++) {
            sumTable2 += table2[i];
        }
        System.out.println("Sum table2=" + sumTable2);
        int totalSum = sumTable1 + sumTable2;
        System.out.println("The total sum of table1 and table2 =" + totalSum);

    }


}

