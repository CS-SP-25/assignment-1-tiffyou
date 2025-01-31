public class FourPointFivePercent implements SalesTaxBehavior {
//    Ovveride so it compute 4.5% tax of given amount
    @Override
    public double compute(double value) {
        return value * 0.045;
    }
}
