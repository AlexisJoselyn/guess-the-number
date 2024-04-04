import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        ArrayList<Integer> guesses = new ArrayList<>();
        guesses.add(9);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        System.out.println("<<GUESS THE NUMBER>>");
        System.out.print("Por favor, ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        HumanPlayer humanPlayer = new HumanPlayer(playerName,guesses);
        humanPlayer.makeGuess();

    }

    public boolean checkGuess (Player player) {
        return true;
    }

}