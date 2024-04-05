import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GuessTheNumberGame {
    private final int targetNumber;
    public GuessTheNumberGame() {
        Random random = new Random();
        this.targetNumber = random.nextInt(100) + 1;
    }
    private boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if(guess>targetNumber){
            System.out.println("Tú número es mayor");
        } else if(guess<targetNumber) {
            System.out.println("Tú número es menor");
        } else {
            System.out.println("Adivinaste");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> guesses = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("<<GUESS THE NUMBER>>");
        System.out.print("Por favor, ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        HumanPlayer humanPlayer = new HumanPlayer(playerName,guesses);
        System.out.println("Hola, " + humanPlayer.getName() + ". ¡Juguemos!");

        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        System.out.println("Número a adivinar " + guessTheNumberGame.targetNumber);
        guessTheNumberGame.checkGuess(humanPlayer);

        ComputerPlayer computerPlayer = new ComputerPlayer("Computer Player", guesses);
        guessTheNumberGame.checkGuess((computerPlayer));

    }

}