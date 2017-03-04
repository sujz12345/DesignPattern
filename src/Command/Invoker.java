package Command;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Invoker {
    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
