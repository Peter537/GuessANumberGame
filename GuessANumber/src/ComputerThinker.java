import java.util.Random;

public class ComputerThinker extends AComputerPlayer implements IThinker {

    private int secretNumber;

    public String getName() {
        return "Computer Thinker";
    }

    public void newGame(int min, int max, String opponent, String type) {
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
}