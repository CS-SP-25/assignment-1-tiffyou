public class Alaska extends State {
    public Alaska() {
//      call the State constructor passing it the unique state and corresponding tax amt
        super("Alaska", new NoTax());
    }
}
//create a subclass of State for the indv state ALaska