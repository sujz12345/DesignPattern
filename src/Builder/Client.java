package Builder;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class Client {
    public static void main(String[] args) {
        Builder b = new ConcreteBuilder();
        Director d = new Director(b);
        Product p = d.getAProduct();

    }
}
