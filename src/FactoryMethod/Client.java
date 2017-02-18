package FactoryMethod;

/**
 * Created by sujinzhou on 17-2-18.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct.class);
    }
}
