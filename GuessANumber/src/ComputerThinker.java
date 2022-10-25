import java.util.Random;

public class ComputerThinker extends AThinker {

    private int secretNumber;

    public void yourTurn() { }

    public String getName() {
        return "Computer Thinker";
    }

    public void newGame(int min, int max, String opponent) {
        this.secretNumber = new Random().nextInt(max - min + 1) + min;
    }

    public Answer evaluateGuess(int guess, String opponent) {
        if (guess < secretNumber) {
            return Answer.TOO_LOW;
        } else if (guess > secretNumber) {
            return Answer.TOO_HIGH;
        } else {
            return Answer.CORRECT;
        }
    }

    public void endOfGame(int numberOfGuesses, String opponent) { }
}