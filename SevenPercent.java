public class SevenPercent implements SalesTaxBehavior {
    /**
     * compute the 7% tax value from a given amt
     * @param value double dollar amount price
     * @return double dollar and cent amount of sales tax
     */
    @Override
    public double compute(double value){
        return value * 0.07 ;
    }
}
/*
 *create a new class that implements the changing behviour interface
 *(the sales tax behavior) and override the interface method compute
 *to reflect a seven percent tax
 */
