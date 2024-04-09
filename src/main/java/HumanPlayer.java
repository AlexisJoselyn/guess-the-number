import java.util.Scanner;
import java.util.ArrayList;


public class HumanPlayer extends Player{
    public HumanPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }

    public int makeGuess () {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getName() + ", introduce tu suposición (número): ");
        int guess = scanner.nextInt();

        getGuesses().add(guess);

        return guess;
    }
}
