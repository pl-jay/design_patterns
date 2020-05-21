package lk.pathum;

import java.util.ArrayList;

public class GameObject {
    ArrayList<Feature> featuresList = new ArrayList<>();

    public void  addFeature(Feature feature) {
        featuresList.add(feature);
    }

    public ArrayList getFeature() {
        return (ArrayList) featuresList.clone();
    }

    public ObjectMemento save() {
        return new ObjectMemento(getFeature());
    }

    public void revertFeature(ObjectMemento memento) {
        featuresList = memento.getFeatures();
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "featuresList=" + featuresList +
                '}';
    }
}
