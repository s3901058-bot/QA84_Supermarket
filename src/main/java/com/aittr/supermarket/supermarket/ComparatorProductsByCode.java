package com.aittr.supermarket.supermarket;

import java.util.Comparator;

public class ComparatorProductsByCode implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int code1 = o1.getCode();
        int code2 = o2.getCode();
        return code1-code2;
    }
}
