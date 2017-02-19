package AbstractFactoryMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class BenzFactory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new BenzProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new BenzProductB();
    }
}
