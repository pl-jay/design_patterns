package lk.pathum;

public class PositiveProcessor extends Handler {
    @Override
    public void process(Number request) {
        if(request.getNumber() > 0) {
            System.out.println("Positive Processor :" + request.getNumber());
        } else {
            successor.process(request);
        }
    }
}
