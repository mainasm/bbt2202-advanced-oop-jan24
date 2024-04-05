package Singleton_Pattern;

public class SingletonLazyInstantiation {

    //Only class instance
    private static SingletonLazyInstantiation instance;

    private SingletonLazyInstantiation() {
        // private constructor
    }

    //Method accessible by only one thread at a time (thread-safety)
    public static synchronized SingletonLazyInstantiation getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInstantiation();
        }
        return instance;
    }

}
