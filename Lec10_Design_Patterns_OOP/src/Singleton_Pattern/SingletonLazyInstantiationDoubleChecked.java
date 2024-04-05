package Singleton_Pattern;

public class SingletonLazyInstantiationDoubleChecked {

    //Private instance variable
    private static volatile SingletonLazyInstantiationDoubleChecked instance;

    //Private constructor
    private SingletonLazyInstantiationDoubleChecked() {
        // private constructor
    }

    //Public method with lazy instantiation check
    public static SingletonLazyInstantiationDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyInstantiationDoubleChecked.class) {
                if (instance == null) {
                    instance = new SingletonLazyInstantiationDoubleChecked();
                }
            }
        }
        return instance;
    }

}
