

public class Dec_Format extends Decorator {

    public String convert(Conversion val) {
        double orig = Double.parseDouble(val.getRound());
        String with_round = String.format("%.1e", orig);
        val.setRound(with_round);
        return super.convert(val);
    }
}
