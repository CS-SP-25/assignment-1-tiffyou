<<<<<<< HEAD

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
        SalesTaxBehavior setTaxBehavior = null;

        if (args.length > 3) {
            System.out.println("Invalid input");
            return;
        }
//    check how many arguments(aka check if i guve a new percentage to set)
        else if (args.length ==2){
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

//check if i give a new percnetage tax value and set new tax behavior
        } else if (args.length == 3){
            name = args[0];
            saleAmt = Integer.parseInt(args[1]);
            setTax = Double.parseDouble(args[2]);
            if (setTax == 0){
                setTaxBehavior = new NoTax();
            } else if (setTax == 4.5){
                setTaxBehavior = new FourPointFivePercent();
            } else if (setTax == 7){
                setTaxBehavior= new SevenPercent();
            }
            tax = setTaxBehavior.compute(saleAmt);

        }

        System.out.println(String.format("The sales tax on $%.2f in %s is $%.2f.",
                saleAmt, name, tax));

    }
}
=======

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
>>>>>>> f3731cc42599d677573ca69b3edc0131eba023b8
