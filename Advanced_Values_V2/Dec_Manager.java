
public class Dec_Manager extends Decorator {

    public String convert(Conversion val) {
        String unit = val.getUnit();
        if ((unit.equals("Yard")) ) {
            String last_round = val.getRound() + " Yards";
            val.setRound(last_round);
        } else if (unit.equals("Mile")) {
            String last_round = val.getRound() + " Miles";
            val.setRound(last_round);
        } else {
            String last_round = val.getRound() + " Feet";
            val.setRound(last_round);
        }
        return val.getRound();
    }
}
