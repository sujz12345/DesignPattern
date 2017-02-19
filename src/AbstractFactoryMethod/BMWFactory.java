package AbstractFactoryMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class BMWFactory extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new BMWProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new BMWProductB();
    }
}
