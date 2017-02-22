package Proxy;

/**
 * Created by sujinzhou on 2017/2/22.
 */
public class Proxy implements Subject{
    private RealSubject subject = null;


    public Proxy(RealSubject _subject){
        this.subject = _subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){
        System.out.println("before process");
    }

    private void after(){
        System.out.println("after process");
    }

}
