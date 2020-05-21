package lk.pathum;

public class Feature {
    public String name;

    public Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "name='" + name + '\'' +
                '}';
    }
}
