package Command.example01;

/**
 * Created by sujinzhou on 17-2-25.
 */
public class Julia {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        Command playCommand = new PlayCommand(player);
        Command stopCommand = new StopCommand(player);
        Command rewindCommand = new RewindCommand(player);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        keypad.stop();
        keypad.rewind();
        keypad.play();


        player.play();
        player.stop();
        player.rewind();
    }
}
