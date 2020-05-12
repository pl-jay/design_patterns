package lk.pathum;

public class Main {

    public static void main(String[] args) {

        GraphicManager graphicManager = GraphicManager.getInstance();
        System.out.println(graphicManager);

        GraphicManager graphicManager1 = GraphicManager.getInstance();
        System.out.println(graphicManager1);
    }
}
