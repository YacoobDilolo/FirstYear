
/**
 * An instance of this class serves to simulate a simple cash register. 
 * It may be used to maintain a running total for items purchased, and when 
 * given an amount tendered in payment, to calculate the change that is due.
 * 
 * @author Stephan Jamieson
 * @version  16 April 2009
 */
class CashRegister {

    private int runningTotal;
    private int amountTendered;

    /**
     * Create a cash register object. The running total, amount tendered 
     * (and change due) will be zero.
     */
    CashRegister() { reset(); }

    /**
     * Add the price of a customer item to the running total.
     */
    void ringUp(int rand, int cents) {
        runningTotal = runningTotal + rand*100+cents;
    }
    
    /**
     * Record the amount tendered by the customer.
     */
    void amountTendered(int rand, int cents) {
        amountTendered = rand*100+cents;
    }
    
    private String amount(int cents) {
        return String.format("R%d.%02d", cents/100, cents%100);
    }
    
    String status() {
        String result = "Running total: "+amount(runningTotal);
        if (amountTendered>0.0) {
            result = result +"\nAmount tendered: "+amount(amountTendered);
            result = result +"\nChange due: "+amount(amountTendered-runningTotal);
        }
        return result;
    }
    
    /**
     * Set the running total and amount tendered (and thus change due) to zero.
     */
    void reset() {
        amountTendered = 0;
        runningTotal = 0;
    }
    
}
