import java.util.Scanner;

public class HumanThinker {

    private final Scanner scanner = new Scanner(System.in);
    private String name;

    public HumanThinker() {
        this.name = null;
    }

    public void yourTurn() {
        clearConsole();
        System.out.println(getName() + " it is now your turn.");
        System.out.println("Press ENTER when ready!");
        clearConsole();
    }

    public void clearConsole() {
        // clears the console
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public String getName() {
        if (name == null) {
            System.out.print("Thinker, please enter your name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public void newGame(int min, int max, String opponent) {
        System.out.println("A new game is about to start. You are the thinker.");
        System.out.println("You are playing against " + opponent + ".");
        System.out.println("The range is from " + min + " to " + max + ".");
        System.out.println("Please think of a number and press ENTER when ready.");
        scanner.nextLine();
    }

    public Answer evaluateGuess(int guess, String opponent) {
        System.out.println(opponent + " guessed: " + guess);
        System.out.println(" 1 - Too low");
        System.out.println(" 2 - Too high");
        System.out.println(" 3 - Correct");
        while (true) {
            System.out.println("Enter your answer (1, 2 or 3): ");
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    return Answer.TOO_LOW;
                case "2":
                    return Answer.TOO_HIGH;
                case "3":
                    return Answer.CORRECT;
                default:
                    break;
            }
        }
    }

    public void endOfGame(int numberOfGuesses, String opponent) {
        System.out.println("Game over.");
        System.out.println(opponent + " used " + numberOfGuesses + " guesses to guess your secret number.");
    }
}