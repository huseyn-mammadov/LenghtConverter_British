

public class Converter {
    

    public static String convert(Conversion conversion) {
        //You can add method (s) if necessary here or in a separate class to implement the converter logic using the patterns
		//static Convert(..) method?
		// Instantiating Handlers and setSuccessors?
		//Decorators?
        Handler c1 = new MileHandler();
        Handler c2 = new YardHandler();
        Handler c3 = new FootHandler();
        c1.setChain(c2);
        c2.setChain(c3);
        String value =  (c1.convert(conversion));
        conversion.setRound(value);
        Decorator r1 = new Dec_Round();
        Decorator r2 = new Dec_Format();
        Decorator r3 = new Dec_Manager();
        r1.setChain(r2);
        r2.setChain(r3);
        return (r1.convert(conversion));

    }
    public static void main(String[] args) {
        ConverterGUI ui = new ConverterGUI();
    }
}
