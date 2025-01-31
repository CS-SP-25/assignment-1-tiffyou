public class NoTax implements SalesTaxBehavior {
    @Override
    /**
     * compute the no tax value from a given amt
     * @param value double dollar amount price
     * @return double dollar and cent amount of sales tax
     */
    public double compute(double value){
        return 0.00;
    }
}

/*
 *create a new class that implements the changing behviour interface
 *(the sales tax behavior) and override the interface method compute
 *to reflect no tax
 */