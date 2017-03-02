package Mediator;

/**
 * Created by sujinzhou on 17-2-23.
 */
public class Stock extends AbstractColleague{
    public Stock(AbstractMediator mediator) {
        super(mediator);
        mediator.setStock(this);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number){
        COMPUTER_NUMBER += number;
        System.out.println("库存为数量"+COMPUTER_NUMBER);
    }


    public void decrease(int number){
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为"+COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    public void clearStcok(){
        System.out.println("清理存货数量为" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}

