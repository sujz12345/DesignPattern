package AbstractFactoryMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory bmwFactory = new BMWFactory();
        bmwFactory.createProductA();
        bmwFactory.createProductB();

        AbstractFactory benzFactory = new BenzFactory();
        benzFactory.createProductA();
        benzFactory.createProductB();

    }
}
