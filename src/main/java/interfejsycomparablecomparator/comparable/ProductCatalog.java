package interfejsycomparablecomparator.comparable;

import interfejsycomparablecomparator.comparator.ProductNameComparator;

import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {

        Product[] products = new Product[3];

        products[0] = new Product("Mercedes", "SLK", "Coupe");
        products[1] = new Product("Audi", "A8", "Limousine");
        products[2] = new Product("Seat", "Leon", "Combi");

        System.out.println("Not sorted array: ");

        for (Product p : products) {
            System.out.println(p);
        }



        System.out.println();


        Arrays.sort(products);

        System.out.println("Sorted array: ");
        for (Product p : products) {
            System.out.println(p);
        }


        //comparator

        Arrays.sort(products,new ProductNameComparator());


    }
}
