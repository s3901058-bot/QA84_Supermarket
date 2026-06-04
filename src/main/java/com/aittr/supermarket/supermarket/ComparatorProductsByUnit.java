package com.aittr.supermarket.supermarket;

import java.util.Comparator;

public class ComparatorProductsByUnit implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        String unit1=o1.getUnit();
        String unit2=o2.getUnit();
        return unit1.compareTo(unit2);
    }
}
