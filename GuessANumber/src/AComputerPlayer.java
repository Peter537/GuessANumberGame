public abstract class AComputerPlayer implements IPlayer {

    public void yourTurn() { }

    public boolean endOfGame(int numberOfGuesses, String opponent) {
        return true;
    }

    // ************************************************************
    // Dummy methods to make IPlayer work
    public Answer evaluateGuess(int guess, String opponent) {
        return null;
    }

    public int makeGuess() {
        return -1;
    }

    public void guessFeedback(Answer answer) { }
    // ************************************************************
}