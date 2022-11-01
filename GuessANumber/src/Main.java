import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IPlayer thinker = switch (chooseType("thinker")) {
            case 1 -> new HumanThinker();
            case 2 -> new ComputerThinker();
            default -> throw new IllegalStateException("Unexpected value: " + chooseType("thinker"));
        };
        IPlayer guesser = switch (chooseType("guesser")) {
            case 1 -> new HumanGuesser();
            case 2 -> new ComputerGuesser();
            case 3 -> new ComputerGuesserRandom();
            default -> throw new RuntimeException("This should never happen");
        };
        GameControl gameControl = new GameControl(1, 100);
        gameControl.runGame(thinker, guesser);
    }

    public static int chooseType(String s) {
        System.out.println("What kind of " + s + " do you want?");
        System.out.println("  1 - Human");
        System.out.println("  2 - Computer");
        if (s.equalsIgnoreCase("guesser")) {
            System.out.println("  3 - Computer (random)");
        }
        System.out.print("Enter your choice: ");
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    if (s.equalsIgnoreCase("guesser")) {
                        return 3;
                    }
                    System.out.print("Invalid choice. please try again: ");
                    break;
                default:
                    System.out.print("Invalid choice, please try again: ");
                    break;
            }
        }
    }
}