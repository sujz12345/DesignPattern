package ChainOfResponsibility;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Women implements IWomen{

    private int type = 0;
    private String request ="";

    public Women(int type, String request) {
        this.type = type;
        switch (type){
            case 1 :
                this.request += "女儿的请求是:"+request;
                break;
            case 2 :
                this.request +="妻子的请求是:"+request;
                break;
            case 3 :
                this.request += "母亲的请求是:"+request;
                break;
        }
    }

    @Override
    public String getRequest() {
        return this.request;
    }

    @Override
    public int getType() {
        return this.type;
    }
}
