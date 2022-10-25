public class HumanThinker extends AHumanPlayer implements IThinker {

    public Answer evaluateGuess(int guess, String opponent) {
        System.out.println(opponent + " guessed: " + guess);
        System.out.println("  1 - Too low");
        System.out.println("  2 - Too high");
        System.out.println("  3 - Correct");
        System.out.println("Enter your answer (1, 2 or 3): ");
        while (true) {
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    return Answer.TOO_LOW;
                case "2":
                    return Answer.TOO_HIGH;
                case "3":
                    return Answer.CORRECT;
                default:
                    System.out.print("Invalid input, please try again (1, 2 or 3): ");
                    break;
            }
        }
    }

    public boolean endOfGame(int numberOfGuesses, String opponent) {
        System.out.println("Game over.");
        System.out.println(opponent + " used " + numberOfGuesses + (numberOfGuesses == 1 ? " guess " : " guesses ")
                + "to guess your secret number.");
        return playAgain();
    }
}