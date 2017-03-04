package ChainOfResponsibility;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Son extends IHandler{
    public Son(){
        super(SON_LEVEL_REQUEST);
    }
    @Override
    void response(IWomen women) {
        System.out.println("------------母亲向儿子请示--------------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是同意\n");
    }
}
