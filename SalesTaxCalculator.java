
public class SalesTaxCalculator {

    public static void main(String[] args) {
//        State IN = new Hawaii();
//        System.out.println(IN.getName());
//        IN.setName("not Indiana");
//        System.out.println(IN.getName());
//        IN.showTax(1000);
//
//        System.out.println();
//
//        State AL = new Alaska();
//        System.out.println(AL.getName());
//        AL.setName("not Alaska");
//        System.out.println(AL.getName());
//        AL.showTax(1000);
////
//        State HI = new Hawaii();
//        HI.showTax(100);
//        HI.setTaxBehavior(new NoTax());
//        HI.showTax(100);

//intialise my variables
        String name = "";
        double saleAmt = 0;
        double tax = -1;
        double setTax = -1;
        if (args.length > 3) {
            System.out.println("Invalid input");
            return;
        }
        name = args[0];
        saleAmt = Integer.parseInt(args[1]);

        if (name.equals("Indiana")){
            State IN = new Indiana();
            tax = new SevenPercent().compute(saleAmt);
        }else if (name.equals("Alaska")){
            State AL = new Alaska();
            tax = new NoTax().compute(saleAmt);
        } else if (name.equals("Hawaii")){
            State HI = new Hawaii();
            tax = new FourPointFivePercent().compute(saleAmt);

        }


        System.out.println(String.format("The sales tax on $%.2f in %s is $%.2f.",
                saleAmt, name, tax));

    }
}