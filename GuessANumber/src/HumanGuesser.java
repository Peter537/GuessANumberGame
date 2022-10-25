import java.util.InputMismatchException;

public class HumanGuesser extends AHumanPlayer implements IGuesser {

    public int makeGuess() {
        System.out.print("Make your guess: ");
        while (true) {
            try {
                int guess = scanner.nextInt();
                scanner.nextLine();
                return guess;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input, please try again: ");
            }
        }
    }

    public void guessFeedback(Answer answer) {
        System.out.print("You guess was ");
        switch (answer) {
            case TOO_LOW -> System.out.println("too low.");
            case TOO_HIGH -> System.out.println("too high.");
            case CORRECT -> System.out.println("correct!");
            default -> throw new RuntimeException("This should never happen");
        }
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }

    public void endOfGame(int numberOfGuesses, String opponent) {
        System.out.println("Game over.");
        System.out.println("You used " + numberOfGuesses
                + (numberOfGuesses == 1 ? " guess " : " guesses ") + "to guess " + opponent + "'s secret number.");
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }
}