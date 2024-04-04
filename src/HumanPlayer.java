import java.util.Scanner;
import java.util.ArrayList;


public class HumanPlayer extends Player{
    public HumanPlayer(String name, ArrayList<Integer> guesses) {
        super(name, guesses);
    }

    public int makeGuess () {
        System.out.println("Hola, " + getName() + ". ¡Juguemos!" + getGuesses());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu suposición (número): ");
        int guess = scanner.nextInt();

        getGuesses().add(guess);
        System.out.println("Intentos: " + getGuesses());

        return guess;
    }
}
