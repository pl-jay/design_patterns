package lk.pathum;

import java.util.Stack;

public class CareTaker {

    Stack<ObjectMemento> history = new Stack<>();

    public void save(GameObject gameObject) {
        history.push(gameObject.save());
    }

    public void revert(GameObject gameObject) {
        if(!history.empty()) {
            gameObject.revertFeature(history.pop());
        } else {
            System.out.println("cannot undo !");
        }
    }
}
