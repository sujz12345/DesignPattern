package Proxy;

/**
 * Created by sujinzhou on 2017/2/22.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实对象");
    }
}
