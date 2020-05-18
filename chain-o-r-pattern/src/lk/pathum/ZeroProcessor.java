package lk.pathum;

public class ZeroProcessor extends Handler {
    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("Zero Processor: "+request.getNumber());
        } else {
            successor.process(request);
        }
    }
}
