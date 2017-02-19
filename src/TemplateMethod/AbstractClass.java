package TemplateMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public abstract class AbstractClass {
    //基本方法，由子类去实现,尽量设置为protected
    protected abstract void doSomething();
    protected abstract void doAnything();

    //模板方法，定义具体的操作步骤，可以增加final关键字，防止被子类覆盖
    public void templateMethod(){
        this.doSomething();
        this.doAnything();
    }

}
