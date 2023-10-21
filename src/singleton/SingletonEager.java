package singleton;
public class SingletonEager {
    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getSingleton(){        
        return singleton;
    }
}
