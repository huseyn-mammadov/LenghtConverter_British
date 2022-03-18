

public class MileHandler implements Handler {
    private Handler chain;

    @Override
    public void setChain(Handler newChain) {
        this.chain = newChain;
    }

    @Override
    public String convert(Conversion conversion) {
        if (conversion.getUnit().equals("Mile")) {
            double finalValue = conversion.getValue() * 0.621371;
            return Double.toString(finalValue);
        } else {
            return (this.chain.convert(conversion));
        }
    }
}
