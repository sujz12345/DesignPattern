package TemplateMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass();
        class1.templateMethod();

        AbstractClass class2 = new ConcreteClass2();
        class2.templateMethod();
    }
}
