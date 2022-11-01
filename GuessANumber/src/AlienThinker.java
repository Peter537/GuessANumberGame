public class AlienThinker extends AComputerPlayer {

    private int secretNumber;

    public AlienThinker() {
        super();
    }

    public String getName() {
        return "Alien Thinker";
    }

    public void newGame(int min, int max, String opponent, String type) {
        this.secretNumber = -1;
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