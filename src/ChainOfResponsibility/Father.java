package ChainOfResponsibility;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Father extends IHandler {

    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    void response(IWomen women) {
        System.out.println("------------女儿向父亲请示--------------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是同意\n");
    }
}
