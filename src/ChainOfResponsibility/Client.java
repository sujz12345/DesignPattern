package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sujinzhou on 17-2-25.
 * 来自《设计模式之禅》
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(4);
            System.out.println(r);
            IWomen women = new Women(r,"我要出去逛街");
            list.add(women);
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : list) {
            father.handleMessage(women);
        }

    }
}
