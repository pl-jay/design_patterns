package lk.pathum;

public class NegativeProcessor extends Handler {


    @Override
    public void process(Number request) {
        if(request.getNumber() < 0) {
            System.out.println("Negative Processor: " + request.getNumber());
        } else {
            successor.process(request);
        }

    }
}
