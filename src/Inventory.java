import java.util.*;

/**
 * Keeps track of products in the store.
 */
public class Inventory {
    /**
     * Construct Inventory object.
     */
    Inventory (){
        products = new ArrayList<>();
        addToInventory();
    }

    /**
     * Hardcode products to inventory.
     */
    void addToInventory(){
        Product snicker = new Product(101, "Snickers bar", 1);
        Product doritos = new Product(102, "Doritos", 2);
        Product gum = new Product(103, "Gum", 1);
        Product lemonade = new Product(104, "Lemonade", 2.5);
        Product oreos = new Product(105, "Oreos", 3);
        products.add(snicker);
        products.add(doritos);
        products.add(gum);
        products.add(lemonade);
        products.add(oreos);
    }

    /**
     * Get product details.
     * @param upc UPC of product.
     * @return corresponding product.
     */
    Product productDetails(int upc){
        for(Product x: products){
            if (x.upc == upc)
                return x;
        }
        System.out.println("Product does not exist!");
        return null;
    }
    ArrayList<Product> products;
}
