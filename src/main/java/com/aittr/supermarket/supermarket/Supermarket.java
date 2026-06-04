package com.aittr.supermarket.supermarket;

import java.util.ArrayList;

public class Supermarket {
    private String name;
    private String address;
    private ArrayList<Product> stock =
            new ArrayList<>();

    public Supermarket(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product p,double quantity){
        if(stock.contains(p) == false){
            p.setQuantity(quantity);
            stock.add(p);
            stock.sort(null);
        }
        else {
            for (Product pr: stock){
                if (pr.getCode() == p.getCode()){
                    double q = pr.getQuantity();
                    q += quantity;
                    pr.setQuantity(q);
                    break;
                }
            }
        }
    }
    public void printProducts(){
        System.out.println("************************");
        System.out.println("Supermarket: " + name);
        System.out.println("Address: " + address);
        System.out.println("\t\t\tStock ");
        for (Product pr: stock){
            System.out.println(pr);
        }


        System.out.println("************************");
    }
    public void RemoveProduct(int code,double quantity){

        for(Product pr: stock){
            if (pr.getCode() == code){
            double q = pr.getQuantity();
            q-=quantity;
            if(q<0)
                q=0;
            pr.setQuantity(q);
              return ;
        }

    }
        System.out.println("----------------");
        System.out.println("Wrong code: "+code);
        System.out.println("----------------");

}
public void reducePrice(int code,double percent){
        for(Product pr: stock){
            if(pr.getCode() == code){
                double price = pr.getPrice();
                double discount= (price*percent)/100;
                price-=discount;
                pr.setPrice(price);
               return ;
              }
          }
    System.out.println("----------------");
    System.out.println("Wrong code: "+code);
    System.out.println("----------------");
}
    public void sortProductsBy(int criteria){
          switch (criteria) {
//              case ISortingCriteria.SORT_BY_PRICE:
//                  ComparatorProductsByPrice comp = new ComparatorProductsByPrice();
//                  stock.sort(comp);
//                  System.out.println("Price Criteria");
//                  break;

              case ISortingCriteria.SORT_BY_PRICE:
                   stock.sort(new ComparatorProductsByPrice());
                   System.out.println("Price Criteria");
                   break;
              case ISortingCriteria.SORT_BY_PRICE_REVERS:
                  stock.sort(new ComparatorProductsByPriceReverse());
                  System.out.println("PriceRevers Criteria");
                  break;
             case ISortingCriteria.SORT_BY_NAME:
                  stock.sort(new ComparatorProductsByName());
                  System.out.println("Name Criteria");
                  break;
              case ISortingCriteria.SORT_BY_NAME_REVERS:
                  stock.sort(new ComparatorProductsByNameReverse());
                  System.out.println("NameReverse Criteria");
                  break;
              case ISortingCriteria.SORT_BY_UNIT:
                  stock.sort(new ComparatorProductsByUnit());
                  System.out.println("Unit Criteria");
                  break;
               case ISortingCriteria.SORT_BY_UNIT_REVERS:
                  stock.sort(new comparatorProductsByUnitReverse());
                  System.out.println("UnitReverse Criteria");
                  break;
              case ISortingCriteria.SORT_BY_CODE:
                  stock.sort(new ComparatorProductsByCode());
                  System.out.println("code Criteria");
                  break;
              case ISortingCriteria.SORT_BY_CODE_REVERS:
                  stock.sort(new comparatorProductsByCodeReverse());
                  System.out.println("codeReverse Criteria");
                  break;

          }

// HomeWork 14

          }
        public int findCode(int code){

            for (Product pr : stock) {
                if (pr.getCode() == code) {
                    System.out.println("Code Find: " + pr.getCode());
                    return code;
                }
            }


            System.out.println("Code: " + code+" not Find");
            return -1;
        }
public void removeProductFromStock (int code ){
        for(Product pr: stock){
            if(pr.getCode() == code){
                stock.remove(pr);
                stock.sort(null);
                break;
            }
        }

}


    public double totalCost(){
               double total = 0;
        for(Product pr: stock){
            total += pr.getPrice()*pr.getQuantity();        }
        System.out.println("TOTAL COST: "+total);
        return total;

    }

    public void reducePriceALL(double percent){

        for(Product pr: stock){
            double price = pr.getPrice();
            double discount= (price*percent)/100;
            price-=discount;
           pr.setPrice(price);



//            for(Product pr: stock){
//                if(pr.getCode() == code){
//                    double price = pr.getPrice();
//                    double discount= (price*percent)/100;
//                    price-=discount;
//                    pr.setPrice(price);
//                    return ;

        }

        System.out.println("Discount ALL: " +percent+" % ");
        // End   HomeWork 14
    }


}



