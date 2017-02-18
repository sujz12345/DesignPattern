package Singleton;

/**
 * Created by sujinzhou on 17-2-18.
 * 懒汉式单例模式，线程不安全
 */
public class Singleton3 {
    private static  Singleton3 singleton3 = null;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(singleton3 == null){
            synchronized (Singleton3.class){
                singleton3 = new Singleton3();
            }

        }
        return singleton3;
    }

}
