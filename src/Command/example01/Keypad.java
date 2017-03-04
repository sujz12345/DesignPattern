package Command.example01;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Keypad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;


    public void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }

    public Command getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public Command getRewindCommand() {
        return rewindCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public Command getStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }
}
