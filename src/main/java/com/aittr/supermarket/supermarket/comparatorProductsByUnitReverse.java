package com.aittr.supermarket.supermarket;

import java.util.Comparator;

public class comparatorProductsByUnitReverse implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String unit1=o1.getUnit();
        String unit2=o2.getUnit();

        return unit2.compareTo(unit1);
    }
}
