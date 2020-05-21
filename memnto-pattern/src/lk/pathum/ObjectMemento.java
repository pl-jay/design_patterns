package lk.pathum;

import java.util.ArrayList;

public class ObjectMemento {
    ArrayList<Feature> features;

    public ObjectMemento(ArrayList<Feature> features) {
        this.features = features;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }
}
