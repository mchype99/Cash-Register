public class UPCScanner {
    /**
     * Construct UPCScanner object.
     * @param register the cash register the scanner is connected to.
     */
    UPCScanner(CashRegister register){
        cashRegister = register;
    }

    /**
     * Reads the UPC from the cashier.
     * @param productUpc the upc of the product.
     */
    void readUPC(int productUpc){
        upc = productUpc;
        sendUPC();
    }

    /**
     * Sends the UPC to the cash register.
     */
    void sendUPC() {
        cashRegister.getAndDisplayProduct(upc);
    }
    int upc;
    CashRegister cashRegister;
}
