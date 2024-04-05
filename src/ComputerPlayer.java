import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }
    public int makeGuess () {
        Random random = new Random();
        int guess = random.nextInt(100) + 1;
        System.out.println(getName() + " Tu suposición es: " + guess);

        getGuesses().add(guess);

        return guess;
    }
}
