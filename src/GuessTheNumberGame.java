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
            System.out.println("--------->>>>> El número es mayor");
        } else if(guess<targetNumber) {
            System.out.println("--------->>>>> El número es menor");
        } else {
            System.out.println("*** Número acertado ***");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> guessesHuman = new ArrayList<>();
        ArrayList<Integer> guessesComputer = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("<<GUESS THE NUMBER>>");
        System.out.println("Es un juego interactivo, donde la jugadora y la computadora se turnan para intentar adivinar un número aleatorio entre 1 y 100.");
        System.out.println("Deben tener en cuenta la tentativa anterior, si fue muy alta o muy baja");
        System.out.print("Por favor, ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        //System.out.println("Número a adivinar " + guessTheNumberGame.targetNumber);

        HumanPlayer humanPlayer = new HumanPlayer(playerName,guessesHuman);
        System.out.println("Hola, " + humanPlayer.getName() + ". ¡Juguemos! Empiezas tú");

        ComputerPlayer computerPlayer = new ComputerPlayer("Computadora", guessesComputer);
        boolean resultHuman = false;
        boolean resultComputer = false;
        do {
            if(!resultHuman) {
                resultHuman = guessTheNumberGame.checkGuess(humanPlayer);
                guessesHuman = humanPlayer.getGuesses();
            }

            if(!resultComputer && !resultHuman) {
                resultComputer = guessTheNumberGame.checkGuess((computerPlayer));
                guessesComputer = computerPlayer.getGuesses();
            }

        } while(!resultHuman && !resultComputer);

        if(resultHuman) {
            System.out.println("Estos son tus intentos: " + guessesHuman);
        } else {
            System.out.println("Estos son los intentos de la computadora: " + guessesComputer);
        }
        System.out.print("Fin del juego :D");

    }

}