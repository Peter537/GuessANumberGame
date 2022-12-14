public class ComputerGuesser extends AComputerPlayer {

    private int min;
    private int max;

    public String getName() {
        return "Computer Guesser";
    }

    public void newGame(int min, int max, String opponent, String type) {
        this.min = min;
        this.max = max;
    }

    public int makeGuess() {
        return (min + max) / 2;
    }

    public void guessFeedback(Answer answer) {
        switch (answer) {
            case TOO_LOW -> min = ((min + max) / 2) + 1;
            case TOO_HIGH -> max = ((min + max) / 2) - 1;
            case CORRECT -> { /* do nothing */ }
            default -> throw new RuntimeException("This should never happen");
        }
    }
}