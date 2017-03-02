package Mediator;

import java.util.Random;

/**
 * Created by sujinzhou on 17-2-23.
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator mediator) {
        super(mediator);
        mediator.setSale(this);
    }

    public int getStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM的销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑"+"台");
    }

    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
