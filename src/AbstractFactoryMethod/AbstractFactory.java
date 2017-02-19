package AbstractFactoryMethod;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public abstract class AbstractFactory {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();

}
