import java.math.*;
public class Dec_Round extends Decorator {
    public String convert(Conversion val) {
        String o_round = String.format("%.2f", new BigDecimal(val.getRound()));
        val.setRound(o_round);
        return super.convert(val);
    }
}
