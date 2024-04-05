import java.util.ArrayList;

public class ComputerPlayer extends Player{

    public ComputerPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }
    public int makeGuess () {
        return 1;
    }
}
