import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanGuesser extends AGuesser {

    private final Scanner scanner = new Scanner(System.in);
    private String name;

    public HumanGuesser() {
        this.name = null;
    }

    public void yourTurn() {
        // clears the console
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.println(getName() + " it is now your turn.");
        System.out.println("Press ENTER when ready!");
        scanner.nextLine();
        // clears the console
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public String getName() {
        if (name == null) {
            System.out.print("Guesser, please enter your name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public void newGame(int min, int max, String opponent) {
        System.out.println("A new game is about to start. You are the guesser.");
        System.out.println("You are playing against " + opponent + ".");
        System.out.println("The range is from " + min + " to " + max + ".");
        System.out.println("Press ENTER when you are ready.");
        scanner.nextLine();
    }

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
        System.out.println("You guessed " + opponent + "'s number in " + numberOfGuesses
                + (numberOfGuesses == 1 ? " guess." : " guesses."));
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }
}