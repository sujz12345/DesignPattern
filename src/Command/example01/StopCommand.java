package Command.example01;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class StopCommand implements Command {
    private AudioPlayer player = null;

    public StopCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
