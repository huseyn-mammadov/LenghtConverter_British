

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
        return (c1.convert(conversion));
    }
    public static void main(String[] args) {
        ConverterGUI ui = new ConverterGUI();
    }
}
