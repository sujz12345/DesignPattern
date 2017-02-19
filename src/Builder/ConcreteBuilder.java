package Builder;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class ConcreteBuilder implements Builder{
    private Product product = new Product();
    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildPartC() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
