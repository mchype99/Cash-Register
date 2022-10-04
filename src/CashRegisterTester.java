import java.util.Scanner;

/**
 * This program tests the cash register system.
 * The hardcoded items UPC codes are 101, 102, 103, 104, and 105.
 */
public class CashRegisterTester {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        CashRegister register = new CashRegister(inventory);
        UPCScanner upcScanner = new UPCScanner(register);
        Scanner console = new Scanner(System.in);
        Customer buyer = new Customer(CUSTOMER_CASH_AMOUNT);
        Cashier cashier = new Cashier(upcScanner, console, register, buyer);
        cashier.run();
    }
    private static  final double CUSTOMER_CASH_AMOUNT = 15;
}
