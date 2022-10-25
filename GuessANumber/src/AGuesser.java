public abstract class AGuesser {

    public abstract void yourTurn();

    public abstract String getName();

    public abstract void newGame(int min, int max, String opponent);

    public abstract int makeGuess();

    public abstract void guessFeedback(Answer answer);

    public abstract void endOfGame(int numberOfGuesses, String opponent);

}