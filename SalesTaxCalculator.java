
public class SalesTaxCalculator {

    public static void main(String[] args) {
//        State IN = new Indiana();
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
//
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: state name and sale amount.");
            return;
        }
        String name = args[0];
        double saleAmt = Integer.parseInt(args[1]);
        double tax = 1;

        if (name.equals("Indiana")){
            State IN = new Indiana();
            tax = new SevenPercent().compute(saleAmt);

        }else if (name.equals("Alaska")){
            State AL = new Alaska();
            tax = new NoTax().compute(saleAmt);
        }else {
            System.out.println("State not in system");
            return;
        }

        System.out.println(String.format("The sales tax on $%.2f in %s is $%.2f.",
                saleAmt, name, tax));

      
    }
}
