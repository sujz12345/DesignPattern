package Command.example01;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class RewindCommand implements Command{
    private AudioPlayer player = null;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
