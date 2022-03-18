
abstract public class Decorator implements Handler {
    protected Handler decorate;

    public void setChain(Handler handler) {
        this.decorate = handler;
    }

    public String convert(Conversion conversion) {
        return this.decorate.convert(conversion);
    }

    
}