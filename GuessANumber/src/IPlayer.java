public interface IPlayer extends IThinker, IGuesser {

    void yourTurn();

    String getName();

    void newGame(int min, int max, String opponent, String type);

    boolean endOfGame(int numberOfGuesses, String opponent);
}