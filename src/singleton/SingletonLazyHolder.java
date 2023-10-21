package singleton;
public class SingletonLazyHolder {
    private static class SingletonHolder {
        private static SingletonLazyHolder singleton = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getSingleton(){        
        return SingletonHolder.singleton;
    }
}
