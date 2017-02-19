package TemplateMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("step1:concreteClass2.doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("step2:concreteClass2.doAnything");
    }
}
