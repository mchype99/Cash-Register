public class Customer {
    /**
     * Constructs Customer object.
     * @param cashAmount the amount of cash the customer has.
     */
    Customer(double cashAmount){
        cash = cashAmount;
     }

    /**
     * Gives cash to the cashier
     * @param total the amount of cash the customer needs to give.
     * @return the total amount of cash to pay if the customer has it.
     */
     double giveCash(double total){

        if (cash - total > 0) {
            cash = cash - total;
            return total;
        }
        else
            return 0;
     }
    double cash;
}
