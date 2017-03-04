package Mediator;

/**
 * Created by sujinzhou on 17-2-23.
 */
public class ConcreteMediator extends AbstractMediator{

//    public ConcreteMediator(Purchase purchase, Sale sale, Stock stock) {
//        super(purchase, sale, stock);
//    }

    @Override
    public void execute(String str,Object...objects){
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){
            this.offSell();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus =  super.sale.getStatus();
        if(saleStatus > 80){
            System.out.println("采购IBM电脑+"+number+"+台");
            this.stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.println("采购IBM电脑"+buyNumber+"台");
        }
    }

    private void sellComputer(int number){
        if(super.stock.getStockNumber() < number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售电脑"+stock.getStockNumber()+"台");
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
