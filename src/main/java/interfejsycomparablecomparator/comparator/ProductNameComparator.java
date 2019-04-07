package interfejsycomparablecomparator.comparator;

import interfejsycomparablecomparator.comparable.Product;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<interfejsycomparablecomparator.comparable.Product> {
    @Override
    public int compare(interfejsycomparablecomparator.comparable.Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
