package Mediator;

/**
 * Created by sujinzhou on 17-2-23.
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
        mediator.setPurchase(this);
    }
    public void buyIBMComputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }


}
