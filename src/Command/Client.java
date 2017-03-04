package Command;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();//在具体的实现中，可以封装这个对象，减少高层模块（客户端）对底层模块（receiver）的依赖
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
