

public class FootHandler implements Handler {
    private Handler chain;

    @Override
    public void setChain(Handler newChain) {
        this.chain = newChain;
    }

    @Override
    public String convert(Conversion conversion) {
        if (conversion.getUnit().equals("Foot")) {
            double finalValue = conversion.getValue() * 3280.84;
            return Double.toString(finalValue);
        } else {
            return (this.chain.convert(conversion));
        }
    }
}
