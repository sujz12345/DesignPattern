package Builder;

/**
 * Created by sujinzhou on 2017/2/19.
 */
public class Director {
    private  Builder builder;

    public Director(Builder b){
        this.builder = b;
    }

    public Product getAProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
       return  builder.getProduct();
    }
}
