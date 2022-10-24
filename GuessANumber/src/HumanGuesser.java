import java.util.Scanner;

public class HumanGuesser {

    private final Scanner scanner = new Scanner(System.in);
    private String name;

    public HumanGuesser() {
        this.name = null;
    }

    public void yourTurn() {
        clearConsole();
        System.out.println(getName() + " it is now your turn.");
        System.out.println("Press ENTER when ready!");
        scanner.nextLine();
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

    public int guess() {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    public void endOfGame(int numberOfGuesses, String opponent) {
        System.out.println("Game over.");
        System.out.println("You guessed " + opponent + "'s number in " + numberOfGuesses + " guesses.");
    }
}