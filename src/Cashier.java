import java.util.Scanner;
public class Cashier {
    /**
     * Construct Cashier object.
     * @param aUpcScanner the UPC scanner the cashier is using.
     * @param aScanner the scanner for user input.
     * @param aRegister the cash register the cashier is using.
     * @param aCustomer the customer that is interacting with the cashier.
     */
    Cashier(UPCScanner aUpcScanner, Scanner aScanner, CashRegister aRegister, Customer aCustomer) {
        upcScanner = aUpcScanner;
        scanner = aScanner;
        customer = aCustomer;
        register = aRegister;
    }

    /**
     * Scans the product UPC.
     * @param upc the UPC of the product.
     */
    void scanProduct(int upc){
        upcScanner.readUPC(upc);
    }

    /**
     * Pay button to check out.
     */
    void pay(){
        paid = true;
    }

    /**
     * Collects the cash from the customer.
     */
    void collectCash(){
        double customerCash = customer.giveCash(register.total);
        if (customerCash == register.total)
            cash = customerCash;
        else {
            System.out.println("Customer does not have enough cash!");
            System.exit(1);
        }
        pay();
    }

    /**
     * Loops reading cashier input until Pay button is pressed.
     */
    void run(){
        while (paid == false){
            int signal = 0;
            System.out.print("Enter UPC: ");
            int upc = scanner.nextInt();
            scanProduct(upc);
            do {
                System.out.print("Enter \"0\" to pay or \"1\" to scan more: ");
                signal = scanner.nextInt();
                if (signal == 0) {
                    System.out.println("Checking Out...");
                    collectCash();
                } else if (signal == 1) {
                    break;
                } else {
                    System.out.println("Invalid option, try again!");
                }
            } while (signal != 0);
        }
        register.calcTotalAndDisplay();
        register.displayReceipt();
    }
    double cash;
    boolean paid;
    int upc;
    private Scanner scanner;
    Customer customer;
    UPCScanner upcScanner;
    CashRegister register;
}
