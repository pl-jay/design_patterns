package lk.pathum;

public class Processor extends Handler {
    @Override
    public void process(Number request) {
        successor.process(request);
    }
}
