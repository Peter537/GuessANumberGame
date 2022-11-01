public class HumanGuesser extends AHumanPlayer {

    public int makeGuess() {
        System.out.print("Make your guess: ");
        while (true) {
            try {
                String guess = scanner.nextLine();
                return Integer.parseInt(guess);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, please try again: ");
            }
        }
    }

    public void guessFeedback(Answer answer) {
        System.out.print("Your guess was ");
        switch (answer) {
            case TOO_LOW -> System.out.println("too low.");
            case TOO_HIGH -> System.out.println("too high.");
            case CORRECT -> System.out.println("correct!");
            default -> throw new RuntimeException("This should never happen");
        }
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }

    public boolean endOfGame(int numberOfGuesses, String opponent) {
        System.out.println("Game over.");
        System.out.println("You used " + numberOfGuesses + (numberOfGuesses == 1 ? " guess " : " guesses ")
                + "to guess " + opponent + "'s secret number.");
        return playAgain();
    }
}