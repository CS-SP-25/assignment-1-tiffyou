public class Hawaii extends State{
//    constructor for new state
    public Hawaii(){
//        super for state constructor and making sure it defaults to 4.5% tax
        super("Hawaii", new FourPointFivePercent());
    }
}
