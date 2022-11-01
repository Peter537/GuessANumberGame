import java.util.Random;

public class ComputerGuesserRandom extends AComputerPlayer {

    private final Random random = new Random();
    private int min;
    private int max;
    private int guess;

    public String getName() {
        return "Computer Guesser Random";
    }

    public void newGame(int min, int max, String opponent, String type) {
        this.min = min;
        this.max = max;
    }

    public int makeGuess() {
        guess = random.nextInt(max - min + 1) + min;
        return guess;
    }

    public void guessFeedback(Answer answer) {
        switch (answer) {
            case TOO_LOW -> min = guess + 1;
            case TOO_HIGH -> max = guess - 1;
            case CORRECT -> { /* do nothing */ }
            default -> throw new RuntimeException("This should never happen");
        }
    }
}
