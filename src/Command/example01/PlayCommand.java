package Command.example01;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class PlayCommand implements Command{
    private AudioPlayer player = null;

    public PlayCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
