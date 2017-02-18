package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sujinzhou on 17-2-18.
 * 单例模式的扩展，获取固定数量的实例，这里的例子表示可以获取两个实例
 */
public class Singleton4 {
    private static int count = 2;
    private static  List<Singleton4> list = new ArrayList<Singleton4>();

    static{
        for (int i = 0; i < count; i++) {
            list.add(new Singleton4());
        }
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        Random r = new Random();
        int c = r.nextInt(count);
        return  list.get(c);
    }
}
