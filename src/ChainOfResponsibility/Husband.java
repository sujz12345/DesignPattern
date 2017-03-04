package ChainOfResponsibility;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Husband extends IHandler{
    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    void response(IWomen women) {
        System.out.println("------------妻子向丈夫请示--------------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是同意\n");
    }
}
