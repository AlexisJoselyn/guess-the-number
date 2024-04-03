import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        System.out.print("Por favor, ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        System.out.println("¡Hello!, " + playerName + " welcome to Guess the number - " + targetNumber);
    }

    public boolean checkGuess (Player player) {
        return true;
    }

}