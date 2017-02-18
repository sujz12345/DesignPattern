package Singleton;

/**
 * Created by sujinzhou on 17-2-18.
 * 饿汉式单例模式，线程安全
 */
public class Singleton {
    private static final Singleton ourInstance = new Singleton();


    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
