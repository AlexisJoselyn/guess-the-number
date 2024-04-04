import java.util.ArrayList;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }

    public int makeGuess () {
        System.out.println("Hola, " + getName() + ". ¡Juguemos!");
        return 1;
    }
}
