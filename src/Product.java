import java.text.DecimalFormat;

/**
 * A product in the store
 */
public class Product {
    /**
     * Construct a Product object.
     * @param productUpc
     * @param productName
     * @param productPrice
     */
    Product(int productUpc, String productName, double productPrice) {
        upc = productUpc;
        name = productName;
        price = productPrice;
    }

    /**
     * String representation of a product.
     * @return product details.
     */
    public String toString(){
        return ("Prod: " + this.name + ", UPC: " + this.upc + ", Unit Price: $" + df.format(this.price));
    }
    int upc;
    String name;
    double price;
    private static final DecimalFormat df = new DecimalFormat("0.00");
}
