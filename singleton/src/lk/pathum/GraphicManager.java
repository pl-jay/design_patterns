package lk.pathum;

public class GraphicManager {

    private static volatile GraphicManager instance = null;

    private GraphicManager() {
        if(instance != null){
            throw new RuntimeException("User getInstance() to create");
        }
    }

    public static GraphicManager getInstance() {
        if (instance == null ) {
            synchronized(GraphicManager.class){
                if(instance == null ) {
                    instance = new GraphicManager();
                }
            }
        }
        return instance;
    }
}