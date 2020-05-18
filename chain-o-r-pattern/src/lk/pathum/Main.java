package lk.pathum;

public class Main {

    public static void main(String[] args) {

        NegativeProcessor handlerNegativeProcessor = new NegativeProcessor();
        ZeroProcessor handlerZeroProcessor = new ZeroProcessor();
        PositiveProcessor handlerPositiveProcessor = new PositiveProcessor();
        Processor processor = new Processor();

        processor.setSuccessor(handlerNegativeProcessor);
        handlerNegativeProcessor.setSuccessor(handlerZeroProcessor);
        handlerZeroProcessor.setSuccessor(handlerPositiveProcessor);




        System.out.println("----------------------------");
        processor.process(new Number(53));
        processor.process(new Number(0));
        processor.process(new Number(-100));
        System.out.println("----------------------------");



    }
}
