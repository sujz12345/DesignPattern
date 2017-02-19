package Builder;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("partA1");
    }

    @Override
    public void buildPartB() {
        product.setPartA("partB1");
    }

    @Override
    public void buildPartC() {
        product.setPartA("partC1");
    }

}
