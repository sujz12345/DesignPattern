package Mediator;

/**
 * Created by sujinzhou on 17-2-23.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

//    public AbstractMediator(Purchase purchase,Sale sale,Stock stock) {
//        this.purchase = purchase;
//        this.stock = stock;
//        this.sale = sale;
//    }


    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public abstract void execute(String str, Object...objects);



}
