package Mediator;

/**
 * Created by sujinzhou on 17-2-24.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();
        Purchase p = new Purchase(mediator);
        Stock s = new Stock(mediator);
        Sale sale = new Sale(mediator);
        System.out.println(s.getStockNumber());
        p.buyIBMComputer(20);
        System.out.println(s.getStockNumber());

    }
}
