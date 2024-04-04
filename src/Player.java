import java.util.ArrayList;
public abstract class Player {

    private String name;
    private ArrayList<Integer>  guesses; //array dinámico

    public Player(String name, ArrayList<Integer> guesses) {
        this.name = name;
        this.guesses = guesses;
    }

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
      public abstract int makeGuess();

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
    public void setGuesses (ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }
}
