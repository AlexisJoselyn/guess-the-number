import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;

class GuessTheNumberGameTest {
    @Test
    void guessTheNumberGame() {

        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        assertNotNull(guessTheNumberGame, "el juego se incializa correctamente");
    }
    @Test
    void computerMakeGuess() {
        ArrayList<Integer> guesses = new ArrayList<>();
        ComputerPlayer computerPlayer = new ComputerPlayer("computerTest", guesses);
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >=1 && guess <=100, "Debería estar entre 1 y 100");
    }

    @Test
    void humanMakeGuess() {
        ArrayList<Integer> guesses = new ArrayList<>();
        HumanPlayer player = new HumanPlayer("humanTest", guesses);

        ByteArrayInputStream inputStream = new ByteArrayInputStream("100".getBytes());
        System.setIn(inputStream);

        int guess = player.makeGuess();

        assertNotEquals(0, guess, "Debería ser 100");
        assertFalse(guess < 1, "Debería ser mayor que 1");
    }

}