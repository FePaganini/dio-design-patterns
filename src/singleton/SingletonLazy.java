package singleton;

public class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getSingleton(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        
        return singleton;
    }
}
