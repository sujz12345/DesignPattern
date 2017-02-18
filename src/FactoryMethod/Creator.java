package FactoryMethod;

/**
 * Created by sujinzhou on 17-2-18.
 */
public abstract  class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
