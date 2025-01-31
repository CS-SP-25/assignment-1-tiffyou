public interface SalesTaxBehavior {
    public double compute(double value);
}

/*
 *seperate the things that vary from the things that stay the same
 *by creating a interface of the behvior that changes (diff sales
 *tax percentage for different states)
 */
