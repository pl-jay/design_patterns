package lk.pathum;

public class Main {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        GameObject gameObject = new GameObject();

        gameObject.addFeature(new Feature("physics"));
        gameObject.addFeature(new Feature("health"));

        careTaker.save(gameObject);
        System.out.println(gameObject);

        gameObject.addFeature(new Feature("inertia"));
        careTaker.save(gameObject);
        System.out.println(gameObject);

        gameObject.addFeature(new Feature("weigh"));
        //careTaker.save(gameObject);
        System.out.println(gameObject);

        careTaker.revert(gameObject);
        System.out.println(gameObject);

        careTaker.revert(gameObject);
        System.out.println(gameObject);

        gameObject.addFeature(new Feature("height"));
        //careTaker.save(gameObject);
        System.out.println(gameObject);

        careTaker.revert(gameObject);
        System.out.println(gameObject);

    }

}
