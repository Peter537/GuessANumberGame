public abstract class AThinker {

    public abstract void yourTurn();

    public abstract String getName();

    public abstract void newGame(int min, int max, String opponent);

    public abstract Answer evaluateGuess(int guess, String opponent);

    public abstract void endOfGame(int numberOfGuesses, String opponent);
}