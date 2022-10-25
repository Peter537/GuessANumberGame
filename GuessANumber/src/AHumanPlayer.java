import java.util.Scanner;

public abstract class AHumanPlayer {

    protected final Scanner scanner = new Scanner(System.in);
    private String name;

    public AHumanPlayer() {
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
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public void newGame(int min, int max, String opponent, String type) {
        System.out.println("A new game is about to start. You are the " + type + ".");
        System.out.println("You are playing against " + opponent + ".");
        System.out.println("The range is from " + min + " to " + max + ".");
        if (type.equals("Thinker")) {
            System.out.println("You must think of a secret number.");
        } else {
            System.out.println("You must guess " + opponent + "'s secret number.");
        }
        System.out.println("Press ENTER when you are ready.");
        scanner.nextLine();
    }
}