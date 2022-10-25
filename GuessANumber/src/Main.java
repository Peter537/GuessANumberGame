import java.util.Scanner;

public class Main {

    // TODO:
    //  - Use IPlayer instead of IThinker and IGuesser

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IThinker thinker = chooseType("thinker") == 1 ? new HumanThinker() : new ComputerThinker();
        IGuesser guesser = chooseType("guesser") == 1 ? new HumanGuesser() : new ComputerGuesser();
        GameControl gameControl = new GameControl(1, 100);
        gameControl.runGame(thinker, guesser);
    }

    public static int chooseType(String s) {
        System.out.println("What kind of " + s + " do you want?");
        System.out.println("  1 - Human");
        System.out.println("  2 - Computer");
        System.out.print("Enter your choice: ");
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                default:
                    System.out.print("Invalid choice, please try again: ");
                    break;
            }
        }
    }
}