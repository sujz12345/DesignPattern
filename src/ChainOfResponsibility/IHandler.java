package ChainOfResponsibility;

import FactoryMethod.Product;

/**
 * Created by sujinzhou on 17-2-25.
 */
public abstract class IHandler {
    protected final static int FATHER_LEVEL_REQUEST = 1;
    protected final static int HUSBAND_LEVEL_REQUEST = 2;
    protected final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private IHandler nextHandler;

    public IHandler(int _handler){
        this.level = _handler;
    }

    public final void handleMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else {
            if(this.nextHandler != null){
                this.nextHandler.handleMessage(women);
            }else {
                System.out.println("已经没有地方请示了，按不同意处理");
            }

        }
    }


    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void response(IWomen women);

}
