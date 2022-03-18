
public class YardHandler implements Handler {
    private Handler chain;

    @Override
    public void setChain(Handler newChain) {
        this.chain = newChain;
    }

    @Override
    public String convert(Conversion conversion) {
        if (conversion.getUnit().equals("Yard")) {
            double finalValue = conversion.getValue() * 1093.61;
            return Double.toString(finalValue);
        } else {
            return (this.chain.convert(conversion));
        }
    }
}
