package Builder;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public abstract class Builder {
    protected Product product = new Product();
    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    Product getProduct(){return product;}

}
