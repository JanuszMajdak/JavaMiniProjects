package tablicejednowymiarowe;


//Sumę iloczynów przekątnych tablicy,
//iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
//sumę wszystkich elementów znajdujących się przy krawędzi tablicy.


public class CalculationOnOneDimensionalTable {


    public double sumOfAllTableElements(double[][] table) {

        double totalTableSum = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                totalTableSum += table[i][j];
            }

        }
        return totalTableSum;
    }


    public static void main(String[] args) {

        double[][] table = {{1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3}
        };


        CalculationOnOneDimensionalTable calculation = new CalculationOnOneDimensionalTable();

        System.out.println("The total sum of table elements is: " + calculation.sumOfAllTableElements(table));


    }


}
