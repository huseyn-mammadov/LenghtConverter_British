
public class Conversion {
    private double value;
    private String unit;
    private String round;
    

    public Conversion(String unit, double value) {
        this.unit = unit;
        this.value = value;
        this.round = "";
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }
}
