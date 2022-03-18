public interface Handler {
    void setChain(Handler newChain);
    String convert(Conversion conversion);

}
