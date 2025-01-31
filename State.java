
import java.text.DecimalFormat;

import static java.lang.Math.round;

public class State {
    /*
     *intialize private instance variables
     *create a instance var that is a sales tax behavior
     *so we can update/change each states sale tax behvior
     *accordingly (7% or no tax)
     */

    private SalesTaxBehavior salesTaxBehavior;
    private String NAME;

//    create constructor
    public State(String name, SalesTaxBehavior saleTax){
        this.NAME = name;
        this.salesTaxBehavior = saleTax;
    }

    /**
     * gets the State name
     * @return String name of State
     */
    public String getName(){
        return NAME;
    }

    /**
     * sets the current name to new name
     * @param newName String of the new name you want to set
     */
    public void setName(String newName){
        this.NAME = newName;
    }

    /**
     * shows the tax amt of a value
     * @param value dollars
     */
    public void showTax(double value){
        double tax = salesTaxBehavior.compute(value);
        System.out.println((tax));

    }

    /**
     * help set tax behavior dynamically during runtime
     * @param newTaxBehavior new tax behavior
     */
    public void setTaxBehavior(SalesTaxBehavior newTaxBehavior){
        this.salesTaxBehavior = newTaxBehavior;
    }
}