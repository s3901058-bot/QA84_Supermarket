import com.aittr.supermarket.supermarket.ISortingCriteria;
import com.aittr.supermarket.supermarket.Product;
import com.aittr.supermarket.supermarket.Supermarket;
import com.aittr.supermarket.supermarket.Supermarket.*;

public class MainSupermarket {
    public static void main(String[] args) {

        Product p1 = new Product("Milk", 101, "liter", 5.50);
        Product p2 = new Product("Bread", 102, "piece", 3.20);
        Product p3 = new Product("Rice", 103, "kg", 8.90);
        Product p4 = new Product("Sugar", 104, "kg", 4.70);
        Product p5 = new Product("Coffee", 105, "pack", 18.00);
        Product p6 = new Product("Tea", 106, "box", 12.50);
        Product p7 = new Product("Cheese", 107, "kg", 32.00);
        Product p8 = new Product("Butter", 108, "piece", 9.40);
        Product p9 = new Product("Eggs", 109, "box", 14.90);
        Product p10 = new Product("Juice", 110, "liter", 6.80);

    Supermarket lidl=new Supermarket("WallMarkt","Herzel 20, Rehovot");
        lidl.addProduct(p10,24);
        lidl.addProduct(p9,48);
        lidl.addProduct(p8,30);
        lidl.addProduct(p7,45);
        lidl.addProduct(p6,12);
        lidl.addProduct(p5,134);
        lidl.addProduct(p4,200);
        lidl.addProduct(p3,70);
        lidl.addProduct(p2,60);
        lidl.addProduct(p1,15);
        lidl.printProducts();
        Product p11 = new Product("Potato", 111, "Kg", 6.90);
        lidl.addProduct(p11,20);
        lidl.printProducts();
        Product p12 = new Product("Potato", 111, "Kg", 6.90);
        lidl.addProduct(p12,25);
        lidl.printProducts();
        lidl.RemoveProduct(113,5);
        lidl.printProducts();
        lidl.reducePrice(111,50);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_PRICE);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_PRICE_REVERS);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_NAME);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_NAME_REVERS);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_UNIT);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_CODE_REVERS);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_CODE);
        lidl.printProducts();
        lidl.sortProductsBy(ISortingCriteria.SORT_BY_CODE_REVERS);
        lidl.printProducts();

   // HomeWork#14

        lidl.findCode(111);
        lidl.printProducts();

        lidl.removeProductFromStock(111);
        lidl.printProducts();

        lidl.totalCost();
        lidl.printProducts();

        lidl.reducePriceALL(99.9);//Распрадажа перед закрытием 99.9 % Скидка )_)))
        lidl.printProducts();

        // END HomeWork#14

    }
}

/*






     Product
    ----------      Example:
    name(String)    Yogurt Tnuva
    code(int)       1234
    unit(String)    200 ml
    price(double)    6.70
    quantity(double) 30.0

    set/get
    toString()
    constructor

       Supermarket
       -----------
       name(String)
       address(String)
       products(ArrayList<Product>)
       ++++++++++++++++++++++++++++
       constructor
       set/get
       addProduct(Product, quantity)
       printProductsList()
       removeProduct(code,quantity)
       sortProductsBy(criteria)
       findProduct(code)
       reducePrice(code, percent)
       double totalCost()
       reducePriceForAll(percent)


           Home Work14
            1 public void findProduct(code) ---- home work if not fide return
            2 public void removeProductFromStock (int code )
            3 Advanced  *********
              public double totalCost()



*/