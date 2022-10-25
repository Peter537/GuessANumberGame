public class GameControl {

    private final int min;
    private final int max;

    public GameControl(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void runGame(IThinker thinker, IGuesser guesser) {
        String thinkerName = thinker.getName();
        String guesserName = guesser.getName();

        boolean thinkerPlayAgain;
        boolean guesserPlayAgain;
        do {
            // Thinker start game
            thinker.yourTurn();
            thinker.newGame(min, max, guesserName, "Thinker");
            // Guesser start game
            guesser.yourTurn();
            guesser.newGame(min, max, thinkerName, "Guesser");

            // Game main loop
            Answer answer;
            int numberOfGuesses = 0;
            do {
                // Guesser turn
                int guess = guesser.makeGuess();
                numberOfGuesses++;
                // Thinker turn
                thinker.yourTurn();
                answer = thinker.evaluateGuess(guess, guesserName);
                // Guesser turn
                guesser.yourTurn();
                guesser.guessFeedback(answer);
            } while (answer != Answer.CORRECT);
            guesserPlayAgain = guesser.endOfGame(numberOfGuesses, thinkerName);
            thinker.yourTurn();
            thinkerPlayAgain = thinker.endOfGame(numberOfGuesses, guesserName);
            System.out.println("End of game! " + numberOfGuesses + (numberOfGuesses == 1 ? " guess " : " guesses ") + "was used!");
        } while (thinkerPlayAgain && guesserPlayAgain);
        System.out.println("Goodbye!");
    }
}