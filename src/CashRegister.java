import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Cash register that manages the cart, calculate
 * and display total, and display receipt.
 */
public class CashRegister {
    /**
     * Construct CashRegister object.
     * @param anInventory the inventory of products.
     */
    CashRegister(Inventory anInventory){
        cart = new ArrayList<>();
        inventory = anInventory;
    }

    /**
     * Gets and displays the product details.
     * @param upc UPC of product
     */
    void getAndDisplayProduct(int upc) {
        Product product;
        product = inventory.productDetails(upc);
        cart.add(product);
        System.out.println(product);
    }

    /**
     * Calculates and displays the total.
     */
    void calcTotalAndDisplay(){
        for(Product product: cart){
            total += product.price;
        }
        System.out.println("Total: $" + df.format(total));
    }

    /**
     * Displays the receipt.
     */
    void displayReceipt() {
        System.out.println("");
        System.out.println("Receipt: ");
        for(Product product: cart){
            System.out.println(product);
        }
        System.out.println("Total: $" + df.format(total));
    }

    ArrayList<Product> cart;
    Inventory inventory;
    double total;
    private static final DecimalFormat df = new DecimalFormat("0.00");
}
