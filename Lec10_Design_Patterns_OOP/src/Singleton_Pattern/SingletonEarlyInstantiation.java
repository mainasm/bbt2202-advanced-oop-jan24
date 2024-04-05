package Singleton_Pattern;

public class SingletonEarlyInstantiation {

    //The only class instance
    private static final SingletonEarlyInstantiation INSTANCE = new SingletonEarlyInstantiation();

    //Constructor prevents instantiation from other classes
    private SingletonEarlyInstantiation() {
        // private constructor to prevent others from instantiating this class
    }

    //The global access point
    public static SingletonEarlyInstantiation getInstance() {
        return INSTANCE;
    }

}
