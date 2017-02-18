package Singleton;

/**
 * Created by sujinzhou on 17-2-18.
 * 懒汉式单例模式，线程不安全
 */
public class Singleton2 {
    private static  Singleton2 singleton2 = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
