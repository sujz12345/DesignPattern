package Command;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class ConcreteCommand implements Command{
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
