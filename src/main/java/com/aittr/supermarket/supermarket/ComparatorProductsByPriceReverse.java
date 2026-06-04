package com.aittr.supermarket.supermarket;

import java.util.Comparator;

public class ComparatorProductsByPriceReverse implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();
        return Double.compare(price2, price1);
    }
}
