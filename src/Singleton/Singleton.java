package Singleton;

/**
 * Created by sujinzhou on 17-2-18.
 * 饿汉式单例模式，线程安全
 * 单例模式不能被继承，因为构造函数被设置为private。
 * 平时在继承的时候，子类的构造函数都会隐式的调用父类的构造函数
 */
public class Singleton {
    private static final Singleton ourInstance = new Singleton();


    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
